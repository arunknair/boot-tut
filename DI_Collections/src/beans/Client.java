package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("resource/spring.xml");
		Dummy car = (Dummy)context.getBean("d");
		car.print();
	}
}
