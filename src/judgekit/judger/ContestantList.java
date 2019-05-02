package judgekit.judger;

import java.util.Vector;

public class ContestantList {
	private Vector<Contestant> list = new Vector<Contestant>();
	
	public Vector<Contestant> getList(){
		return list;
	}
	
	public void add(Contestant prob) {
		list.addElement(prob);
	}
	public void remove(Contestant prob) {
		list.removeElement(prob);
	}
}
