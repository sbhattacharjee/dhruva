package com.systems.dhruva.web.helper;

import java.io.File;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractExcelView;

import com.systems.dhruva.service.TestSuiteFacade;

@Component("XLSX")
public class XLSXUpload extends AbstractExcelView implements TestSuiteFacade {

	private static final Logger log = Logger.getLogger(XLSXUpload.class);
	
	@Override
	public boolean buildTestSuite(File XLSXUpload) throws Exception {
		log.debug("************************** BUILDING EXCEL 2010 TEST SUITE ****************************************");
		log.debug("******************************* END OF EXCEL BUILD ******************************************");
		
		return false;
	}

	@Override
	protected void buildExcelDocument(Map<String, Object> model,
			HSSFWorkbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
	}
}
