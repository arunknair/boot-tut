package beans;

import javax.annotation.Resource;
import javax.inject.Inject;

public class Car {

	@Inject
	private Engine engine;
	
	public void print() {
		System.out.println("Car Engine : " + engine.getModel());
	}
}
