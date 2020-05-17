package beans;

public class SimFactory {

	private static String sim;
	
	public static void setSim(String sim) {
		SimFactory.sim = sim;
	}
	
	public static ISim getSim() throws Exception {
		return (ISim)Class.forName(sim).newInstance();
	}
}
