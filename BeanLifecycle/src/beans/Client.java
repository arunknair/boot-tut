package beans;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ConfigurableApplicationContext cap = new ClassPathXmlApplicationContext("resource/spring.xml");
//		ProgrammaticLifeCycle t = (ProgrammaticLifeCycle)cap.getBean("pt");
//		XMLInjectLifeCycle xt = (XMLInjectLifeCycle)cap.getBean("xt");
		AnnotationLifeCycle at = (AnnotationLifeCycle) cap.getBean("at");
		cap.close();
	}
}
