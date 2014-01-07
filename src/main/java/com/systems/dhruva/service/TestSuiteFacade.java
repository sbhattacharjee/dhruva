package com.systems.dhruva.service;

import org.springframework.stereotype.Service;

import com.systems.dhruva.modal.FileUpload;

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

	public boolean buildTestSuite(FileUpload fileUpload) throws Exception;
}
