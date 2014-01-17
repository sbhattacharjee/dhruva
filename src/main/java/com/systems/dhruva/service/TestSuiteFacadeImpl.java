package com.systems.dhruva.service;

import java.util.Collection;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.systems.dhruva.modal.ActionCase;
import com.systems.dhruva.modal.FileUpload;

/**
 * Implementation of TestSuiteFacade
 *
 * @author sbhattacharjee
 *
 */
public class TestSuiteFacadeImpl implements TestSuiteFacade {

	private static final Logger log = Logger
			.getLogger(TestSuiteFacadeImpl.class);

	/*@Autowired
	private Collection<ActionCase> testCaseColl;

	public Collection<ActionCase> getTestCaseColl() {
		return testCaseColl;
	}

	public void setTestCaseColl(Collection<ActionCase> testCaseColl) {
		this.testCaseColl = testCaseColl;
	}
*/
	@Override
	public boolean buildTestSuite(FileUpload fileUpload) throws Exception {

		log.debug("***************************  Start: buildTestSuite ********************");

//		log.debug(fileUpload.getFileName());

		log.debug("*********************************** End: buildTestSuite ********************************");

		return false;
	}
}
