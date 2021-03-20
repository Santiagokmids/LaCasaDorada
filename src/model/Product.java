package model;

import java.util.ArrayList;

public class Product {
	
	//Attributes
	
	private String name;
	private ArrayList<Ingredient> ingredients;
	private ProductType productType;
	private Integer price;
	private Size sizes;
	
	/**
	 * @param name
	 * @param price
	 * @param ingredients
	 * @param ingredientType
	 */
	public Product(String name, ArrayList<Ingredient> ingredients, ProductType productType, Integer price, Size sizes) {

		this.name = name;
		this.price = price;
		this.ingredients = ingredients;
		this.productType = productType;
		this.sizes = sizes; 
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

	public ProductType getIngredientType() {
		return productType;
	}

	public void setIngredientType(ProductType ingredientType) {
		this.productType = ingredientType;
	}

	public Size getSizes() {
		return sizes;
	}

	public void setSizes(Size sizes) {
		this.sizes = sizes;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}


}
