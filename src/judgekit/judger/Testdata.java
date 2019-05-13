package judgekit.judger;

import java.io.File;

public class Testdata implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
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
