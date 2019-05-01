package judgekit.judger;

import java.io.File;
import java.util.Vector;

public class Problem {
	private String name;
	private Vector<File> testdataIn = new Vector<File>(),testdataOut = new Vector<File>();
	
	public String getName() {
		return name;
	}
	
	public void setName(String nName) {
		this.name=nName;
	}
	
	public Vector<File> getAllTestData(boolean stdOutData){
		if(stdOutData)return testdataOut;
		return testdataIn;
	}
	
	public void addTestData(boolean stdOutData,File data) {
		if(stdOutData) {
			testdataOut.addElement(data);
		}else {
			testdataIn.addElement(data);
		}
	}
	
	public void removeTestData(boolean stdOutData,File data) {
		if(stdOutData) {
			if(testdataOut.contains(data))testdataOut.removeElement(data);
		}else {
			if(testdataIn.contains(data))testdataIn.removeElement(data);
		}
	}
}
