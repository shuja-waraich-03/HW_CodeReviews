package ex2;

import java.util.HashSet;

public class Quarantine {
	private HashSet<Integer> s;
	
	public Quarantine() {
		this.num=0;
		s=new HashSet<Integer>();
	}
	
	public void quarantine(Integer id) {
		if(!s.contains(id)) {
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

