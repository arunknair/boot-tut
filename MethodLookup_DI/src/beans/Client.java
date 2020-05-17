package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
// should be concerned with the version of the jars used
// used asm.3.3.1 and cglib.2.2.2 and this is the compatible one
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("resource/spring.xml");
		System.out.println("------Car info------");
		Car c = (Car) ac.getBean("c");
		System.out.println("Car Engine : " + c.myCarEngine().getName());
		System.out.println("------Bus info------");
		Bus b = (Bus) ac.getBean("b");
		System.out.println("Bus Engine : " + b.myBusEngine().getName());
		System.out.println("------Truck info------");
		Truck t = (Truck) ac.getBean("t");
		System.out.println("Truck Engine : " + t.myTruckEngine().getName());
	}
}
