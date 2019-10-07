package co.model;

public class user {
	public String name;
	public String email;
	public String password;
	
	public user()
	{}
	
	public user(String name, String email, String password) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
	}


	@Override
	public String toString() {
		return "user [name=" + name + ", email=" + email + ", password=" + password + "]";
	}
	
	

}
