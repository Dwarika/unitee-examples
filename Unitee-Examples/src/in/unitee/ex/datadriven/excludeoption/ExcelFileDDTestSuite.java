package in.unitee.ex.datadriven.excludeoption;

import java.util.HashMap;

import in.unitee.Unitee;
import in.unitee.lib.test.DDTestSuite;

public class ExcelFileDDTestSuite extends DDTestSuite{
	
	private int strToInt(Object input){
		return Integer.parseInt((String)input);
	}
	
	public void init() throws Exception{
		setDataSource(Unitee.getDataDir() + "/input_exclude_option.xls");
	}
		
	public void repeat(HashMap<String,Object> map){
		int left = strToInt(map.get("Left"));
		int right = strToInt(map.get("Right"));
		int expectedSum = strToInt(map.get("Sum"));
		checker.assertEquals(expectedSum, left+right);
	}
}

