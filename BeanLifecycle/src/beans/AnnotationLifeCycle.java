package beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class AnnotationLifeCycle {

	@PostConstruct
	public void before() {
		System.out.println("AnnotationLifeCycle init Lifecycle");
	}
	@PreDestroy
	public void after() {
		System.out.println("AnnotationLifeCycle destroy Lifecycle");
	}
}


