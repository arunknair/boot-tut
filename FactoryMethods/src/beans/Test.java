package beans;

public class Test {
	private static Test test;
	private Test() {
		System.out.println("Test created!!!");
	}
	
	public static Test getTest() {
		if(test == null) {
			test = new Test();
		}
		return test;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
}
