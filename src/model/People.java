package model;

import java.io.Serializable;

public abstract class People implements Serializable{
	
	//Attributes
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1;
	private String name;
	private String lastName;
	private String id;
	private State state;
	
	//Relations
	private Modifiers usersCreators;
	
	public People(String name, String lastName, String id, State state, Modifiers usersCreators) {
		this.name = name;
		this.lastName = lastName;
		this.id = id;
		this.state = state;
		this.usersCreators = usersCreators;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String toString() {
		String message = "";
		
		return message;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public Modifiers getUsersCreators() {
		return usersCreators;
	}

	public void setUsersCreators(Modifiers usersCreators) {
		this.usersCreators = usersCreators;
	}
	
	
	
}
