package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
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

public class LaCasaDorada{

	//Constants

	public final static String SAVE_PATH_FILE_PEOPLE = "data/dataPeople.txt";
	public final static String SAVE_PATH_FILE_ORDER = "data/dataOrder.lcd";
	public final static String SAVE_PATH_FILE_PRODUCT = "data/dataProduct.lcd";
	public final static String SAVE_PATH_FILE_INGREDIENT = "data/dataIngredient.lcd";
	public final static String SAVE_PATH_FILE_TYPE = "data/dataType.lcd";
	public final static String SAVE_PATH_FILE_SIZE = "data/dataSize.lcd";

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
	public void create(String name, String lastName, String id, String address, String telephone, String fieldObservations,
			Modifiers modifiers, State state) throws IOException {

		Client client = new Client(name, lastName, id, address, telephone, fieldObservations, modifiers, state);


		if(getClients().isEmpty()) {
			people.add(client);
		}
		else {

			int i = people.size()-1;
			boolean verify = false;

			while(i > 0 && !verify) {
				
				
				
				if(people.get(i) instanceof Client) {
					Client clientToCompare = findObjClient(people.get(i).getName());
					
					
					
					if(clientToCompare.compareTo(client) > 0) {
						verify = true;
					}
				}
				i--;
			}
			people.add(i,client);
		}
		saveData();
	}

	//create employee
	public void create(String name, String lastName, String id, Modifiers usersModifiers, State state) throws IOException {

		Employee employee = new Employee(name, lastName, id, usersModifiers,state);
		people.add(employee);
		saveData();
	}

	//create User
	public void create(String name, String lastName, String id, String userName, String password, Modifiers usersModifiers,State state) throws IOException {

		User user = new User(name, lastName, id, userName, password, usersModifiers,state);
		people.add(user);
		saveData();
	}

	//Create ingredient
	public void create(String name, Modifiers userModifiers, State state) throws IOException {

		Ingredient ingredients = new Ingredient(name, userModifiers,state);
		ingredient.add(ingredients);
		saveData();
	}

	//Create product
	public void create(String name, ArrayList<Ingredient> ingredients, ProductType productType, Size sizes, double price, Modifiers userModifiers, State state) throws IOException {

		Product products = new Product(name,ingredients,productType, sizes, price, userModifiers,state);
		product.add(products);
		saveData();
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
	public void createTypeProduct(String name, Modifiers userModifiers, State state) {

		ProductType typeProduct = new ProductType(name, userModifiers,state);
		productType.add(typeProduct);
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

	//Create Modifiers
	public Modifiers create(User creator, User modifier) {

		Modifiers modifiers = new Modifiers(creator, modifier);
		return modifiers;
	}

	//create order
	public boolean create(StateOrder state, ArrayList<Integer> amount, Date date, String fieldOfObservations, Client orderClient,
			ArrayList<Product>products, Employee ordEmployee, Modifiers userModifiers) throws IOException {

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
				saveData();

			}else {
				orders = false;
			}
		}
		return orders;
	}

