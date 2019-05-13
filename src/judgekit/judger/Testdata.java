package judgekit.judger;

import java.io.File;

public class Testdata {
	private Integer ID;
	private File in,out;
	
	public void setID(Integer ID) {
		this.ID=ID;
	}
	public void setStandardInputFile(File stdIn) {
		this.in=stdIn;
	}
	public void setStandardOutputFile(File stdOut) {
		this.out=stdOut;
	}
	
	public Integer getID() {
		return ID;
	}
	public File getStandardInputFile() {
		return in;
	}
	public File getStandardOutputFile() {
		return out;
	}
}
