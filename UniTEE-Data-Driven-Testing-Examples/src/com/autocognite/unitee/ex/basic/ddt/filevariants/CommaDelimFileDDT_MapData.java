package com.autocognite.unitee.ex.basic.ddt.filevariants;

import com.autocognite.unitee.lib.ddt.DDTestSuiteForMapData;
import com.autocognite.unitee.lib.ds.MapDataRecord;
import static com.autocognite.unitee.lib.validator.Assertions.*;

public class CommaDelimFileDDT_MapData extends DDTestSuiteForMapData {

	private int strToInt(Object object) {
		return Integer.parseInt((String) object);
	}
	
	public void init() throws Exception {
		setDataSource(runConfig.getDataDir() + "/input.csv", ",");
	}
		
	public void repeat(MapDataRecord map) throws Exception {
		int left = strToInt(map.get("Left"));
		int right = strToInt(map.get("Right"));
		int expectedSum = strToInt(map.get("Sum"));
		assertEquals(expectedSum, left+right);
	}
}

