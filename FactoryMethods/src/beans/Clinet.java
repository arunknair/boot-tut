package beans;

import java.util.Calendar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Clinet {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("resource/spring.xml");
//		Calendar cal = (Calendar)context.getBean("cal");
//		System.out.println(cal.getFirstDayOfWeek());
		Test t = (Test)context.getBean("t");
	}
}
