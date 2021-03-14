package model;

import java.util.ArrayList;

public class Product {
	
	//Attributes
	
	private String name;
	private String price;
	
	//Relations
	
	private ArrayList<Ingredient> ingredients;
	private ProductType ingredientType;
	
	/**
	 * @param name
	 * @param price
	 * @param ingredients
	 * @param ingredientType
	 */
	public Product(String name, String price, ProductType ingredientType) {

		this.name = name;
		this.price = price;
		ingredients = new ArrayList<>(); 
		this.ingredientType = ingredientType;
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
		return ingredientType;
	}

	public void setIngredientType(ProductType ingredientType) {
		this.ingredientType = ingredientType;
	}
}
