package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

public class LaCasaDorada {

	//COntants

	public final static String SAVE_PATH_FILE = "data/data.lcd";
	public final static String SEPARATOR = ";";

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

	//create client
	public boolean create(String name, String lastName, String id, State state, String address, String telephone, String fieldOfObservations) {
		boolean clients = true;
		
		if(!findPeople(id)) {
			Client client = new Client(name, lastName, id, state, address, telephone, fieldOfObservations);
			people.add(client);
			
		}else {
			clients = false;
		}
		return clients;
	}
	
	//update client
	public void update(String name, String lastName, String id, State state, String address, String telephone, String fieldOfObservations,int index) {
		people.get(index).setName(name);
		people.get(index).setLastName(lastName);
		people.get(index).setId(id);
		people.get(index).setState(state);
	}
	
	//create employee
	public boolean create(String name, String lastName, String id, State state) {
		boolean employees = true;
		
		if(!findPeople(id)) {
			Employee employee = new Employee(name, lastName, id, state);
			people.add(employee);
			
		}else {
			employees = false;
		}
		return employees;
	}
	
	//update employee
	public void update(String name, String lastName, String id, State state,int index) {
		people.get(index).setName(name);
		people.get(index).setLastName(lastName);
		people.get(index).setId(id);
		people.get(index).setState(state);
	}
	
	//create User
		public boolean create(String name, String lastName, String id, String userName, String password, State state) {
			boolean users = true;
			
			if(!findPeople(id)) {
				User user = new User(name, lastName, id, userName, password, state);
				people.add(user);
				
			}else {
				users = false;
			}
			return users;
		}
		
		//update user
		public void update(String name, String lastName, String id, String userName, String password, State state,int index) {
			people.get(index).setName(name);
			people.get(index).setLastName(lastName);
			people.get(index).setId(id);
			people.get(index).setState(state);
		}
	
	//delete people
	public boolean delete(String id){
		boolean delete = false;
		int pos = findPosition(id);
		
		if(pos != -1) {
			people.remove(pos);
			delete = true;
		}
		return delete;	
	}
	
	//change people
	public boolean setState(String id) {
		boolean state = false;
		int pos = findPosition(id);
		if(pos != -1) {
			people.get(pos).setState(State.DISABLED);
			state = true;
		}
		return state;
		
	}
	
	//create order
	public boolean create(StateOrder state, ArrayList<Integer> amount, Date date, String fieldOfObservations, Client orderClient,
			ArrayList<Product>products, Employee ordEmployee) {
		
		boolean orders = true, validation = true;
		int aleatorio = 0;
		Random r = new Random();
		String code = "";
		
		while(validation) {
			
			aleatorio = (int)(r.nextDouble() * 1000000);
			code = "LCD"+aleatorio;
			validation = findOrders(code);
			
			if(!validation) {
				Order newOrder = new Order(code, state, amount, date, fieldOfObservations, orderClient, products, ordEmployee);
				order.add(newOrder);

			}else {
				orders = false;
			}
		}
		return orders;
	}
	
	public boolean findOrders(String code){
		boolean find = false;
		
		for (int j = 0; j < order.size(); j++) {
			
			if(code.equalsIgnoreCase(order.get(j).getCode())) {
				find = true;
			}
		}
		return find;
	}

	public boolean searchUser(String userName, String password) {
		boolean find = true;  

		for(int i = 0;i < people.size();i++) {
			if(people.get(i) instanceof User) {
				User user = (User) people.get(i);

				if(user.getUserName().equals(userName) && user.getPassword().equalsIgnoreCase(password)){
					find = false;
				}
			}
		}
		return find;
	}

	public int findPosition(String idPeople){
		int position = -1;
		for (int j = 0; j < people.size(); j++) {
			
			if(idPeople.equalsIgnoreCase(people.get(j).getId())) {
				position = j;
			}
		}
		return position;
	}
	
	public boolean findPeople(String idPeople){
		boolean find = false;
		for (int j = 0; j < people.size(); j++) {
			
			if(idPeople.equalsIgnoreCase(people.get(j).getId())) {
				find = true;
			}
		}
		return find;
	}

	public void importData(String fileName) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader(fileName));
		String line = br.readLine();

		while(line != null) {

			String[] parts = line.split(SEPARATOR);
			State state = null;

			if(parts[3] == (State.ENABLE).toString()) {
				state = State.ENABLE;
			}
			else if(parts[3] == (State.DISABLED).toString()) {
				state = State.DISABLED;
			}

			create(parts[0],parts[1],parts[2],state,parts[4],parts[5],parts[6]);
			line = br.readLine();
		}

		br.close();
	}
	
	public void exportData(String fileName) throws FileNotFoundException {
		
		@SuppressWarnings("resource")
		PrintWriter pw = new PrintWriter(fileName);
		
		for (int i = 0; i < people.size(); i++) {
			
			if(people.get(i) instanceof Client) {
				
				Client client = (Client) people.get(i);
				pw.println(client.getName()+client.getLastName()+client.getId()+client.getState()+client.getAddress()+client.getTelephone()+client.getFieldOfObservations());
			}
		}
	}
	
	public void saveData() throws IOException {
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(SAVE_PATH_FILE));
		oos.writeObject(people);
		oos.close();
	}
	
	@SuppressWarnings("unchecked")
	public boolean loadData()  throws IOException, ClassNotFoundException{

		File f = new File(SAVE_PATH_FILE);
		boolean loaded = false;
		
		if(f.exists()) {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
			people = (ArrayList<People>)ois.readObject();
			ois.close();
			loaded = true;
		}
		return loaded;
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
