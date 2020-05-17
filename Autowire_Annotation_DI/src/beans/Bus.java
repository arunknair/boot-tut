package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Bus {
		@Qualifier(value = "e1")
		@Autowired
		private Engine engine;
		
		public void print() {
			System.out.println("From Bus : " + engine.getModel());
		}
		public Bus() {
		System.out.println("++++ " + engine);
		}
}
