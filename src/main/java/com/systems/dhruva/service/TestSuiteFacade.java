package com.systems.dhruva.service;

import java.io.File;

import org.springframework.stereotype.Service;


/**
 * Abstract class to be implemented by different file upload classes.
 * The class defines method to build test suite. Individual implementing class will defines its own custom implementation to draft test suites.
 *
 * Test Suite <comprises of> collection of Test cases <comprises of> collection of Test action
 *
 * @author sbhattacharjee
 *
 */
@Service
public interface TestSuiteFacade {
	
	public boolean buildTestSuite(File fileUpload) throws Exception;
}
