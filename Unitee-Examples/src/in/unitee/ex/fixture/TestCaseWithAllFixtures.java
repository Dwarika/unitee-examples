package in.unitee.ex.fixture;

import in.unitee.lib.test.TestCase;

public class TestCaseWithAllFixtures extends TestCase{
	public void setUpClass(){
		logger.info(getClassName() + ": Called setUpClass");
	}
	
	public void tearDownClass(){
		logger.info(getClassName() + ": Called tearDownClass");
	}

	public void run(){
		logger.info("running the test");
	}
}
