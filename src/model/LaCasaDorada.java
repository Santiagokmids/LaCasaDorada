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

	//Constants

	public final static String SAVE_PATH_FILE = "data/data.lcd";
	public final static String SEPARATOR = ";";

	//Relations

	private ArrayList<People> people;
	private ArrayList<Product> product;
	private ArrayList<ProductType> productType;
	private ArrayList<Ingredient> ingredient;
	private ArrayList<Order> order;
	private ArrayList<PreOrder> preorder;
	private ArrayList<Size> sizes;

	public LaCasaDorada() {
		people = new ArrayList<>();
		product = new ArrayList<>();
		productType = new ArrayList<>();
		ingredient = new ArrayList<>();
		order = new ArrayList<>();
		sizes = new ArrayList<>();
		setPreorder(new ArrayList<>());
	}

	//create client
	public void create(String name, String lastName, String id, State state, String address, String telephone, String fieldObservations,
			Modifiers modifiers) {

		Client client = new Client(name, lastName, id, state, address, telephone, fieldObservations, modifiers);
		people.add(client);
	}

	//update client
	public void update(String name, String lastName, String id, State state, String address, String telephone, String fieldOfObservations,int index) {
		people.get(index).setName(name);
		people.get(index).setLastName(lastName);
		people.get(index).setId(id);
		people.get(index).setState(state);
	}

	//create employee
	public void create(String name, String lastName, String id, State state, Modifiers usersModifiers) {

		Employee employee = new Employee(name, lastName, id, state, usersModifiers);
		people.add(employee);
	}

	//update employee
	public void update(String name, String lastName, String id, State state,int index) {
		people.get(index).setName(name);
		people.get(index).setLastName(lastName);
		people.get(index).setId(id);
		people.get(index).setState(state);
	}

	//create User
	public void create(String name, String lastName, String id, String userName, String password, State state, Modifiers usersModifiers) {

		User user = new User(name, lastName, id, userName, password, state, usersModifiers);
		people.add(user);
	}

	//update user
	public void update(String name, String lastName, String id, String userName, String password, State state,int index) {
		people.get(index).setName(name);
		people.get(index).setLastName(lastName);
		people.get(index).setId(id);
		people.get(index).setState(state);
	}

	//Create ingredient
	public void create(String name, Modifiers userModifiers) {

		Ingredient ingredients = new Ingredient(name, userModifiers);
		ingredient.add(ingredients);
	}

	//Create product
	public void create(String name, ArrayList<Ingredient> ingredients, ProductType productType, Size sizes, double price, Modifiers userModifiers) {

		Product products = new Product(name,ingredients,productType, sizes, price, userModifiers);
		product.add(products);
	}

	//Create preorder
	public void create(Product product,Integer amount) {

		PreOrder preOrder = new PreOrder(product,amount);
		preorder.add(preOrder);
	}

	//Update Ingredient
	public void update(String name, int index) {
		ingredient.get(index).setName(name);
	}

	//Create type product
	public void createTypeProduct(String name, Modifiers userModifiers) {

		ProductType typeProduct = new ProductType(name, userModifiers);
		productType.add(typeProduct);
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

	//Create preorder
	public Modifiers create(User creator, User modifier) {

		Modifiers modifiers = new Modifiers(creator, modifier);
		return modifiers;
	}

	//create order
	public boolean create(StateOrder state, ArrayList<Integer> amount, Date date, String fieldOfObservations, Client orderClient,
			ArrayList<Product>products, Employee ordEmployee, Modifiers userModifiers) {

		boolean orders = true, validation = true;
		int aleatorio = 0;
		Random r = new Random();
		String code = "";

		while(validation) {

			aleatorio = (int)(r.nextDouble() * 1000000);
			code = "LCD"+aleatorio;
			validation = findOrders(code);

			if(!validation) {
				Order newOrder = new Order(code, state, amount, date, fieldOfObservations, orderClient, products, ordEmployee, userModifiers);
				order.add(newOrder);

			}else {
				orders = false;
			}
		}
		return orders;
	}

	//create size
	public void createSize(String size) {

		Size allSizes = new Size(size);
		sizes.add(allSizes);
	}

	public boolean findSizes(String size){

		boolean find = false;

		for (int j = 0; j < sizes.size() && !find; j++) {

			if(size.equalsIgnoreCase(sizes.get(j).getSize())) {
				find = true;
			}
		}
		return find;
	}

	public boolean findOrders(String code){

		boolean find = false;

		for (int j = 0; j < order.size() && !find; j++) {

			if(code.equalsIgnoreCase(order.get(j).getCode())) {
				find = true;
			}
		}
		return find;
	}

	public boolean searchUser(String userName, String password) {

		boolean find = true;  

		for(int i = 0;i < people.size() && find;i++) {
			if(people.get(i) instanceof User) {

				User user = (User)people.get(i);

				if(user.getUserName().equals(userName) && user.getPassword().equalsIgnoreCase(password)){
					find = false;
				}
			}
		}
		return find;
	}

	public int findPosition(String idPeople){

		int position = -1;
		boolean find = false;

		for (int j = 0; j < people.size() && !find; j++) {

			if(idPeople.equalsIgnoreCase(people.get(j).getId())) {
				position = j;
				find = true;
			}
		}
		return position;
	}

	public boolean findPeople(String idPeople){

		boolean find = false;

		for (int j = 0; j < people.size() && !find; j++) {

			if(idPeople.equalsIgnoreCase(people.get(j).getId())) {
				find = true;
			}
		}
		return find;
	}

	public boolean findClient(String name, String lastName){

		boolean find = false;

		for (int j = 0; j < people.size() && !find; j++) {

			if(people.get(j) instanceof Client && people.get(j).getName().equalsIgnoreCase(name) && 
					people.get(j).getLastName().equalsIgnoreCase(lastName)) {
				find = true;
			}
		}
		return find;
	}

	public Client findObjClient(String name, String lastName){

		Client client = null;
		boolean find = false;

		for (int j = 0; j < people.size() && !find; j++) {

			if(people.get(j) instanceof Client && people.get(j).getName().equalsIgnoreCase(name) && people.get(j).getLastName().equalsIgnoreCase(lastName)) {
				find = true;
				client = (Client) people.get(j); 
			}
		}
		return client;
	}

	public Client findObjClient(String name){

		Client client = null;
		boolean find = false;

		for (int j = 0; j < people.size() && !find; j++) {

			if(people.get(j) instanceof Client && people.get(j).getName().equalsIgnoreCase(name)) {
				find = true;
				client = (Client) people.get(j); 
			}
		}
		return client;
	}

	public Employee findEmployee(String name){

		Employee employee = null;
		boolean find = false;

		for (int j = 0; j < people.size() && !find; j++) {

			if(people.get(j) instanceof Employee && people.get(j).getName().equalsIgnoreCase(name)) {
				find = true;
				employee = (Employee) people.get(j);
			}
		}
		return employee;
	}

	public Employee findObjEmployee(String id){

		Employee employee = null;
		boolean find = false;

		for (int j = 0; j < people.size() && !find; j++) {

			if(people.get(j) instanceof Employee && people.get(j).getName().equalsIgnoreCase(id)) {
				find = true;
				employee = (Employee) people.get(j);
			}
		}
		return employee;
	}

	public boolean findProduct(String name){

		boolean find = false;

		for (int j = 0; j < product.size() && !find; j++) {

			if(product.get(j).getName().equalsIgnoreCase(name)) {
				find = true;
			}
		}
		return find;
	}

	public boolean findIngredien(String name){

		boolean find = false;

		for (int j = 0; j < ingredient.size() && !find; j++) {

			if(ingredient.get(j).getName().equalsIgnoreCase(name) ) {
				find = true;
			}
		}
		return find;
	}

	public Ingredient findIngredient(String name){

		boolean find = false;
		Ingredient ingredients = null;

		for (int j = 0; j < ingredient.size() && !find; j++) {

			if(ingredient.get(j).getName().equalsIgnoreCase(name) ) {
				find = true;
				ingredients = ingredient.get(j);
			}
		}
		return ingredients;
	}

	public Product findProducts(String name){

		boolean find = false;
		Product products = null;

		for (int j = 0; j <product.size() && !find; j++) {

			if(product.get(j).getName().equalsIgnoreCase(name) ) {
				find = true;
				products = product.get(j);
			}
		}
		return products;
	}

	public PreOrder findPreOrders(String name, Integer amount){

		boolean find = false;
		PreOrder preOrder= null;

		for (int j = 0; j <preorder.size() && !find; j++) {

			if(preorder.get(j).getProduct().getName().equalsIgnoreCase(name) && preorder.get(j).getAmount() == 				amount) {
				find = true;
				preOrder = preorder.get(j);
			}
		}
		return preOrder;
	}

	public ProductType findType(String name){

		boolean find = false;
		ProductType type= null;

		for (int j = 0; j <productType.size() && !find; j++) {

			if(productType.get(j).getName().equalsIgnoreCase(name)) {
				find = true;
				type= productType.get(j);
			}
		}
		return type;
	}

	public Size findSize(String size){

		boolean find = false;
		Size allSizes = null;

		for (int j = 0; j < sizes.size() && !find; j++) {

			if(sizes.get(j).getSize().equalsIgnoreCase(size)) {
				find = true;
				allSizes = sizes.get(j);
			}
		}
		return allSizes;
	}

	public Product findObjectProduct(String name){

		Product products = null;
		boolean find = false;

		for (int j = 0; j < product.size() && !find; j++) {

			if(product.get(j).getName().equalsIgnoreCase(name)) {
				find = true;
				products = product.get(j);
			}
		}
		return products;
	}

	public boolean findTypeIngredient(String name){

		boolean find = false;

		for (int j = 0; j < productType.size() && !find; j++) {

			if(productType.get(j).getName().equalsIgnoreCase(name) ) {
				find = true;
			}
		}
		return find;
	}

	public void deleteClient(Client client) {

		boolean verific = false;

		for (int i = 0; i < people.size() && !verific; i++) {
			if(people.get(i) instanceof Client && people.get(i).getName().equals(client.getName()) && 				people.get(i).getLastName().equals(client.getLastName())) {
				verific = true;
				people.remove(i);
			}
		}
	}
	
	public void deleteEmployee(Employee employee) {

		boolean verific = false;

		for (int i = 0; i < people.size() && !verific; i++) {
			if(people.get(i) instanceof Employee && people.get(i).getId().equals(employee.getId())) {
				verific = true;
				people.remove(i);
			}
		}
	}
	
	public void deleteUser(User user) {

		boolean verific = false;
		User validation = null;

		for (int i = 0; i < people.size() && !verific; i++) {
			
			
			
			if(people.get(i) instanceof User) {
				
				validation = (User)people.get(i);
				
				if(validation.getUserName().equals(user.getUserName()) && 				validation.getId().equals(user.getId())) {
					verific = true;
					people.remove(i);
				}
			}
		}
	}

	public ArrayList<User> getUsers(){

		ArrayList<User> users = new ArrayList<>();

		for (int j = 0; j < people.size(); j++) {

			if(people.get(j) instanceof User ) {

				users.add((User)people.get(j));
			}
		}
		return users;
	}

	public ArrayList<Client> getClients(){

		ArrayList<Client> clients = new ArrayList<>();

		for (int j = 0; j < people.size(); j++) {

			if(people.get(j) instanceof Client ) {

				clients.add((Client)people.get(j));
			}
		}
		return clients;
	}

	public ArrayList<Employee> getEmployee(){

		ArrayList<Employee> employee = new ArrayList<>();

		for (int j = 0; j < people.size(); j++) {

			if(people.get(j) instanceof Employee ) {

				employee.add((Employee)people.get(j));
			}
		}
		return employee;
	}

	public User findUser(String name, String lastName, String id, String userName) {

		User user = null;
		User validation = null;
		boolean verific = false;

		for (int i = 0; i < people.size() && !verific; i++) {
			if(people.get(i) instanceof User) {

				user = (User)people.get(i);
				if(user.getName().equalsIgnoreCase(name) && user.getLastName().equalsIgnoreCase(lastName) && 					user.getId().equals(id) && user.getUserName().equalsIgnoreCase(userName)) {
					validation = user;
					verific = true;
				}
			}
		}
		return validation;
	}
	
	public User findUser(String userName, String id) {

		User user = null;
		User validation = null;
		boolean verific = false;

		for (int i = 0; i < people.size() && !verific; i++) {
			if(people.get(i) instanceof User) {

				user = (User)people.get(i);
				if(user.getId().equals(id) && user.getUserName().equalsIgnoreCase(userName)) {
					validation = user;
					verific = true;
				}
			}
		}
		return validation;
	}

	public void importData(String fileName) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader(fileName));
		String line = br.readLine();

		while(line != null) {

			String[] parts = line.split(SEPARATOR);
			State state = null;

			if(parts[5] == (State.ENABLE).toString()) {
				state = State.ENABLE;
			}
			else if(parts[5] == (State.DISABLED).toString()) {
				state = State.DISABLED;
			}

			Client client = findObjClient(parts[0]);

			create(parts[0],parts[1],parts[2],state,parts[4],parts[5],parts[6],client.getUsersCreators());
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

	public ArrayList<PreOrder> getPreorder() {
		return preorder;
	}

	public void setPreorder(ArrayList<PreOrder> preorder) {
		this.preorder = preorder;
	}

	public ArrayList<Size> getSizes() {
		return sizes;
	}

	public void setSizes(ArrayList<Size> sizes) {
		this.sizes = sizes;
	}
}
