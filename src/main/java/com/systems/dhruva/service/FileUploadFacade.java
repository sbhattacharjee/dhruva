package com.systems.dhruva.service;

import org.springframework.stereotype.Service;

/**
 * 
 * @author sbhattacharjee
 *
 */

@Service
public interface FileUploadFacade {
	
	public TestSuiteFacade getTestSuite(String fileType) throws Exception;
}
