package beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ProgrammaticLifeCycle implements InitializingBean, DisposableBean {

	@Override
	public void destroy() throws Exception {
		System.out.println("Programmatic destroy Lifecycle");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Programmatic iinit Lifecycle");
	}

	
}
