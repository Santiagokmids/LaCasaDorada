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
	public void create(String name, String lastName, String id, String address, String telephone, String fieldObservations,
			Modifiers modifiers) {

		Client client = new Client(name, lastName, id, address, telephone, fieldObservations, modifiers);
		people.add(client);
	}

	//create employee
	public void create(String name, String lastName, String id, Modifiers usersModifiers) {

		Employee employee = new Employee(name, lastName, id, usersModifiers);
		people.add(employee);
	}

	//create User
	public void create(String name, String lastName, String id, String userName, String password, Modifiers usersModifiers) {

		User user = new User(name, lastName, id, userName, password, usersModifiers);
		people.add(user);
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

				if(order.get(i).getProducts().get(j) == product){
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
			}
		}

		else if(state.equalsIgnoreCase("ENVIADO")) {

			if(state2.equalsIgnoreCase("ENTREGADO")) {
				verific = entregado;
			}
			else if(state2.equalsIgnoreCase("CANCELADO")) {
				verific = cancelado;
			}
		}

		else if(state.equalsIgnoreCase("ENTREGADO")) {

			if(state2.equalsIgnoreCase("CANCELADO")) {
				verific = cancelado;
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

			if(product.get(j).getProductType() == productType) {
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

	public void disableIngredient(Ingredient ingredientDisable){

		boolean verific = false;

		for (int j = 0; j <ingredient.size() && !verific; j++) {

			if(ingredient.get(j) == ingredientDisable) {
				verific = true;
				ingredient.get(j).setState(State.DISABLED);
			}
		}
	}
	
	public void disableSize(Size sizeDisable){

		boolean verific = false;

		for (int j = 0; j <ingredient.size() && !verific; j++) {

			if(sizes.get(j) == sizeDisable) {
				verific = true;
				sizes.get(j).setState(State.DISABLED);
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
				userInProductType = productType.get(i);
			}
		}
		return userInProductType;
	}

	public Product findIngredientInProduct(Ingredient ingredientToFind) {

		Product ingredientInProduct = null;
		boolean verific = false;

		for (int i = 0; i < product.size() && !verific; i++) {
			for (int j = 0; j < product.size(); j++) {
				if(product.get(i).getIngredients().get(j) == ingredientToFind) {
					verific = true;
					ingredientInProduct = product.get(i);
				}
			}
		}
		return ingredientInProduct;
	}

	public void importData(String fileName) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader(fileName));
		String line = br.readLine();

		while(line != null) {

			String[] parts = line.split(SEPARATOR);


			Client client = findObjClient(parts[0]);

			create(parts[0],parts[1],parts[2],parts[3],parts[4],parts[5],client.getUsersCreators());
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
