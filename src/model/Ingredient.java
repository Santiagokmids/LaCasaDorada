package model;

public class Ingredient {
	
	//Attributes
	
	private String name;
	private State state;

	/**
	 * <b>name: <>
	 * @param name
	 */
	
	//Relations
	private Modifiers usersCreators;
	
	public Ingredient(String name, Modifiers usersCreators, State state) {
		this.usersCreators = usersCreators;
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
}
