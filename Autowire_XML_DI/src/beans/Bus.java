package beans;

public class Bus {
		private Engine engine;
		
		public Bus() {
			System.out.println("Default constructor. Now setter injection happens");
		}
		
		public Bus(Engine engine) {
			System.out.println("Auto detect from constructor");
			this.engine = engine;
		}
		
		public void setEngine(Engine engine) {
			System.out.println("THiss will be called as there is a default constructor: autowire: autodetect");
			this.engine = engine;
		}
		
		public void print() {
			System.out.println("From Bus : " + engine.getModel());
		}
}
