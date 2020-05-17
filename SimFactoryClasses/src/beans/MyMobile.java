package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyMobile {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("resource/spring.xml");
		ISim sim = (ISim)context.getBean("sim");
		sim.data();
	}
}
