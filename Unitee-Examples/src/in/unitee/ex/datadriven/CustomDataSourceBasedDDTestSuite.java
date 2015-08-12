package in.unitee.ex.datadriven;
 
import java.util.HashMap;
import in.unitee.lib.test.DDTestSuite;
 
public class CustomDataSourceBasedDDTestSuite extends DDTestSuite{
 
	private int strToInt(Object input){
		return Integer.parseInt((String)input);
	}
	
	public void init() throws Exception{
		setDataSource(new CustomDataSource());
	}
		
	public void repeat(HashMap<String,Object> map){
		int left = strToInt(map.get("Left"));
		int right = strToInt(map.get("Right"));
		int expectedSum = strToInt(map.get("Sum"));
		checker.assertEquals(expectedSum, left+right);
	}
}