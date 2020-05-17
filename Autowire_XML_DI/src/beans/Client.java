package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("resource/spring_byType.xml");
//		ApplicationContext context = new ClassPathXmlApplicationContext("resource/spring_byName.xml");
//		ApplicationContext context = new ClassPathXmlApplicationContext("resource/spring_constructor.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("resource/spring_autodetect.xml");
//		Car c = (Car)context.getBean("c");
//		c.print();
		Bus b = (Bus)context.getBean("b");
		b.print();
	}
}
