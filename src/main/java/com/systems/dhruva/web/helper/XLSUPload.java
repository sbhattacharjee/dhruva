package com.systems.dhruva.web.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractExcelView;

import com.systems.dhruva.common.util.ApplicationUtil;
import com.systems.dhruva.modal.ActionCase;
import com.systems.dhruva.modal.ActionStep;
import com.systems.dhruva.service.TestSuiteFacade;

/**
 * Build test suit from Excel 2001-2007 document
 * 
 * @author sbhattacharjee
 *
 */
@Component("XLS")
public class XLSUPload extends AbstractExcelView implements TestSuiteFacade{

	private static final Logger log = Logger
			.getLogger(XLSUPload.class);
	
	@Override
	protected void buildExcelDocument(Map<String, Object> model,
			HSSFWorkbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub

	}

	@Autowired
	private ActionCase actionCase;
	
	@Autowired
	private ActionStep actionStep;
	
	public final Set<ActionCase> actionCaseSet = new HashSet<ActionCase>();
	
	@Override
	public boolean buildTestSuite(File XLSFile) throws Exception {
		log.debug("************************** BUILDING EXCEL 2001-2007 TEST SUITE ****************************************");
		 
		boolean isBuildSuccess = false;
		
		try{
			FileInputStream fileInputStream = ApplicationUtil.getFileInputStream(XLSFile);
			
			//Get the workbook instance for XLS file 
		    HSSFWorkbook workbook = new HSSFWorkbook(fileInputStream);
		    
		    Integer totalSheets = workbook.getNumberOfSheets();
		   
		    log.debug("Total test cases to be buit ==>"+totalSheets);
		    
		    int sheetCounter = 0;
		    while (sheetCounter < totalSheets){
		    	HSSFSheet sheet = workbook.getSheetAt(sheetCounter);
		    	
		    	//Get iterator to all the rows in current sheet
		    	Iterator<Row> rowIterator = sheet.iterator();
		    	 
		    	while(rowIterator.hasNext()){
		    		
		    		Row row = rowIterator.next();
		    		
		    		log.debug("Reading row number ==>"+row.getRowNum());
		    		
		    	/*	if (row.getRowNum() != 0){
		    			
				    	//retrieved first 6 cells - populate in ActionCase
		    			
		    			if( row.getCell(0) != null )
		    				actionCase.setDefectTool(row.getCell(0).getStringCellValue());
		    				
		    			if( row.getCell(1) != null )	
		    				actionCase.setReportedBy(row.getCell(1).getStringCellValue());
		    				
		    			if( row.getCell(2) != null )	
		    				actionCase.setAssignedTo(row.getCell(2).getStringCellValue());
		    			
		    			if( row.getCell(3) != null )
		    				actionCase.setBrowser(row.getCell(3).getStringCellValue());
			    		
		    			if( row.getCell(4) != null )
		    				actionCase.setBrowserVersion(row.getCell(4).getStringCellValue());
			    		
		    			if( row.getCell(5) != null )
		    				actionCase.setSiteURL(new URL(row.getCell(5).getStringCellValue()));
			    		
			    		//Setting current cell to index=5
			    		row.getCell(5).setAsActiveCell();

				    	Iterator<Cell> cellIterator = row.cellIterator();
				    	Collection<ActionStep> actionStepColls = new ArrayList<ActionStep>();
				    	
				    	while(cellIterator.hasNext()){
				    		Cell cell = cellIterator.next();
				    		
				    		log.debug("Active cell index ==>"+cell.getColumnIndex());
				    		
				    		if( row.getCell( cell.getColumnIndex() ) != null )
				    			actionStep.setCommand( row.getCell( cell.getColumnIndex() ).getStringCellValue() );
				    		
			    			if( row.getCell( cell.getColumnIndex() + 1 ) != null )
			    				actionStep.setSelectorType( row.getCell( cell.getColumnIndex() + 1 ).getStringCellValue() );
			    			
			    			if( row.getCell( cell.getColumnIndex() + 2 ) != null )
			    				actionStep.setTargetLocator( row.getCell( cell.getColumnIndex() + 2).getStringCellValue() );
				    		
			    			if( row.getCell( cell.getColumnIndex() + 3 ) != null )
			    				actionStep.setAssertValue( row.getCell( cell.getColumnIndex() + 3 ).getStringCellValue() );
				    		
			    			log.debug("Adding ActionStep to Collections :: properties ==>"+actionStep.toString());
			    			actionStepColls.add(actionStep);
			    			
				    		row.getCell( cell.getColumnIndex() + 3 ).setAsActiveCell();
				    		
				    	}
			    		
				    	log.debug("Adding ActionCase to Set :: properties ==>"+actionCase.toString() );
				    	actionCase.setActionStepColl(actionStepColls);
//			    		Integer rowColIndex = ApplicationUtil.getNextColIndex(6);
		    		} */
		    		
		    		actionCaseSet.add(actionCase);
		    	}
		    	
		    	sheetCounter++;		    	
		    }
		    	
		}
		catch(FileNotFoundException fnfexp){
			log.error("File not found exception ==>"+fnfexp.getMessage());
			throw fnfexp;
		}
		catch(IOException ioexp){
			log.error("IOException ==>"+ioexp.getMessage());
		}
		
		log.debug("******************************* END OF EXCEL BUILD ******************************************");
		return isBuildSuccess;
	}
}
