package beans;

public class XMLInjectLifeCycle {

	public void myDestroy() throws Exception {
		System.out.println("XMLInjectLifeCycle destroy Lifecycle");
	}

	public void myInit() throws Exception {
		System.out.println("XMLInjectLifeCycle iinit Lifecycle");
	}

	
}
