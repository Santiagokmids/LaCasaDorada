package model;

import java.io.Serializable;

public class ProductType implements Serializable{
	
	//Attributes
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1;
	private String name;
	private State state;
	
	//Relations
	private Modifiers usersCreators;

	/**
	 * @param name
	 * @param userModifiers 
	 */
	public ProductType(String name, Modifiers usersCreators) {
		this.setUsersCreators(usersCreators);
		this.name = name;
		setState(State.ENABLE);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Modifiers getUsersCreators() {
		return usersCreators;
	}

	public void setUsersCreators(Modifiers usersCreators) {
		this.usersCreators = usersCreators;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
}
