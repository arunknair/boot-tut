package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Clinet {

	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("resource/spring.xml");
		ICar car = (ICar)context.getBean("c");
		car.drive();
	}
}
