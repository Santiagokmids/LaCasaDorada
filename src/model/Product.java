package model;

import java.util.ArrayList;

public class Product {
	
	//Attributes
	
	private String name;
	private String price;
	private ArrayList<Ingredient> ingredients;
	private ProductType productType;

	/**
	 * @param name
	 * @param price
	 * @param ingredients
	 * @param ingredientType
	 */
	public Product(String name, String price, ProductType productType) {

		this.name = name;
		this.price = price;
		ingredients = new ArrayList<>(); 
		this.productType = productType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public ArrayList<Ingredient> getIngredients() {
		return ingredients;
	}

	public void setIngredients(ArrayList<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}

	public ProductType getIngredientType() {
		return productType;
	}

	public void setIngredientType(ProductType ingredientType) {
		this.productType = ingredientType;
	}
}
