package ex2;

import java.util.HashSet;

public class Quarantine {
	private HashSet<Integer> s; //use of HashSet is good as it provides O(1) time complexity for add, remove and contains operations
	
	public Quarantine() {
		this.num=0; //this is not being used anywhere and is redundant as we would need a map to store the ID number of people being quarantined
		s=new HashSet<Integer>();
	}
	
	public void quarantine(Integer id) {
		if(!s.contains(id)) { //we do not need to check for contains as add method of HashSet does not add duplicate elements
			s.add(id);
		}
	}
	
	public int getNumQuarantined() {
		return s.size();
	}
	
	public boolean isQuarantined(Integer id) {
		return s.contains(id);
	}
}

