package beans;

public class Connection {

	private String username;
	private String password;
	private String url;
	
	public void setUrl(String url) {
		this.url = url;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public void print() {
		System.out.println("User : " + username);
		System.out.println("Pass : " + password);
		System.out.println("URL  : " + url);
	}
}
