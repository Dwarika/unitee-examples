package com.autocognite.unitee.ex.basic.fixture;

import com.autocognite.unitee.lib.test.TestMethodSuite;
import static com.autocognite.unitee.lib.validator.Assertions.*;

public class TestMethodSuiteWithAllFixtures extends TestMethodSuite{
	public void setUpClass(){
		logger.info(getClassName() + ": Called setUpClass");
	}
	
	public void setUp(){
		logger.info(getClassName() + ": Called setUp");
	}
	
	public void tearDown(){
		logger.info(getClassName() + ": Called tearDown");
	}
	
	public void tearDownClass(){
		logger.info(getClassName() + ": Called tearDownClass");
	}

	public void testMethod1() throws Exception{
		logger.info(getClassName() + ": Called testMethod 1");
		assertEquals(1,1);
	}
	
	public void testMethod2() throws Exception{
		logger.info(getClassName() + ": Called testMethod 2");
		assertEquals(3,4);
	}
}
