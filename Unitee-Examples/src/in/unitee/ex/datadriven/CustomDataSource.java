package in.unitee.ex.datadriven;


import java.util.HashMap;
import in.unitee.lib.exceptions.DataSourceFinishedException;
import in.unitee.lib.is.IDataSource;

public class CustomDataSource implements IDataSource {
	private Object[][] data={{"1","2","3"},{"4","5","70"},{"7","8","Wrong"}};
	private int currentIndex = 0;

	public HashMap<String, Object> next() throws Exception {
		if (currentIndex == data.length){
			throw new DataSourceFinishedException("I'm done!");
		}else{
			HashMap<String, Object> dataRecord = new HashMap<String, Object>();
			dataRecord.put("Left", data[currentIndex][0]);
			dataRecord.put("Right", data[currentIndex][1]);
			dataRecord.put("Sum", data[currentIndex][2]);
			currentIndex += 1;
			return dataRecord;
		}
	}
}
