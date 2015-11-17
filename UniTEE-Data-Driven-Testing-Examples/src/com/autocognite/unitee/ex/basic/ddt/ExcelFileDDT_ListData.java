package com.autocognite.unitee.ex.basic.ddt;

import com.autocognite.unitee.lib.ddt.DDTestSuiteForListData;
import com.autocognite.unitee.lib.ddt.DDTestSuiteForMapData;
import com.autocognite.unitee.lib.ds.ListDataRecord;
import com.autocognite.unitee.lib.ds.MapDataRecord;

import static com.autocognite.unitee.lib.validator.Assertions.*;

public class ExcelFileDDT_ListData extends DDTestSuiteForListData {

	private int strToInt(Object object) {
		return Integer.parseInt((String) object);
	}
	
	public void init() throws Exception {
		setDataSource(runConfig.getDataDir() + "/input.xls");
	}
		
	public void repeat(ListDataRecord record) throws Exception {
		int left = strToInt(record.get(0));
		int right = strToInt(record.get(1));
		int expectedSum = strToInt(record.get(2));
		assertEquals(expectedSum, left+right);
	}
}

