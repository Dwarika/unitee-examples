package com.autocognite.unitee.ex.basic.ddt;

import com.autocognite.unitee.lib.ddt.DDTestSuiteForFlatListData;

import static com.autocognite.unitee.lib.validator.Assertions.*;

public class ExcelFileDDT_FlatListData extends DDTestSuiteForFlatListData{

	private int strToInt(Object object) {
		return Integer.parseInt((String) object);
	}
	
	public void init() throws Exception {
		setDataSource(runConfig.getDataDir() + "/input.xls");
	}
		
	public void repeat(String leftOp, String rightOp, String expectedSum) throws Exception{
		int l = strToInt(leftOp);
		int r = strToInt(rightOp);
		int es = strToInt(expectedSum);
		assertEquals(es, l + r);
	}
}

