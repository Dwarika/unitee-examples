package in.unitee.ex.basic;

import com.autocognite.unitee.core.test.style.TestMethodSuite;

import static com.autocognite.unitee.core.validator.assertion.Assertions.*;

public class SimpleTestMethodSuite extends TestMethodSuite{

	public void testMethodPass() throws Exception{	
		assertEquals(1,1);
	}
	
	public void testMethodFail() throws Exception{
		
		assertEquals(1,2);
	}
	
	public void testMethodError() throws Exception{
		error();
	}

}
