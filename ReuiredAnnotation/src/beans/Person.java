package beans;

import org.springframework.beans.factory.annotation.Required;

public class Person {
	private String name;
	private String email;
	private String[] hobbies;
	
	public void setName(String name) {
		this.name = name;
	}
	@Required
	public void setEmail(String email) {
		this.email = email;
	}
	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}
	
	public void print() {
		System.out.println("Name  : " + name);
		System.out.println("Email : " + email);
		System.out.println("Hobbies : ");
		for(String h: hobbies) {
			System.out.println(h + ",");
		}
	}
	
}
