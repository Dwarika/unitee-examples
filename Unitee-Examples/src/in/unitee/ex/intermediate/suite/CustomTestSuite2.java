package in.unitee.ex.intermediate.suite;

import com.autocognite.unitee.core.test.style.TestSuite;

import in.unitee.ex.basic.SimpleTestMethodSuite;
import in.unitee.ex.basic.ddt.TabDelimFileDDTestSuite;

public class CustomTestSuite2 extends TestSuite{

	public void init(){
		add(new SimpleTestMethodSuite());
		add(new TabDelimFileDDTestSuite());
	}
}
