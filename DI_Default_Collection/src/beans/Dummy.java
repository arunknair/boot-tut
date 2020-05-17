package beans;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Dummy {
	private List fruits;
	private Set cricketers;
	private Map cCaps;
	
	public void setFruits(List fruits) {
		this.fruits = fruits;
	}
	public void setCricketers(Set cricketers) {
		this.cricketers = cricketers;
	}
	public void setcCaps(Map cCaps) {
		this.cCaps = cCaps;
	}
	
	public void print() {
		System.out.println("Fruits****************");
		for(Object fruit: fruits) {
			System.out.println(fruit);
		}
		System.out.println("Cricketers****************");
		for(Object crik: cricketers) {
			System.out.println(crik);
		}
		System.out.println("Capitals****************");
		Set keys = cCaps.entrySet();
		for(Object key: keys) {
			System.out.println(key);
		}
	}
}
