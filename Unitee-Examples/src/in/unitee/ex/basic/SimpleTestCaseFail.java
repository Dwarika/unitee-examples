package in.unitee.ex.basic;

import in.unitee.lib.test.TestCase;

public class SimpleTestCaseFail extends TestCase{
	
	public void run(){
		
		checker.assertEquals(1,2);
	}
}
