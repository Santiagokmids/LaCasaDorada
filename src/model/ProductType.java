package model;

import java.io.Serializable;

public class ProductType implements Serializable, Comparable<ProductType>{
	
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
	 * @param state 
	 * @param userModifiers 
	 */
	public ProductType(String name, Modifiers usersCreators, State state) {
		this.setUsersCreators(usersCreators);
		this.name = name;
		this.state = state;
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

	@Override
	public int compareTo(ProductType o) {
		return getName().compareTo(o.getName())*(-1);
	}
	
	
}
