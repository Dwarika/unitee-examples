package com.autocognite.unitee.ex.basic.test;

import com.autocognite.unitee.lib.test.TestMethodSuite;
import static com.autocognite.unitee.lib.validator.Assertions.*;

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
