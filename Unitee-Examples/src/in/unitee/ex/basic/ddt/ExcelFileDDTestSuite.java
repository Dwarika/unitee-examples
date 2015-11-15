package in.unitee.ex.basic.ddt;

import com.autocognite.unitee.ddt.style.DDTestSuiteForMapData;
import com.autocognite.unitee.facility.datasource.record.MapDataRecord;

import static com.autocognite.unitee.core.validator.assertion.Assertions.*;

public class ExcelFileDDTestSuite extends DDTestSuiteForMapData{

	private int strToInt(Object input){
		return Integer.parseInt((String)input);
	}
	
	public void init() throws Exception{
		setDataSource(this.getRunConfiguration().getStringPropValue("runner.data.directory") + "/input.xls");
	}
		
	public void repeat(MapDataRecord map) throws Exception{
		int left = strToInt(map.get("Left"));
		int right = strToInt(map.get("Right"));
		int expectedSum = strToInt(map.get("Sum"));
		assertEquals(expectedSum, left+right);
	}
}
