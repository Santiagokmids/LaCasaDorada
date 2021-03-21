package model;

import java.util.ArrayList;

public class Product {
	
	//Attributes
	
	private String name;
	private ArrayList<Ingredient> ingredients;
	private ProductType productType;
	private Double price;
	
	//Relations
	private Size sizes;
	private Modifiers usersCreators;
	
	/**
	 * @param name
	 * @param price
	 * @param ingredients
	 * @param usersCreators 
	 * @param ingredientType
	 */
	public Product(String name, ArrayList<Ingredient> ingredients, ProductType productType, Size sizes, double price, Modifiers usersCreators) {

		this.name = name;
		this.ingredients = ingredients;
		this.productType = productType;
		this.sizes = sizes; 
		this.price = price;
		this.usersCreators = usersCreators;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Ingredient> getIngredients() {
		return ingredients;
	}

	public void setIngredients(ArrayList<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}

	public Size getSizes() {
		return sizes;
	}

	public void setSizes(Size sizes) {
		this.sizes = sizes;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

<<<<<<< HEAD
	public Modifiers getUsersCreators() {
		return usersCreators;
	}

	public void setUsersCreators(Modifiers usersCreators) {
		this.usersCreators = usersCreators;
	}

=======
	public ProductType getProductType() {
		return productType;
	}
>>>>>>> 825e66622e601fd7aebc055676ed43cd4e8463d5

	public void setProductType(ProductType productType) {
		this.productType = productType;
	}
}
