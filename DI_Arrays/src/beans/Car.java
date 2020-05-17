package beans;

public class Car {
	private String[] carnames;
	private Engine[] engine;
	
	public void setCarnames(String[] carnames) {
		this.carnames = carnames;
	}
	public void setEngine(Engine[] engine) {
		this.engine = engine;
	}
	
	public void print() {
		for(String car : carnames) {
			System.out.println(car + ", ");
		}
		for(Engine eng: engine) {
			System.out.println(eng.getModel() + ", ");
		}
	}
}
