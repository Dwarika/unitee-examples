package in.unitee.ex.basic.fixture;

import static com.autocognite.unitee.core.validator.assertion.Assertions.*;

import com.autocognite.unitee.core.test.style.TestCase;
import com.autocognite.unitee.core.validator.exceptions.UniteeAssertionException;

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
