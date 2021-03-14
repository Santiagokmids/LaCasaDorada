package model;

public class User extends Employee {
	
	//Attributes
		private String userName;
		private String password; 
		
	public User(String name, String lastName, String id, String userName, String password, State state) {
		super(name, lastName, id, state);
		this.userName = userName;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
