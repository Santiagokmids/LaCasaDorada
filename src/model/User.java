package model;

public class User extends Employee {

	//Attributes
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1;
	private String userName;
	private String password; 

	public User(String name, String lastName, String id, String userName, String password, Modifiers usersModifiers) {
		super(name, lastName, id, usersModifiers);
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
