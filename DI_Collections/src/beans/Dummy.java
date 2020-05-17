package beans;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class Dummy {
	private Vector fruits;
	private TreeSet cricketers;
	private Hashtable cCaps;
	private Properties properties;

	public void setFruits(Vector fruits) {
		this.fruits = fruits;
	}
	public void setCricketers(TreeSet cricketers) {
		this.cricketers = cricketers;
	}
	public void setcCaps(Hashtable cCaps) {
		this.cCaps = cCaps;
	}
	
	public void setProperties(Properties properties) {
		this.properties = properties;
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
		System.out.println("Properties**************");
		for(Object prop: properties.entrySet()) {
			System.out.println(prop);
		}
	}
}
