package judgekit.judger;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Contest implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	
	private String path;
	private Map<String,Problem> problems = new HashMap<String,Problem>();
	private Map<String,Contestant>contestants = new HashMap<String,Contestant>();
	
	public Contest(String nPath){
		this.path=nPath;
	}
	public Contest(){
		path=null;
	}
	
	public String getPath() {
		return path;
	}
	public ProblemList getProblemList() {
		ProblemList list = new ProblemList();
		Iterator<Map.Entry<String,Problem>> entry = problems.entrySet().iterator();
		while(entry.hasNext()) {
			list.add(entry.next().getValue());
		}
		return list;
	}
	public ProblemList getProblemList(String[] keys) {
		ProblemList list = new ProblemList();
		for(int i=0;i<keys.length;i++) {
			if(problems.containsKey(keys[i])) {
				list.add(problems.get(keys[i]));
			}
		}
		return list;
	}
	
	public void setPath(String nPath) {
		this.path=nPath;
	}
	
	public void addProblem(Problem prob) {
		problems.put(prob.getName(),prob);
	}
	public void addContestant(Contestant cont) {
		contestants.put(cont.getName(),cont);
	}
	
	public void removeProblem(String key) {
		if(problems.containsKey(key))problems.remove(key);
	}
	public void removeProblem(Problem prob) {
		if(problems.containsKey(prob.getName()))problems.remove(prob.getName());
	}
	public void removeContestant(String key) {
		if(contestants.containsKey(key))contestants.remove(key);
	}
	public void removeContestant(Contestant cont) {
		if(contestants.containsKey(cont.getName()))contestants.remove(cont.getName());
	}
	
	public static Contest init(String cPath) {
		try {
			ObjectInputStream inStream = new ObjectInputStream(new FileInputStream(cPath+"Contest.jk"));
			Contest cont = (Contest)inStream.readObject();
			inStream.close();
			return cont;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public static void save(Contest obj) {
		try {
			ObjectOutputStream saveStream = new ObjectOutputStream(new FileOutputStream(obj.getPath()+"Contest.jk",false));
			saveStream.writeObject(obj);
			saveStream.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