	//create size
	public void createSize(String size, Modifiers modifiers, State state) throws IOException {

		Size allSizes = new Size(size, modifiers,state);
		sizes.add(allSizes);
		saveData();
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

	public Order findOrder(String code){

		boolean find = false;
		Order orders = null;

		for (int j = 0; j < order.size() && !find; j++) {

			if(code.equalsIgnoreCase(order.get(j).getCode())) {
				find = true;
				orders = order.get(j);
			}
		}
		return orders;
	}

	public Order findProductInOrder(Product product){

		boolean find = false;
		Order orderToSend = null;

		for (int j = 0; j < order.size() && !find; j++) {
			for (int i = 0; i < order.size(); i++) {

				if(order.get(i).getProducts().get(j).getName().equals(product.getName())){
					find = true;
					orderToSend = order.get(i);
				}
			}
		}
		return orderToSend;
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

	public int searchState(String state, String state2) {

		int verific = -1;

		int enProceso = 2, enviado = 3, entregado = 4, cancelado = 5;

		if(state.equalsIgnoreCase("SOLICITADO")) {

			if(state2.equalsIgnoreCase("EN_PROCESO")) {
				verific = enProceso;
			}
			else if(state2.equalsIgnoreCase("ENVIADO")) {
				verific = enviado;
			}
			else if(state2.equalsIgnoreCase("ENTREGADO")) {
				verific = entregado;
			}
			else if(state2.equalsIgnoreCase("CANCELADO")) {
				verific = cancelado;

			}else if(state.equalsIgnoreCase(state2)) {
				verific = 0;
			}
		} 

		else if(state.equalsIgnoreCase("EN_PROCESO")) {

			if(state2.equalsIgnoreCase("ENVIADO")) {
				verific = enviado;
			}
			else if(state2.equalsIgnoreCase("ENTREGADO")) {
				verific = entregado;
			}
			else if(state2.equalsIgnoreCase("CANCELADO")) {
				verific = cancelado;

			}else if(state.equalsIgnoreCase(state2)) {
				verific = 0;
			}
		}

		else if(state.equalsIgnoreCase("ENVIADO")) {

			if(state2.equalsIgnoreCase("ENTREGADO")) {
				verific = entregado;
			}
			else if(state2.equalsIgnoreCase("CANCELADO")) {
				verific = cancelado;

			}else if(state.equalsIgnoreCase(state2)) {
				verific = 0;
			}
		}

		else if(state.equalsIgnoreCase("ENTREGADO")) {

			if(state2.equalsIgnoreCase("CANCELADO")) {
				verific = cancelado;

			}else if(state.equalsIgnoreCase(state2)) {
				verific = 0;
			}
		}

		return verific;
	}

	public StateOrder findState(String state) {

		StateOrder stateOrder = null;

		if(state.equalsIgnoreCase("SOLICITADO")) {
			stateOrder = StateOrder.SOLICITADO;
		}	
		else if(state.equalsIgnoreCase("EN_PROCESO")) {
			stateOrder = StateOrder.EN_PROCESO;
		}
		else if(state.equalsIgnoreCase("ENVIADO")) {
			stateOrder = StateOrder.ENVIADO;
		}
		else if(state.equalsIgnoreCase("ENTREGADO")) {
			stateOrder = StateOrder.ENTREGADO;
		}
		else if(state.equalsIgnoreCase("CANCELADO")) {
			stateOrder = StateOrder.CANCELADO;
		}
		return stateOrder;
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

	public Client findObjClient(String name, String lastName, String phone){

		Client client = null;
		boolean find = false;

		for (int j = 0; j < people.size() && !find; j++) {

			if(people.get(j) instanceof Client) {
				Client peopleClient = (Client)people.get(j);
				if(peopleClient.getName().equalsIgnoreCase(name) && peopleClient.getLastName().equalsIgnoreCase(lastName) && peopleClient.getTelephone().equals(phone)) {
					find = true;
					client = (Client) people.get(j);
				}
			}
		}
		return client;
	}

	public Client findObjClient(String name, String lastName) throws IOException{

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

			if(preorder.get(j).getProduct().getName().equalsIgnoreCase(name) && preorder.get(j).getAmount() == amount) {
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

	public Product findTypeOfProduct(ProductType productType){

		boolean find = false;
		Product type= null;

		for (int j = 0; j <product.size() && !find; j++) {

			if(product.get(j).getProductType().getName().equals(productType.getName())) {
				find = true;
				type = product.get(j);
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
			if(people.get(i) instanceof Client && people.get(i).getName().equals(client.getName()) && people.get(i).getLastName().equals(client.getLastName())) {
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

				if(validation.getUserName().equals(user.getUserName()) && validation.getId().equals(user.getId())) {
					verific = true;
					people.remove(i);
				}
			}
		}
	}


	public void deleteOrder(Order orders) {

		boolean verific = false;

		for (int i = 0; i < order.size() && !verific; i++) {

			if(order.get(i) == orders) {
				verific = true;
				order.remove(i);
			}
		}
	}


	public void deleteProduct(Product productToDelete) {

		boolean verific = false;

		for (int i = 0; i < people.size() && !verific; i++) {
			if(product.get(i).getName().equals(productToDelete.getName())) {
				verific = true;
				product.remove(i);
			}
		}
	}

	public void deleteProductType(ProductType productTypeDelete){

		boolean verific = false;

		for (int j = 0; j <productType.size() && !verific; j++) {

			if(productType.get(j) == productTypeDelete) {
				verific = true;
				productType.remove(j);
			}
		}
	}

	public void deleteIngredient(Ingredient ingredientDelete){

		boolean verific = false;

		for (int j = 0; j <ingredient.size() && !verific; j++) {

			if(ingredient.get(j) == ingredientDelete) {
				verific = true;
				ingredient.remove(j);
			}
		}
	}

	public void deleteSize(Size sizeToDelete){

		boolean verific = false;

		for (int j = 0; j <sizes.size() && !verific; j++) {

			if(sizes.get(j) == sizeToDelete) {
				verific = true;
				sizes.remove(j);
			}
		}
	}

	public void disableIngredient(Ingredient ingredientDisable){

		boolean verific = false;

		for (int j = 0; j <ingredient.size() && !verific; j++) {

			if(ingredient.get(j) == ingredientDisable) {
				verific = true;
				ingredient.get(j).setState(State.DISABLED);
			}
		}
	}

	public void enableIngredient(Ingredient ingredientDisable){

		boolean verific = false;

		for (int j = 0; j <ingredient.size() && !verific; j++) {

			if(ingredient.get(j) == ingredientDisable) {
				verific = true;
				ingredient.get(j).setState(State.ENABLE);
			}
		}
	}

	public void disableClient(Client clientDisable){

		boolean verific = false;
		Client client = null;

		for (int j = 0; j <people.size() && !verific; j++) {

			if(people.get(j) instanceof Client) {
				verific = true;
				client = (Client) people.get(j);

				if(client == clientDisable) {
					clientDisable.setState(State.DISABLED);
				}
			}
		}
	}

	public void enableClient(Client clientEnable){

		boolean verific = false;
		Client client = null;

		for (int j = 0; j <people.size() && !verific; j++) {

			if(people.get(j) instanceof Client) {
				verific = true;
				client = (Client) people.get(j);

				if(client == clientEnable) {
					clientEnable.setState(State.ENABLE);
				}
			}
		}
	}

	public void disableEmployee(Employee employeeDisable){

		boolean verific = false;
		Employee employee = null;

		for (int j = 0; j <people.size() && !verific; j++) {

			if(people.get(j) instanceof Employee) {
				employee = (Employee) people.get(j);

				if(employee == employeeDisable) {
					employeeDisable.setState(State.DISABLED);
					verific = true;
				}
			}
		}
	}

	public void enableEmployee(Employee employeeEnable){

		boolean verific = false;
		Employee employee = null;

		for (int j = 0; j <people.size() && !verific; j++) {

			if(people.get(j) instanceof Employee) {
				employee = (Employee) people.get(j);

				if(employee == employeeEnable) {
					employeeEnable.setState(State.ENABLE);
					verific = true;
				}
			}
		}
	}

	public void disableSize(Size sizeDisable){

		boolean verific = false;

		for (int j = 0; j <sizes.size() && !verific; j++) {

			if(sizes.get(j) == sizeDisable) {
				verific = true;
				sizes.get(j).setState(State.DISABLED);
			}
		}
	}

	public void enableSize(Size sizeDisable){

		boolean verific = false;

		for (int j = 0; j <sizes.size() && !verific; j++) {

			if(sizes.get(j) == sizeDisable) {
				verific = true;
				sizes.get(j).setState(State.ENABLE);
			}
		}
	}

	public void disableType(ProductType productTypeDisable){

		boolean verific = false;

		for (int j = 0; j <productType.size() && !verific; j++) {

			if(productType.get(j) == productTypeDisable) {
				verific = true;
				productType.get(j).setState(State.DISABLED);
			}
		}
	}

	public void enableType(ProductType productTypeDisable){

		boolean verific = false;

		for (int j = 0; j <productType.size() && !verific; j++) {

			if(productType.get(j) == productTypeDisable) {
				verific = true;
				productType.get(j).setState(State.ENABLE);
			}
		}
	}

	public void disableProduct(Product productDisable){

		boolean verific = false;

		for (int j = 0; j <product.size() && !verific; j++) {

			if(product.get(j) == productDisable) {
				verific = true;
				product.get(j).setState(State.DISABLED);
			}
		}
	}

	public void enableProduct(Product productDisable){

		boolean verific = false;

		for (int j = 0; j <product.size() && !verific; j++) {

			if(product.get(j) == productDisable) {
				verific = true;
				product.get(j).setState(State.ENABLE);
			}
		}
	}

	public void disableProduct(Order orderDisable){

		boolean verific = false;

		for (int j = 0; j <order.size() && !verific; j++) {

			if(order.get(j) == orderDisable) {
				verific = true;
				order.get(j).setStates(State.DISABLED);
			}
		}
	}

	public void enableOrder(Order orderEnable){

		boolean verific = false;

		for (int j = 0; j <order.size() && !verific; j++) {

			if(order.get(j) == orderEnable) {
				verific = true;
				order.get(j).setStates(State.ENABLE);
			}
		}
	}

	public void disableOrder(Order orderDisable){

		boolean verific = false;

		for (int j = 0; j <order.size() && !verific; j++) {

			if(order.get(j) == orderDisable) {
				verific = true;
				order.get(j).setStates(State.DISABLED);
			}
		}
	}

	public void disableUser(User user){

		boolean verific = false;

		for (int j = 0; j <people.size() && !verific; j++) {

			if(people.get(j) == user) {
				verific = true;
				people.get(j).setState(State.DISABLED);
			}
		}
	}

	public void enableUser(User user){

		boolean verific = false;

		for (int j = 0; j <people.size() && !verific; j++) {

			if(people.get(j) == user) {
				verific = true;
				people.get(j).setState(State.ENABLE);
			}
		}
	}

	public ArrayList<User> getUsers(){

		ArrayList<User> users = new ArrayList<>();

		for (int j = 0; j < people.size(); j++) {

			if(people.get(j) instanceof User && people.get(j).getState() != State.DISABLED) {

				users.add((User)people.get(j));
			}
		}
		return users;
	}

	public ArrayList<Client> getClients(){

		ArrayList<Client> clients = new ArrayList<>();

		for (int j = 0; j < people.size(); j++) {

			if(people.get(j) instanceof Client && people.get(j).getState() != State.DISABLED) {

				clients.add((Client)people.get(j));
			}
		}
		return clients;
	}

	public ArrayList<Employee> getEmployee(){

		ArrayList<Employee> employee = new ArrayList<>();

		for (int j = 0; j < people.size(); j++) {

			if(people.get(j) instanceof Employee && people.get(j).getState() != State.DISABLED) {

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
				if(user.getName().equalsIgnoreCase(name) && user.getLastName().equalsIgnoreCase(lastName) && user.getId().equals(id) && user.getUserName().equalsIgnoreCase(userName)) {
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

	public User findUsersModifiers(String userName, String password) {

		User user = null;
		User validation = null;
		boolean verific = false;

		for (int i = 0; i < people.size() && !verific; i++) {
			if(people.get(i) instanceof User) {

				user = (User)people.get(i);
				if(user.getPassword().equalsIgnoreCase(password) && user.getUserName().equalsIgnoreCase(userName)) {
					validation = user;
					verific = true;
				}
			}
		}
		return validation;
	}

	public Order findClientInOrder(Client client) {

		Order clienInOrder = null;
		boolean verific = false;

		for (int i = 0; i < order.size() && !verific; i++) {
			if(order.get(i).getOrderClient() == client) {
				verific = true;
				clienInOrder = order.get(i);
			}
		}
		return clienInOrder;
	}

	public Order findEmployeeInOrder(Employee employee) {

		Order clienInOrder = null;
		boolean verific = false;

		for (int i = 0; i < order.size() && !verific; i++) {
			if(order.get(i).getOrderEmployee() == employee) {
				verific = true;
				clienInOrder = order.get(i);
			}
		}
		return clienInOrder;
	}

	public Order findUserInOrder(User user) {

		Order userInOrder = null;
		boolean verific = false;

		for (int i = 0; i < order.size() && !verific; i++) {
			if((order.get(i).getUsersCreators().getCreateObject() == user || order.get(i).getUsersCreators().getLastModifier() == user) || order.get(i).getOrderEmployee().getName().equals(user.getName()) && order.get(i).getOrderEmployee().getName().equals(user.getLastName()) && order.get(i).getOrderEmployee().getId().equals(user.getId())) {
				verific = true;
				userInOrder = order.get(i);
			}
		}
		return userInOrder;
	}

	public Product findUserInProduct(User user) {

		Product userInProduct = null;
		boolean verific = false;

		for (int i = 0; i < product.size() && !verific; i++) {
			if(product.get(i).getUsersCreators().getCreateObject() == user || product.get(i).getUsersCreators().getLastModifier() == user) {
				verific = true;
				userInProduct = product.get(i);
			}
		}
		return userInProduct;
	}

	public Ingredient findUserInIngredient(User user) {

		Ingredient userInIngredient = null;
		boolean verific = false;

		for (int i = 0; i < ingredient.size() && !verific; i++) {
			if(ingredient.get(i).getUsersCreators().getCreateObject() == user || ingredient.get(i).getUsersCreators().getLastModifier() == user) {
				verific = true;
				userInIngredient = ingredient.get(i);
			}
		}
		return userInIngredient;
	}

	public Size findUserInSize(User user) {

		Size userInSize = null;
		boolean verific = false;

		for (int i = 0; i < sizes.size() && !verific; i++) {
			if(sizes.get(i).getUsersCreators().getCreateObject() == user || sizes.get(i).getUsersCreators().getLastModifier() == user) {
				verific = true;
				userInSize = sizes.get(i);
			}
		}
		return userInSize;
	}

	public ProductType findUserInProductType(User user) {

		ProductType userInProductType = null;
		boolean verific = false;

		for (int i = 0; i < productType.size() && !verific; i++) {
			if(productType.get(i).getUsersCreators().getCreateObject() == user || productType.get(i).getUsersCreators().getLastModifier() == user) {
				verific = true;
				userInProductType = productType.get(i);
			}
		}
		return userInProductType;
	}

	public Product findIngredientInProduct(Ingredient ingredientToFind) {

		Product ingredientInProduct = null;
		boolean verific = false;

		for (int i = 0; i < product.size() && !verific; i++) {
			for (int j = 0; j < product.get(i).getIngredients().size() && !verific; j++) {

				System.out.println(product.get(i).getIngredients().get(j).getName()+"    "+ingredientToFind.getName());
				if(product.get(i).getIngredients().get(j).getName().equals(ingredientToFind.getName())) {
					System.out.println("XDXDXD");
					verific = true;
					ingredientInProduct = product.get(i);
				}
			}
		}
		return ingredientInProduct;
	}

	public Product findSizeInProduct(Size sizeToFind) {

		Product sizeInProduct = null;
		boolean verific = false;

		for (int i = 0; i < product.size() && !verific; i++) {
			if(product.get(i).getSizes().getSize().equals(sizeToFind.getSize())) {
				verific = true;
				sizeInProduct = product.get(i);
			}
		}
		return sizeInProduct;
	}

	public State findStates(String state) {

		State states = null;

		if(state.equalsIgnoreCase(State.ENABLE.toString())) {
			states = State.ENABLE;

		}else if(state.equalsIgnoreCase(State.DISABLED.toString())) {
			states = State.DISABLED;

		}
		return states;
	}

	public void importData(String fileName) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader(fileName));
		String line = br.readLine();

		while(line != null) {

			String[] parts = line.split(",");


			Client client = findObjClient(parts[0]);

			State state = findStates(parts[6]);

			create(parts[0],parts[1],parts[2],parts[3],parts[4],parts[5],client.getUsersCreators(),state);
			line = br.readLine();
		}

		br.close();
	}

	public void exportData(String fileName) throws FileNotFoundException {

		PrintWriter pw = new PrintWriter(fileName);

		for (int i = 0; i < people.size(); i++) {

			if(people.get(i) instanceof Client) {

				Client client = (Client) people.get(i);
				pw.println(client.getName()+SEPARATOR+client.getLastName()+SEPARATOR+client.getId()+SEPARATOR+client.getAddress()+SEPARATOR+client.getState()+SEPARATOR+client.getTelephone()+SEPARATOR+client.getFieldOfObservations());
			}
			else if(people.get(i) instanceof Employee) {

				Client client = (Client) people.get(i);
				pw.println(client.getName()+SEPARATOR+client.getLastName()+SEPARATOR+client.getId()+SEPARATOR+client.getState()+SEPARATOR+client.getAddress()+SEPARATOR+client.getTelephone()+SEPARATOR+client.getFieldOfObservations());
			}
		}
		pw.close();
	}

	public void exportDataOrders(String fileName, String separator) throws FileNotFoundException{
		PrintWriter pw = new PrintWriter(fileName+".csv");

		pw.println("CODIGO DEL PEDIDO"+separator+"NOMBRE DEL CLIENTE QUE LO RECIBE"+separator+"DIRECCIÓN"+separator+"TELEFONO"+separator+
				"NOMBRE DEL EMPLEADO QUE LO ENTREGA"+separator+"ESTADO DEL PEDIDO"+separator+"FECHA DE CREACIÓN"+separator+"OBSERVACIONES"+separator+
				"NOMBRE DEL PRODUCTO"+separator+"CANTIDAD DEL PRODUCTO"+separator+"PRECIO DEL PRODUCTO");

		for(int i=0;i<getOrder().size();i++){

			Order order = getOrder().get(i);
			Client client = findObjClient(order.getNameClient());
			Employee employee = findEmployee(order.getNameEmployee());
			pw.println(order.getCode()+separator+client.getName()+separator+client.getAddress()+separator+client.getTelephone()+separator+
					employee.getName()+separator+order.getState()+separator+order.getDateDay()+separator+order.getFieldOfObservations()+separator+
					order.getNameProduct()+separator+order.getAmountProduct()+separator+order.getPriceProduct());
		}

		pw.close();
	}

	public void exportDataEmployees(String fileName) throws FileNotFoundException{
		PrintWriter pw = new PrintWriter(fileName);

		pw.println("NOMBRE DEL EMPLEADO"+SEPARATOR+"No. DE PEDIDOS ENTREGADOS"+SEPARATOR+"PRECIO TOTAL POR PEDIDOS");

		for(int i = 0; i < getEmployee().size();i++){

			Employee employee = findEmployee(getEmployee().get(i).getName());
			int amount = findAmountProduct(employee.getName());
			Double prices = findPricestProduct(employee.getName());
			
			pw.println(employee.getName()+SEPARATOR+amount+SEPARATOR+prices);
		}

		pw.close();
	}
	
	public void exportProduct(String fileName) throws FileNotFoundException{
		
		PrintWriter pw = new PrintWriter(fileName);

		pw.println("PRODUCTO"+SEPARATOR+"No. DE PRODUCTOS COMPRADOS"+SEPARATOR+"TOTAL PAGADO");

		for(int i = 0; i < product.size();i++){

			Product productList = product.get(i);
			
			pw.println(productList.getName());
		}

		pw.close();
	}
	
	public int sizeProductOrder(Product productToFind) {
	
		int numProduct = 0;
		
		for (int i = 0; i < product.size(); i++) {
			if() {
				
			}
		}
		
		return numProduct;
	}

	public int findAmountProduct(String employee) {

		boolean verific = false;
		int cont = 0;
		
		for (int i = 0; i < order.size() && !verific; i++) {
			if(order.get(i).getNameEmployee().equals(employee)) {
				cont++;
			}
			
		}
		return cont;
	}

	public Double findPricestProduct(String employee) {

		boolean verific = false;
		Double cont = 0.0;
		
		for (int i = 0; i < order.size() && !verific; i++) {
			if(order.get(i).getNameEmployee().equals(employee)) {
				
				for (int j = 0; j < order.get(i).getProducts().size(); j++) {
					double price = (order.get(i).getProducts().get(j).getPrice() * order.get(i).getAmount().get(j));
					cont += price;
				}
			}
			
		}
		return cont;
	}

	public void saveData() throws IOException {

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(SAVE_PATH_FILE_PEOPLE));
		oos.writeObject(people);

		ObjectOutputStream pro = new ObjectOutputStream(new FileOutputStream(SAVE_PATH_FILE_PRODUCT));
		pro.writeObject(product);

		ObjectOutputStream type = new ObjectOutputStream(new FileOutputStream(SAVE_PATH_FILE_TYPE));
		type.writeObject(productType);

		ObjectOutputStream size = new ObjectOutputStream(new FileOutputStream(SAVE_PATH_FILE_SIZE));
		size.writeObject(sizes);

		ObjectOutputStream ing = new ObjectOutputStream(new FileOutputStream(SAVE_PATH_FILE_INGREDIENT));
		ing.writeObject(ingredient);

		ObjectOutputStream ord = new ObjectOutputStream(new FileOutputStream(SAVE_PATH_FILE_ORDER));
		ord.writeObject(order);

		oos.close();
		pro.close();
		type.close();
		size.close();
		ing.close();
		ord.close();
	}

	public ArrayList<People> getPeople() {
		return people;
	}

	public void setPeople(ArrayList<People> people) {
		this.people = people;
	}

	public ArrayList<Product> getProduct() {

		ArrayList<Product>products = new ArrayList<>();

		for (int i = 0; i < product.size(); i++) {

			if(product.get(i).getState() != State.DISABLED) {
				products.add(product.get(i));
			}
		}
		return products;
	}

	public void setProduct(ArrayList<Product> product) {
		this.product = product;
	}

	public ArrayList<ProductType> getProductType() {

		ArrayList<ProductType>type = new ArrayList<>();

		for (int i = 0; i < productType.size(); i++) {

			if(productType.get(i).getState() != State.DISABLED) {
				type.add(productType.get(i));
			}
		}
		return type;
	}

	public void setProductType(ArrayList<ProductType> productType) {
		this.productType = productType;
	}

	public ArrayList<Ingredient> getIngredient() {

		ArrayList<Ingredient>ingredients = new ArrayList<>();

		for (int i = 0; i < ingredient.size(); i++) {

			if(ingredient.get(i).getState() != State.DISABLED) {
				ingredients.add(ingredient.get(i));
			}
		}
		return ingredients;
	}

	public void setIngredient(ArrayList<Ingredient> ingredient) {
		this.ingredient = ingredient;
	}

	public ArrayList<Order> getOrder() {

		ArrayList<Order>orders = new ArrayList<>();

		for (int i = 0; i < order.size(); i++) {

			if(order.get(i).getStates() != State.DISABLED) {
				orders.add(order.get(i));
			}
		}
		return orders;
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

		ArrayList<Size>size = new ArrayList<>();

		for (int i = 0; i < sizes.size(); i++) {

			if(sizes.get(i).getState() != State.DISABLED) {
				size.add(sizes.get(i));
			}
		}
		return size;
	}

	public void setSizes(ArrayList<Size> sizes) {
		this.sizes = sizes;
	}

	@SuppressWarnings({ "unchecked" })
	public boolean loadData() throws IOException, ClassNotFoundException{
		boolean loaded = false;

		File cli = new File(SAVE_PATH_FILE_PEOPLE);

		if(cli.exists()){
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(cli));
			people = (ArrayList<People>)ois.readObject();
			ois.close();
			loaded = true;
		}

		File ingre = new File(SAVE_PATH_FILE_INGREDIENT);

		if(ingre.exists()){
			ObjectInputStream ingredien = new ObjectInputStream(new FileInputStream(ingre));
			ingredient = (ArrayList<Ingredient>)ingredien.readObject();

			ingredien.close();
			loaded = true;
		}

		File ord = new File(SAVE_PATH_FILE_ORDER);

		if(ord.exists()){
			ObjectInputStream orde = new ObjectInputStream(new FileInputStream(ord));
			order = (ArrayList<Order>)orde.readObject();

			orde.close();
			loaded = true;
		}

		File prod = new File(SAVE_PATH_FILE_PRODUCT);

		if(prod.exists()){
			ObjectInputStream produc = new ObjectInputStream(new FileInputStream(prod));
			product = (ArrayList<Product>)produc.readObject();

			produc.close();
			loaded = true;
		}

		File siz = new File(SAVE_PATH_FILE_SIZE);

		if(siz.exists()){
			ObjectInputStream size = new ObjectInputStream(new FileInputStream(siz));
			sizes = (ArrayList<Size>)size.readObject();

			size.close();
			loaded = true;
		}

		File typ = new File(SAVE_PATH_FILE_TYPE);

		if(typ.exists()){
			ObjectInputStream type = new ObjectInputStream(new FileInputStream(typ));
			productType = (ArrayList<ProductType>)type.readObject();

			type.close();
			loaded = true;
		}

		return loaded;
	}
	/*
	public void sortByNameAndLastName() {

		Comparator<Client> nameAndLastNameComparator = new Comparator<Client>() {

			@Override
			public int compare(Client c1, Client c2) {

				int verific = 0;

				if(c1.getLastName().compareTo(c2.getLastName()) > 0) {
					verific = 1;
				}
				else if(c1.getLastName().compareTo(c2.getLastName()) < 0) {
					verific = -1;
				}
				return verific;
			}
		};
		Collections.sort(client,);
	}
	 */

}
