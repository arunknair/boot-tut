package beans;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Qualifier;

public class Car {

	@Resource
	@Qualifier(value = "e1")
	private Engine engine;
	
	public void print() {
		System.out.println("Car Engine : " + engine.getModel());
	}
}
