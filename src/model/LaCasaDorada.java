package model;

import java.util.ArrayList;
import java.io.IOException;

public class LaCasaDorada {
	
	//Relations
	private ArrayList<People> people;
	private ArrayList<Product> product;
	private ArrayList<ProductType> productType;
	private ArrayList<Ingredient> ingredient;
	private ArrayList<Order> order;
	
	public LaCasaDorada(ArrayList<People> people, ArrayList<Product> product, ArrayList<ProductType> productType,
			ArrayList<Ingredient> ingredient, ArrayList<Order> order) {
		people = new ArrayList<>();
		product = new ArrayList<>();
		productType = new ArrayList<>();
		ingredient = new ArrayList<>();
		order = new ArrayList<>();
	}

	public ArrayList<People> getPeople() {
		return people;
	}

	public void setPeople(ArrayList<People> people) {
		this.people = people;
	}

	public ArrayList<Product> getProduct() {
		return product;
	}

	public void setProduct(ArrayList<Product> product) {
		this.product = product;
	}

	public ArrayList<ProductType> getProductType() {
		return productType;
	}

	public void setProductType(ArrayList<ProductType> productType) {
		this.productType = productType;
	}

	public ArrayList<Ingredient> getIngredient() {
		return ingredient;
	}

	public void setIngredient(ArrayList<Ingredient> ingredient) {
		this.ingredient = ingredient;
	}

	public ArrayList<Order> getOrder() {
		return order;
	}

	public void setOrder(ArrayList<Order> order) {
		this.order = order;
	}
	
	//Gestionar personas, cliente
	public void create(String name, String lastName, String id, State state, String address, String telephone, String fieldOfObservations) {
		
	}
	
	
	
	
	public boolean loadData()  throws IOException, ClassNotFoundException{
	
		return false;
	}

}
