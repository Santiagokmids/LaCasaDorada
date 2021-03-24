package model;

import java.io.Serializable;
import java.util.ArrayList;

public class Product implements Serializable {

	//Attributes

	/**
	 * 
	 */
	private static final long serialVersionUID = 1;
	private String name;
	private ArrayList<Ingredient> ingredients;
	private ProductType productType;
	private Double price;
	private State state;

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
		this.state = State.ENABLE;
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

	public Modifiers getUsersCreators() {
		return usersCreators;
	}

	public void setUsersCreators(Modifiers usersCreators) {
		this.usersCreators = usersCreators;
	}

	public ProductType getProductType() {
		return productType;
	}

	public void setProductType(ProductType productType) {
		this.productType = productType;
	}

	public String getNameIngredient() {

		String message = "";

		for (int i = 0; i < ingredients.size(); i++) {

			if(i != ingredients.size()-1) {
				message += ingredients.get(i).getName()+"\n";
			}
			else {
				message += ingredients.get(i).getName();
			}
		}
		return message;
	}
	
	public String getNameType() {
		return productType.getName();
	}
	
	public String getNameSize() {
		return sizes.getSize();
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
}
