package in.unitee.ex.basic;

import in.unitee.lib.test.TestMethodSuite;

public class SimpleTestMethodSuite extends TestMethodSuite{

	public void testMethodPass(){
		
		checker.assertEquals(1,1);
	}
	
	public void testMethodFail(){
		
		checker.assertEquals(1,2);
	}
	
	public void testMethodError() throws Exception{
		checker.error();
	}

}
