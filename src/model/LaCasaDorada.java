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
	
	public LaCasaDorada() {
		people = new ArrayList<>();
		product = new ArrayList<>();
		productType = new ArrayList<>();
		ingredient = new ArrayList<>();
		order = new ArrayList<>();
	}
	
	
	//Gestionar personas, cliente.
	public boolean create(String name, String lastName, String id, State state, String address, String telephone, String fieldOfObservations) {
		boolean clients = true;
		
		if(!findEmploy(id)) {
			Client client = new Client(name, lastName, id, state, address, telephone, fieldOfObservations);
			people.add(client);
			
		}else {
			clients = false;
		}
		return clients;
	}
	
	public void update(String name, String lastName, String id, State state, String address, String telephone, String fieldOfObservations,int index) {
		people.get(index).setName(name);
		people.get(index).setLastName(lastName);
		people.get(index).setId(id);
		people.get(index).setState(state);
	}
	
	public boolean delete(String id){
		boolean delete = false;
		int pos = findPosition(id);
		
		if(pos != -1) {
			people.remove(pos);
			delete = true;
		}
		return delete;	
	}
	
	public boolean setState(String id) {
		boolean state = false;
		int pos = findPosition(id);
		if(pos != -1) {
			people.get(pos).setState(State.DISABLED);
			state = true;
		}
		return state;
		
	}
	
	public int findPosition(String idEmploy){
		int position = -1;
		for (int j = 0; j < people.size(); j++) {
			
			if(idEmploy.equalsIgnoreCase(people.get(j).getId())) {
				position = j;
			}
		}
		return position;
	}
	
	public boolean findEmploy(String idEmploy){
		boolean find = false;
		for (int j = 0; j < people.size(); j++) {
			
			if(idEmploy.equalsIgnoreCase(people.get(j).getId())) {
				find = true;
			}
		}
		return find;
	}
	
	public boolean loadData()  throws IOException, ClassNotFoundException{
	
		return false;
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
}
