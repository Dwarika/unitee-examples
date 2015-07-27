package in.unitee.ex.fixture;

import in.unitee.lib.test.TestMethodSuite;

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

	public void testMethod1(){
		logger.info(getClassName() + ": Called testMethod 1");
	}
	
	public void testMethod2(){
		logger.info(getClassName() + ": Called testMethod 2");
	}
	
	public void testMethod3() throws Exception{
		logger.info(getClassName() + ": Called testMethod 3");
	}

}
