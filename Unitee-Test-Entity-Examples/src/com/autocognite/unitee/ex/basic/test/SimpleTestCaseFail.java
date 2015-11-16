package com.autocognite.unitee.ex.basic.test;

import com.autocognite.unitee.lib.test.TestCase;
import static com.autocognite.unitee.lib.validator.Assertions.*;

public class SimpleTestCaseFail extends TestCase{
	
	public void run() throws Exception{
		assertEquals(1,2);
	}
}
