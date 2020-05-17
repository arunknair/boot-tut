package beans;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class Car {
	@Inject
	private Engine engine;
	
	public void print() {
		System.out.println("Car Engine Name : " + engine.getModel());
	}
}
