package in.unitee.ex.basic;

import com.autocognite.unitee.core.test.style.TestCase;
import com.autocognite.unitee.core.validator.exceptions.UniteeAssertionException;

import static com.autocognite.unitee.core.validator.assertion.Assertions.*;

public class SimpleTestCaseFail extends TestCase{
	
	public void run() throws Exception{
		assertEquals(1,2);
	}
}
