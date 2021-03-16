package model;

public class Ingredient {
	
	//Attributes
	
	private String name;

	/**
	 * <b>name: <>
	 * @param name
	 */
	public Ingredient(String name) {
		
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
