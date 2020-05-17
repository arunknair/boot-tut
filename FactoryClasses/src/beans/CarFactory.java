package beans;

public class CarFactory {

	public CarFactory(String cname) {
		CarFactory.cname = cname;
	}

	private static String cname;

	public static void setCname(String cname) {
		CarFactory.cname = cname;
	}

	public static ICar getCar() throws Exception {
		Class c = Class.forName(cname);
		return (ICar) c.newInstance();
	}
	public void print() {
		System.out.println("cname : " + cname);
	}
}
