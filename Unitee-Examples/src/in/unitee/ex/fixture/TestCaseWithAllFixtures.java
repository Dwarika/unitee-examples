package in.unitee.ex.fixture;

import in.unitee.lib.test.TestCase;

public class TestCaseWithAllFixtures extends TestCase{
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

	public void run(){
		logger.info("running the test");
	}
}
