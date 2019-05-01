package judgekit.judger;

import java.util.Vector;

public class ProblemList {
	private Vector<Problem> list = new Vector<Problem>();
	
	public Vector<Problem> getList(){
		return list;
	}
	
	public void add(Problem prob) {
		list.addElement(prob);
	}
	public void remove(Problem prob) {
		list.removeElement(prob);
	}
}
