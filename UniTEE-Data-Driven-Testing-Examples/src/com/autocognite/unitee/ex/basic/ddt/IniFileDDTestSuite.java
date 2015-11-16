package com.autocognite.unitee.ex.basic.ddt;

import com.autocognite.unitee.lib.ddt.DDTestSuiteForMapData;
import com.autocognite.unitee.lib.ds.MapDataRecord;
import static com.autocognite.unitee.lib.validator.Assertions.*;

public class IniFileDDTestSuite extends DDTestSuiteForMapData{

	private int strToInt(Object input){
		return Integer.parseInt((String)input);
	}
	
	public void init() throws Exception{
		setDataSource(this.getRunConfiguration().getStringPropValue("runner.data.directory") + "/input.ini");
	}
		
	public void repeat(MapDataRecord map) throws Exception{
		int left = strToInt(map.get("Left"));
		int right = strToInt(map.get("Right"));
		int expectedSum = strToInt(map.get("Sum"));
		assertEquals(expectedSum, left+right);
	}
}

