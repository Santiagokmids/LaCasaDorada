package model;

public class ProductType {
	
	//Attributes
	
	private String name;
	
	//Relations
	private Modifiers usersCreators;

	/**
	 * @param name
	 * @param userModifiers 
	 */
	public ProductType(String name, Modifiers usersCreators) {
		this.setUsersCreators(usersCreators);
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
