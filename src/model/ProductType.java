package model;

public class ProductType {
	
	//Attributes
	
	private String name;

	/**
	 * @param name
	 */
	public ProductType(String name) {
		
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
