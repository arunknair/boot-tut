package beans;

public class Car {
	private static String name;
	
	public static void setName(String name) {
		Car.name = name;
	}
	
	public void print() {
		System.out.println("Name : " + name);
	}
}
