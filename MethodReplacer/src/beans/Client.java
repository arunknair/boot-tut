package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("resource/spring.xml");
		Bank b = (Bank)ap.getBean("b");
		b.deposit();
		b.withdraw();
		b.calcInt();
	}
}
