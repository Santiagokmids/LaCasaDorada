package model;

import java.util.ArrayList;

public class Product {
	
	//Attributes
	
	private String name;
	private ArrayList<Ingredient> ingredients;
	private ProductType productType;
	
	//Relations
	private ArrayList<Size>sizes;
	
	/**
	 * @param name
	 * @param price
	 * @param ingredients
	 * @param ingredientType
	 */
	public Product(String name, ProductType productType) {

		this.name = name;
		ingredients = new ArrayList<>(); 
		this.productType = productType;
		sizes = new ArrayList<>(); 
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

	public ArrayList<Size> getSizes() {
		return sizes;
	}

	public void setSizes(ArrayList<Size> sizes) {
		this.sizes = sizes;
	}
}
