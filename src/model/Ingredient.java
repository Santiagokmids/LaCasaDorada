package model;

public class Ingredient {
	
	//Attributes
	
	private String name;

	/**
	 * <b>name: <>
	 * @param name
	 */
	
	//Relations
	private Modifiers usersCreators;
	
	public Ingredient(String name, Modifiers usersCreators) {
		this.usersCreators = usersCreators;
		this.name = name;
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
}
