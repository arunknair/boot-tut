package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Clinet {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("resource/spring.xml");
		Person p = (Person)context.getBean("p");
		p.print();
	}
}
