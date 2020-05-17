package beans;

public class Car {
	private String name;
	private String wheels;
	private String lights;
	private Engine engine;

	public Car() {
		System.out.println("default");
	}
	
	public Car(String name) {
		System.out.println("with name : " + name);
	}
	
	public Car(Engine engine) {
		System.out.println("with Engine : " + engine.getModel());
	}
	
	public Car(String name, Engine engine) {
		System.out.println("with name : " + name + " and engine : " + engine.getModel());
	}
}