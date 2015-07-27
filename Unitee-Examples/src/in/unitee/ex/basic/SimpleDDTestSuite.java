package in.unitee.ex.basic;

import java.util.HashMap;

import in.unitee.Unitee;
import in.unitee.lib.test.DDTestSuite;

public class SimpleDDTestSuite extends DDTestSuite{
	
	private int strToInt(String input){
		return Integer.parseInt(input);
	}
	
	public void init(){
		setDataFile(Unitee.getDataDir() + "/input.txt");
	}
		
	public void repeat(HashMap<String,String> map){
		int left = strToInt(map.get("Left"));
		int right = strToInt(map.get("Right"));
		int expectedSum = strToInt(map.get("Sum"));
		checker.assertEquals(expectedSum, left+right);
	}
}

