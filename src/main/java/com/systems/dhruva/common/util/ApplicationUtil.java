package com.systems.dhruva.common.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.log4j.Logger;


/**
 * Common utility methods
 * 
 * @author sbhattacharjee
 *
 */
public class ApplicationUtil {

	private static final Logger log = Logger.getLogger(ApplicationUtil.class);
	
	public static String getFileExtn(String fileName) throws Exception{
		String fileExtn = null;
		int beginIndex = 0; 
		try{
			beginIndex = fileName.indexOf(".");
			fileExtn = fileName.substring(beginIndex+1);
			log.debug("fileExtn ==>"+fileExtn.toUpperCase());
		}
		catch(Exception exp){
			log.error("Exception in retrieving file extension :: "+exp.getMessage());
			throw exp;
		}
		
		return fileExtn.toUpperCase();
	}
	
	public static FileInputStream getFileInputStream(File file) throws Exception{
		
		FileInputStream fileInputStream = null;
		try{
			fileInputStream = new FileInputStream(file);
		}
		catch(FileNotFoundException fnfexp){
			log.error("File not found exception ==>"+fnfexp.getMessage());
			throw fnfexp;
		}
		
		return fileInputStream;
	}
	
	public static Integer getNextColIndex(Integer currentColIndex){
		return (currentColIndex + 4); 
	}
	
	
	
}
