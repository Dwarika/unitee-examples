package com.autocognite.unitee.ex.basic.fixture;

import com.autocognite.unitee.lib.test.TestCase;
import static com.autocognite.unitee.lib.validator.Assertions.*;

public class TestCaseWithAllFixtures extends TestCase{
	public void setUpClass(){
		logger.info(getClassName() + ": Called setUpClass");
	}
	
	public void tearDownClass(){
		logger.info(getClassName() + ": Called tearDownClass");
	}

	public void run() throws Exception{
		logger.info("running the test");
		assertEquals(1,1);
	}
}
