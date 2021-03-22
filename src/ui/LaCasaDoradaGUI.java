package ui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import model.Client;
import model.Employee;
import model.Ingredient;
import model.LaCasaDorada;
import model.Modifiers;
import model.Order;
import model.PreOrder;
import model.Product;
import model.ProductType;
import model.Size;
import model.State;
import model.StateOrder;
import model.User;

public class LaCasaDoradaGUI {

	@FXML
	private ImageView imageBannerListProduct;

	@FXML
	private ImageView imageWallListProduct;

	@FXML
	private TableView<Product> tvListProduct;

	@FXML
	private TableColumn<Product, String> tcNameProduct;

	@FXML
	private TableColumn<Product, String> tcIngredientProduct;

	@FXML
	private TableColumn<Product, String> tcTypeProduct;

	@FXML
	private TableColumn<Product, String> tcSizeProduct;

	@FXML
	private TableColumn<Product, Double> tcPriceProduct;

	@FXML
	private TextField updateNameProduct;

	@FXML
	private TextField updateIngredientProduct;

	@FXML
	private ComboBox<String> updateTypeProduct;

	@FXML
	private ComboBox<String> comboSizeProduct;

	@FXML
	private TextField updatePriceProduct;

	@FXML
	private ImageView imageBannerListEmployee;

	@FXML
	private ImageView imageWallListEmployee;

	@FXML
	private TableView<Employee> tvEmployee;

	@FXML
	private TableColumn<Employee, String> tcNameEmployee;

	@FXML
	private TableColumn<Employee, String> tcLastNameEmployee;

	@FXML
	private TableColumn<Employee, String> tcIdEmployee;

	@FXML
	private TextField updateNameEmployee;

	@FXML
	private TextField updateLastNameEmployee;

	@FXML
	private TextField updateIdEmployee;

	@FXML
	private ImageView imageBannerClient;

	@FXML
	private ImageView imageWallClient;

	@FXML
	private TableView<Client> tvClient;

	@FXML
	private TableColumn<Client, String> tcNameClient;

	@FXML
	private TableColumn<Client, String> tcLastNameClient;

	@FXML
	private TableColumn<Client, String> tcIdClient;

	@FXML
	private TableColumn<Client, String> tcAddressClient;

	@FXML
	private TableColumn<Client, String> tcTelephoneClient;

	@FXML
	private TableColumn<Client, String> tcObsClient;

	@FXML
	private TextField updateNameClient;

	@FXML
	private TextField updateLasNameClient;

	@FXML
	private TextField updateIdClient;

	@FXML
	private TextField updateAddressClient;

	@FXML
	private TextField updateTelephoneClient;

	@FXML
	private TextField updateObsClient;

	@FXML
	private ImageView imageBannerUser;

	@FXML
	private ImageView imageWallUser;

	@FXML
	private TableView<User> tvUser;

	@FXML
	private TableColumn<User, String> tcName;

	@FXML
	private TableColumn<User, String> tcLastName;

	@FXML
	private TableColumn<User, String> tcId;

	@FXML
	private TableColumn<User, String> tcUser;

	@FXML
	private TextField updateName;

	@FXML
	private TextField updateLasName;

	@FXML
	private TextField updateId;

	@FXML
	private TextField updateUser;

	@FXML
	private PasswordField lastPassword;

	@FXML
	private PasswordField newPassword;

	@FXML
	private PasswordField confirmPassword;

	@FXML
	private ImageView imegeBannerProduct;

	@FXML
	private ImageView imageWallProduct;

	@FXML
	private TextField typeProduct;

	@FXML
	private ImageView imageBannerIngredient;

	@FXML
	private ImageView imageWallIngredient;

	@FXML
	private TextField nameIngredient;

	@FXML
	private ImageView imageWallEmployee;

	@FXML
	private BorderPane listOrderPane;

	@FXML
	private ImageView imageBannerEmployee;

	@FXML
	private TextField nameEmployee;

	@FXML
	private TextField lastNameEmployee;

	@FXML
	private TextField idEmployee;

	@FXML
	private BorderPane mainPane;

	@FXML
	private ImageView imageView;

	@FXML
	private ImageView imageBanner;

	@FXML
	private ImageView imageWall;

	@FXML
	private TextField txtUser;

	@FXML
	private PasswordField txtPassword;

	@FXML
	private ImageView imageBannerRegister;

	@FXML
	private ImageView imageWallRegister;

	@FXML
	private TextField nameUser;

	@FXML
	private TextField name;

	@FXML
	private TextField lastName;

	@FXML
	private PasswordField passwordTwo;

	@FXML
	private ImageView imageBannerRegisterClient;

	@FXML
	private ImageView imageWallRegisterClient;

	@FXML
	private TextField nameClient;

	@FXML
	private TextField lastNameClient;

	@FXML
	private TextField idClient;

	@FXML
	private TextField adressClient;

	@FXML
	private TextField telephoneClient;

	@FXML
	private TextField id;

	@FXML
	private PasswordField password;

	@FXML
	private LaCasaDorada laCasaDorada;

	@FXML
	private TextArea fieldObservations;

	@FXML
	private ComboBox<StateOrder> stateOrder;

	@FXML
	private ComboBox<String> selectProduct;

	@FXML
	private TextField amount;

	@FXML
	private TableView<PreOrder> tvOrder;

	@FXML
	private TableColumn<PreOrder, Integer> colAmount;

	@FXML
	private TextArea txtFieldOrder;

	@FXML
	private TextField txtEmployeeOrder;

	@FXML
	private TextField txtClientOrder;

	@FXML
	private TableColumn<PreOrder, String> colName;

	@FXML
	private ImageView imageBannerProduct;

	@FXML
	private TextField nameOfProduct;

	@FXML
	private ComboBox<String> selectType;

	@FXML
	private ComboBox<String> selectIngredient;

	@FXML
	private TableView<Ingredient> tvProduct;

	@FXML
	private ComboBox<String> selectSize;

	@FXML
	private TableColumn<Ingredient, String> colIngredient;

	@FXML
	private ImageView imageWallOrders;

	@FXML
	private ImageView imageBannerOrders;

	@FXML
	private ImageView imageBannerSIZE;

	@FXML
	private ImageView imageWallISize;

	@FXML
	private TextField txtSize;

	@FXML
	private TextField txtPrice;

	@FXML
	private TextField priceProduct;

	@FXML
	private ImageView imageBannerListOrder;

	@FXML
	private ImageView imageWallListOrder;

	@FXML
	private TableView<Order> tvListOrders;

	@FXML
	private TableColumn<Order, String> nameOrder;

	@FXML
	private TableColumn<Order, String> estateOrder;

	@FXML
	private TableColumn<Order, String> productOrder;

	@FXML
	private TableColumn<Order, Integer> amountOrder;

	@FXML
	private TableColumn<Order, String> clientOrder;

	@FXML
	private TableColumn<Order, String> employeeOrder;

	@FXML
	private TableColumn<Order, String> dateOrder;

	@FXML
	private TableColumn<?, ?> obsOrdersList;

	@FXML
	private TextField updateNameOrder;

	@FXML
	private TextField updateProductsOrder;

	@FXML
	private TextField nameClientList;

	@FXML
	private TextField updateAmountOrder;

	@FXML
	private ComboBox<String> stateOrderList;

	@FXML
	private TextArea obsOders;

	@FXML
	private TextField nameEmployeeList;


	public static ObservableList<Product> listProduct;
	public static ObservableList<Order> listOrders;
	public static ObservableList<User> listUsers;
	public static ObservableList<PreOrder> observableList;
	public static ObservableList<Ingredient> listIngredients;
	public static ObservableList<Client> listClient;
	public static ObservableList<Employee> listEmployee;
	public static Modifiers usersModifiers;
	public static ObservableList<Product> listOfProducts;

	public LaCasaDoradaGUI(LaCasaDorada laCasaDorada) {
		this.laCasaDorada = laCasaDorada;
	}

	public void inicializateTableViewUsers() {

		listUsers = FXCollections.observableArrayList(laCasaDorada.getUsers());

		tvUser.setItems(listUsers);
		tcName.setCellValueFactory(new PropertyValueFactory<User,String>("name"));
		tcLastName.setCellValueFactory(new PropertyValueFactory<User,String>("lastName"));
		tcId.setCellValueFactory(new PropertyValueFactory<User,String>("id"));
		tcUser.setCellValueFactory(new PropertyValueFactory<User,String>("userName"));
	}

	public void inicializateTableViewClients() {

		listClient = FXCollections.observableArrayList(laCasaDorada.getClients());

		tvClient.setItems(listClient);
		tcNameClient.setCellValueFactory(new PropertyValueFactory<Client,String>("Name"));
		tcLastNameClient.setCellValueFactory(new PropertyValueFactory<Client,String>("LastName"));
		tcIdClient.setCellValueFactory(new PropertyValueFactory<Client,String>("Id"));
		tcAddressClient.setCellValueFactory(new PropertyValueFactory<Client,String>("Address"));
		tcTelephoneClient.setCellValueFactory(new PropertyValueFactory<Client,String>("Telephone"));
		tcObsClient.setCellValueFactory(new PropertyValueFactory<Client,String>("FieldOfObservations"));
	}

	public void inicializateTableViewEmployee() {

		listEmployee = FXCollections.observableArrayList(laCasaDorada.getEmployee());

		tvEmployee.setItems(listEmployee);
		tcNameEmployee.setCellValueFactory(new PropertyValueFactory<Employee,String>("Name"));
		tcLastNameEmployee.setCellValueFactory(new PropertyValueFactory<Employee,String>("LastName"));
		tcIdEmployee.setCellValueFactory(new PropertyValueFactory<Employee,String>("Id"));
	}

	public void inicializateTableViewProduct() {

		listOfProducts = FXCollections.observableArrayList(laCasaDorada.getProduct());

		tvListProduct.setItems(listOfProducts);
		tcNameProduct.setCellValueFactory(new PropertyValueFactory<Product,String>("Name"));
		tcIngredientProduct.setCellValueFactory(new PropertyValueFactory<Product,String>("nameIngredient"));
		tcTypeProduct.setCellValueFactory(new PropertyValueFactory<Product,String>("nameType"));
		tcSizeProduct.setCellValueFactory(new PropertyValueFactory<Product,String>("NameSize"));
		tcPriceProduct.setCellValueFactory(new PropertyValueFactory<Product,Double>("price"));
	}

	private void inicializateTableViewProducts(ArrayList<Ingredient> ingre) {

		listIngredients = FXCollections.observableArrayList(ingre);

		tvProduct.setItems(listIngredients);

		colIngredient.setCellValueFactory(new PropertyValueFactory<Ingredient,String>("Name")); 
	}

	private void inicializateTableView() {

		observableList = FXCollections.observableArrayList(laCasaDorada.getPreorder());

		tvOrder.setItems(observableList);

		colName.setCellValueFactory(new PropertyValueFactory<PreOrder,String>("nameProduct")); 
		colAmount.setCellValueFactory(new PropertyValueFactory<PreOrder,Integer>("Amount"));
	}

	@FXML
	public void loadBanner() throws IOException {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("main-image.fxml"));

		loader.setController(this);
		Parent load = loader.load();  

		mainPane.getChildren().clear();
		mainPane.setTop(load);

		Image image = new Image("/images/Banner.jpg");
		imageView.setImage(image);
	} 

	@FXML
	public void loadLogin() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("login-pane.fxml"));

		loader.setController(this);
		Parent load = loader.load();

		mainPane.getChildren().clear();
		mainPane.setTop(load);

		Image image = new Image("/images/Banner.jpg");
		imageWall.setImage(image);
		Image image2 = new Image("/images/BannerCasaDorada.jpg");
		imageBanner.setImage(image2);
	} 		

	@FXML
	public void inicializateProgram(ActionEvent event) throws IOException {
		loadLogin();
	}

	@FXML
	public void logout(ActionEvent event) throws IOException {
		loadLogin();
	}

	@FXML
	public void loadRegister() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("register-pane.fxml"));

		loader.setController(this);
		Parent load = loader.load();
		mainPane.getChildren().clear();
		mainPane.setTop(load);

		Image image = new Image("/images/Banner.jpg");
		imageWallRegister.setImage(image);
		Image image2 = new Image("/images/BannerCasaDorada.jpg");
		imageBannerRegister.setImage(image2);
	}

	@FXML
	public void loadRegisterMain(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("register-main.fxml"));

		loader.setController(this);
		Parent load = loader.load();
		mainPane.getChildren().clear();
		mainPane.setTop(load);

		Image image = new Image("/images/Banner.jpg");
		imageWallRegister.setImage(image);
		Image image2 = new Image("/images/BannerCasaDorada.jpg");
		imageBannerRegister.setImage(image2);
	}

	@FXML
	public void registerUser(ActionEvent event) throws IOException{

		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("ERROR");

		if(!name.getText().equals("") && !nameUser.getText().equals("") && !lastName.getText().equals("") && !password.getText().equals("") &&
				!passwordTwo.getText().equals("") && !id.getText().equals("")) { 

			if(!laCasaDorada.findPeople(id.getText())) {

				if(password.getText().equals(passwordTwo.getText())) {

					Alert alerts = new Alert(AlertType.INFORMATION);
					alerts.setTitle("EXCELENTE");
					alerts.setHeaderText("Se ha registrado exitosamente.");
					alerts.setContentText("Se ha registrado a "+nameUser.getText()+" exitosamente");
					alerts.showAndWait();

					User user = laCasaDorada.findUser(name.getText(), lastName.getText(), id.getText(), nameUser.getText());
					usersModifiers = laCasaDorada.create(user, user);
					laCasaDorada.create(name.getText(), lastName.getText(), id.getText(), nameUser.getText(), password.getText(), State.ENABLE,usersModifiers);

					loadLogin();

				}else {

					alert.setHeaderText("Las contraseñas no coinciden");
					alert.setContentText("Las contraseñas deben ser iguales");
					alert.showAndWait();
				}
			}	else {

				alert.setHeaderText("No se pudo crear el Usuario");
				alert.setContentText("Ya hay usuarios con ese numero de identificación.");
				alert.showAndWait();
			}

		}else {

			alert.setHeaderText("No se pudo crear el Usuario");
			alert.setContentText("Debe llenar todos los campos para crear un usuario.");
			alert.showAndWait();
		}
	}

	@FXML
	public void registerUserMain(ActionEvent event) throws IOException{

		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("ERROR");

		if(!name.getText().equals("") && !nameUser.getText().equals("") && !lastName.getText().equals("") && !password.getText().equals("") &&
				!passwordTwo.getText().equals("") && !id.getText().equals("")) { 

			if(!laCasaDorada.findPeople(id.getText())) {

				if(password.getText().equals(passwordTwo.getText())) {

					Alert alerts = new Alert(AlertType.INFORMATION);
					alerts.setTitle("EXCELENTE");
					alerts.setHeaderText("Se ha registrado exitosamente.");
					alerts.setContentText("Se ha registrado a "+nameUser.getText()+" exitosamente");
					alerts.showAndWait();

					laCasaDorada.create(name.getText(), lastName.getText(), id.getText(), nameUser.getText(), password.getText(), State.ENABLE, usersModifiers);
					mainMenu();

				}else {

					alert.setHeaderText("Las contraseñas no coinciden");
					alert.setContentText("Las contraseñas deben ser iguales");
					alert.showAndWait();
				}
			}	else {

				alert.setHeaderText("No se pudo crear el Usuario");
				alert.setContentText("Ya hay usuarios con ese numero de identificación.");
				alert.showAndWait();
			}

		}else {

			alert.setHeaderText("No se pudo crear el Usuario");
			alert.setContentText("Debe llenar todos los campos para crear un usuario.");
			alert.showAndWait();
		}
	}

	@FXML
	public void loadRegisterEmployee(ActionEvent event) throws IOException {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("registerEmployee-pane.fxml"));

		loader.setController(this);
		Parent load = loader.load();
		mainPane.getChildren().clear();
		mainPane.setCenter(load);

		mainPane.getChildren().clear();
		mainPane.setTop(load);

		Image image = new Image("/images/Banner.jpg");
		imageWallEmployee.setImage(image);
		Image image2 = new Image("/images/BannerCasaDorada.jpg");
		imageBannerEmployee.setImage(image2);
	}

	@FXML
	public void loginUsers(ActionEvent event)throws IOException {

		if(!txtUser.getText().equals("") && !txtPassword.getText().equals("")) {

			if(!laCasaDorada.searchUser(txtUser.getText(), txtPassword.getText())){
				mainMenu();
			}else
				showAlert();
		}else
			showAlert();
	}

	@FXML
	public void mainMenu() throws IOException {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("main-menu.fxml"));

		loader.setController(this);

		Parent mainMenu = loader.load();
		mainPane.getChildren().clear();
		mainPane.setCenter(mainMenu);

		Image image = new Image("images/BannerCasaDorada.jpg");
		imageBanner.setImage(image);
	}

	@FXML
	public void createClient(ActionEvent event) throws IOException {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("register-client.fxml"));

		loader.setController(this);

		Parent loginClient = loader.load();

		mainPane.getChildren().clear();
		mainPane.setCenter(loginClient);

		Image image = new Image("/images/Banner.jpg");
		imageWallRegisterClient.setImage(image);
		Image image2 = new Image("/images/BannerCasaDorada.jpg");
		imageBannerRegisterClient.setImage(image2);
	}

	@FXML
	public void addClient(ActionEvent event)throws IOException {

		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("ERROR");

		if(!nameClient.getText().equals("") && !lastNameClient.getText().equals("") && !adressClient.getText().equals("") && 
				!telephoneClient.getText().equals("") && !fieldObservations.getText().equals("") && !idClient.getText().equals("")) { 

			if(!laCasaDorada.findClient(nameClient.getText(), lastNameClient.getText())) {

				Alert alerts = new Alert(AlertType.INFORMATION);
				alerts.setTitle("EXCELENTE");
				alerts.setHeaderText("Se ha registrado exitosamente.");
				alerts.setContentText("Se ha registrado a "+nameClient.getText()+" exitosamente");
				alerts.showAndWait();

				laCasaDorada.create(nameClient.getText(), lastNameClient.getText(), idClient.getText(), State.ENABLE,
						adressClient.getText(), telephoneClient.getText(), fieldObservations.getText(),usersModifiers);
				mainMenu();

			}else {

				alert.setHeaderText("No se pudo crear el Cliente");
				alert.setContentText("Ya hay clientes con ese nombre y apellido");
				alert.showAndWait();
			}

		} else if(!nameClient.getText().equals("") && !lastNameClient.getText().equals("") && !adressClient.getText().equals("") && 
				!telephoneClient.getText().equals("") && !fieldObservations.getText().equals("") && idClient.getText().equals("")) {

			Alert alerts = new Alert(AlertType.INFORMATION);
			alerts.setTitle("EXCELENTE");
			alerts.setHeaderText("Se ha registrado exitosamente.");
			alerts.setContentText("Se ha registrado a "+nameClient.getText()+" exitosamente");
			alerts.showAndWait();

			laCasaDorada.create(nameClient.getText(), lastNameClient.getText(), idClient.getText(), State.ENABLE,
					adressClient.getText(), telephoneClient.getText(), fieldObservations.getText(), usersModifiers);
			mainMenu();
		}
		else {

			alert.setHeaderText("No se pudo crear el Usuario");
			alert.setContentText("Debe llenar todos los campos para crear el usuario");
			alert.showAndWait();
		}
	}

	@FXML
	public void addSize(ActionEvent event)throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("addSizes.fxml"));

		loader.setController(this);

		Parent addSizes = loader.load();

		mainPane.getChildren().clear();
		mainPane.setCenter(addSizes);

		Image image = new Image("/images/Banner.jpg");
		imageWallISize.setImage(image);
		Image image2 = new Image("/images/BannerCasaDorada.jpg");
		imageBannerSIZE.setImage(image2);
	}

	@FXML
	public void addSizes(ActionEvent event)throws IOException {

		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("ERROR");

		if(!txtSize.getText().equals("")) { 

			if(!laCasaDorada.findSizes(txtSize.getText())) {
				Alert alerts = new Alert(AlertType.INFORMATION);
				alerts.setTitle("EXCELENTE");
				alerts.setHeaderText("Se ha añadido.");
				alerts.setContentText("Se ha añadido el tamaño "+txtSize.getText()+" exitosamente");
				alerts.showAndWait();

				laCasaDorada.createSize(txtSize.getText());
				mainMenu();

			}else {
				alert.setHeaderText("No se pudo añadir el tamaño");
				alert.setContentText("Ya hay tamaños con ese nombre");
				alert.showAndWait();
			}
		}else {
			alert.setHeaderText("No se pudo Añadir el tamaño");
			alert.setContentText("Debe llenar todos los campos para añadir el tamaño");
			alert.showAndWait();
		}
	}

	@FXML
	public void showAlert() {

		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("ERROR");
		alert.setHeaderText("No es posible ingresar.");
		alert.setContentText("Nombre de usuario o contraseña son incorrectos.");
		alert.showAndWait();  
	}

	@FXML
	public void createEmployee(ActionEvent event) throws IOException {

		if(!nameEmployee.getText().equals("") && !lastNameEmployee.getText().equals("") && !idEmployee.getText().equals("")) {


			boolean verific = laCasaDorada.findPeople(idEmployee.getText());

			if(!verific) {

				Alert alerts = new Alert(AlertType.INFORMATION);
				alerts.setTitle("EXCELENTE");
				alerts.setHeaderText("Se ha registrado exitosamente.");
				alerts.setContentText("Se ha registrado a "+nameEmployee.getText()+" exitosamente");
				alerts.showAndWait();

				laCasaDorada.create(nameEmployee.getText(),lastNameEmployee.getText(),idEmployee.getText(),State.ENABLE, usersModifiers);

				mainMenu();
			}else if(verific) {

				Alert alert = new Alert(AlertType.ERROR);
				alert.setTitle("ERROR");
				alert.setHeaderText("No se pudo crear el Empleado");
				alert.setContentText("Ya se encuentra un empleado con ese número de identificación");
				alert.showAndWait();
			}
		}
		else {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("ERROR");
			alert.setHeaderText("No se pudo crear el empleado");
			alert.setContentText("Debe llenar todos los campos para crear el empleado");
			alert.showAndWait();
		}
	}

	@FXML
	public void ordersPane(ActionEvent event) throws IOException {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("order-pane.fxml"));

		loader.setController(this);

		Parent addOrder = loader.load();
		mainPane.getChildren().clear();
		mainPane.setTop(addOrder);

		Image image = new Image("images/Banner.jpg");
		imageWallOrders.setImage(image);
		Image image2 = new Image("/images/BannerCasaDorada.jpg");
		imageBannerOrders.setImage(image2);

		ArrayList<Product> products = laCasaDorada.getProduct();
		selectProduct.setPromptText("Seleccione el producto");

		for (int i = 0; i < products.size(); i++) {
			selectProduct.getItems().add(products.get(i).getName());
		}

		stateOrder.setPromptText("Seleccione el estado del pedido");
		stateOrder.getItems().addAll(StateOrder.SOLICITADO,StateOrder.EN_PROCESO,StateOrder.ENVIADO,StateOrder.ENTREGADO,StateOrder.CANCELADO);
		inicializateTableView();
	}

	@FXML
	public void addOrder(ActionEvent event)throws IOException {

		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("ERROR");

		if(!txtEmployeeOrder.getText().equals("") && !txtClientOrder.getText().equals("") && !txtFieldOrder.getText().equals("") && 
				stateOrder.getValue() != null && !observableList.isEmpty()){

			try {

				Employee employee = laCasaDorada.findEmployee(txtEmployeeOrder.getText());		
				Client client = laCasaDorada.findObjClient(txtClientOrder.getText());

				if(employee != null && client != null) {

					Alert alerts = new Alert(AlertType.INFORMATION);
					alerts.setTitle("EXCELENTE!");
					alerts.setHeaderText("Se ha añadido.");
					alerts.setContentText("Se ha añadido a exitosamente el pedido.");
					alerts.showAndWait();

					Date date = new Date();
					ArrayList<Product>products = new ArrayList<>();
					ArrayList<Integer>amount = new ArrayList<>();

					for (int i = 0; i < observableList.size(); i++) {
						products.add(observableList.get(i).getProduct());
					}

					for (int i = 0; i < observableList.size(); i++) {
						amount.add(observableList.get(i).getAmount());
					}

					laCasaDorada.create(stateOrder.getValue(), amount, date, txtFieldOrder.getText(),client,products,employee,usersModifiers);
					mainMenu();

				}else {
					alert.setHeaderText("No se pudo realizar el pedido");
					alert.setContentText("El cliente o empleado que se ingresó no está registrado.");
					alert.showAndWait();
				}

			} catch (NumberFormatException nfe) {

				alert.setHeaderText("No se pudo realizar el pedido");
				alert.setContentText("Debe ingresar valores númericos");
				alert.showAndWait();
			}

		}else {

			alert.setHeaderText("No se pudo Añadir el pedido");
			alert.setContentText("Debe llenar todos los campos para añadir el pedido");
			alert.showAndWait();
		}
	}

	@FXML
	public void addProduct(ActionEvent event)throws IOException {

		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("ERROR");

		if(!nameOfProduct.getText().equals("") && selectType.getValue() != null && selectIngredient.getValue() != null && 
				selectSize.getValue() != null && !priceProduct.getText().equals("") && !listIngredients.isEmpty()){

			try {

				double price = Double.parseDouble(priceProduct.getText()); 

				if(laCasaDorada.findSizes(selectSize.getValue()))  {
					Size sizes = laCasaDorada.findSize(selectSize.getValue());

					Alert alerts = new Alert(AlertType.INFORMATION);
					alerts.setTitle("EXCELENTE!");
					alerts.setHeaderText("Se ha añadido.");
					alerts.setContentText("Se ha añadido exitosamente el producto.");
					alerts.showAndWait();

					ArrayList<Ingredient>ingredients = new ArrayList<>();

					for (int i = 0; i < listIngredients.size(); i++) {
						ingredients.add(listIngredients.get(i));
					}

					ProductType type = laCasaDorada.findType(selectType.getValue());	
					laCasaDorada.create(nameOfProduct.getText(), ingredients, type, sizes, price,usersModifiers);

					mainMenu();

				}else {
					alert.setHeaderText("Ya hay un tamaño con ese precio");
					alert.setContentText("Debe ingresar un valor númerico en el campo de precio del producto");
					alert.showAndWait();
				}

			}catch (NumberFormatException nfe) {

				alert.setHeaderText("No ingresó un número");
				alert.setContentText("Debe ingresar un valor númerico en el campo de precio del producto");
				alert.showAndWait();
			}
		}else {

			alert.setHeaderText("No se pudo Añadir el pedido");
			alert.setContentText("Debe llenar todos los campos para añadir el pedido");
			alert.showAndWait();
		}
	}

	@FXML
	public void productPane(ActionEvent event) throws IOException {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("addProduct-pane.fxml"));

		loader.setController(this);

		Parent addOrder = loader.load();
		mainPane.getChildren().clear();
		mainPane.setTop(addOrder);

		Image image = new Image("images/Banner.jpg");
		imageWallProduct.setImage(image);
		Image image2 = new Image("/images/BannerCasaDorada.jpg");
		imageBannerProduct.setImage(image2);

		ArrayList<Ingredient> ingredient = laCasaDorada.getIngredient();
		ArrayList<ProductType> productType = laCasaDorada.getProductType();

		selectIngredient.setPromptText("Seleccione el Ingrediente");

		for (int i = 0; i < ingredient.size(); i++) {
			selectIngredient.getItems().addAll(ingredient.get(i).getName());
		}

		selectType.setPromptText("Seleccione el tipo de producto");

		for (int i = 0; i < productType.size(); i++) {
			selectType.getItems().addAll(productType.get(i).getName());
		}

		ArrayList<Size> size = laCasaDorada.getSizes();
		selectSize.setPromptText("Seleccione el tamaño del producto");

		for (int i = 0; i < size.size(); i++) {
			selectSize.getItems().addAll(size.get(i).getSize());
		}

		ArrayList<Ingredient> ingre = new ArrayList<>();
		inicializateTableViewProducts(ingre);

	}

	@FXML
	public void ingredientProduct(ActionEvent event)throws IOException {
		listIngredients.add(laCasaDorada.findIngredient(selectIngredient.getValue()));
	}

	@FXML
	public void removeIngredient(ActionEvent event)throws IOException{
		listIngredients.remove(tvProduct.getSelectionModel().getSelectedItem());
	}

	@FXML
	public void modifyIngredient(ActionEvent event) {

		boolean verific = false;
		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("ERROR");

		if(tvProduct.getSelectionModel().isEmpty()) {

			alert.setHeaderText("No se pudo Cambiar");
			alert.setContentText("Debe seleccionar un ingrediente de la lista");
			alert.showAndWait();
		}
		else {

			String name = listIngredients.get(tvProduct.getSelectionModel().getSelectedIndex()).getName();

			Ingredient ingredient = laCasaDorada.findIngredient(name);

			if(selectIngredient.getValue() != null) {
				name = selectIngredient.getValue();
				verific = true;
			}

			if(verific) {
				Alert alerts = new Alert(AlertType.INFORMATION);
				alerts.setTitle("EXCELENTE");
				alerts.setHeaderText("Se ha reemplazado el ingrediente.");
				alerts.setContentText(null);
				alerts.showAndWait();

			}else {
				alert.setHeaderText("No se pudo Cambiar");
				alert.setContentText("Debe seleccionar un ingrediente de la lista");
				alert.showAndWait();
			}

			ingredient.setName(name);

			listIngredients.set(tvProduct.getSelectionModel().getSelectedIndex(),new Ingredient(name, usersModifiers));

			selectIngredient.setValue(null);
		}
	}

	@FXML
	public void mouseClickedProduct(MouseEvent event) {

		String name = listIngredients.get(tvProduct.getSelectionModel().getSelectedIndex()).getName();

		selectIngredient.setValue(name);
	}

	@FXML
	public void ordersProducts(ActionEvent event)throws IOException {

		int amounts = 0;

		if(!amount.getText().equals("")) {
			amounts = Integer.parseInt(amount.getText());

		}else {
			amounts = 1;
		}

		Product product = laCasaDorada.findProducts(selectProduct.getValue());
		observableList.add(new PreOrder(product, amounts));
	}

	@FXML
	public void removeProduct(ActionEvent event)throws IOException{
		observableList.remove(tvOrder.getSelectionModel().getSelectedItem());
	}

	@FXML
	public void modifyProduct(ActionEvent event) {

		boolean verific = false;
		boolean verificAmount = false;
		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("ERROR");

		if(tvOrder.getSelectionModel().isEmpty()) {

			alert.setHeaderText("No se pudo Cambiar");
			alert.setContentText("Debe seleccionar un ingrediente de la lista");
			alert.showAndWait();
		}
		else {

			String name = observableList.get(tvOrder.getSelectionModel().getSelectedIndex()).getProduct().getName();
			int amounts = observableList.get(tvOrder.getSelectionModel().getSelectedIndex()).getAmount();

			Product product = laCasaDorada.findProducts(name);
			PreOrder preorder = laCasaDorada.findPreOrders(name, amounts);

			if(selectProduct.getValue() != null) {
				name = selectProduct.getValue();
				verific = true;
			}

			if(!amount.getText().isEmpty()) {
				amounts = Integer.parseInt(amount.getText());
				verificAmount = true;
			}

			Alert alerts = new Alert(AlertType.INFORMATION);
			alerts.setTitle("EXCELENTE");

			if(verific && verificAmount) {
				alerts.setHeaderText("Se han reemplazado los datos.");
				alerts.setContentText("Se ha reemplazado el producto y su cantidad.");
				alerts.showAndWait();

			}else if(verific) {
				alerts.setHeaderText("Se ha reemplazado el producto.");
				alerts.setContentText(null);
				alerts.showAndWait();

			}else if(verificAmount) {
				alerts.setHeaderText("Se ha reemplazado la cantidad del producto.");
				alerts.setContentText(null);
				alerts.showAndWait();

			}
			else {
				alert.setHeaderText("No se pudo Cambiar");
				alert.setContentText("Debe seleccionar un producto de la lista y seleccionar su respectiva cantidad");
				alert.showAndWait();
			}

			product.setName(name);
			preorder.setAmount(amounts);

			observableList.set(tvOrder.getSelectionModel().getSelectedIndex(),new PreOrder(product,amounts));

			selectIngredient.setValue(null);
		}
	}

	@FXML
	public void mouseClickedOrder(MouseEvent event) {

		String product = observableList.get(tvOrder.getSelectionModel().getSelectedIndex()).getProduct().getName();
		Integer amounts = observableList.get(tvOrder.getSelectionModel().getSelectedIndex()).getAmount();

		selectProduct.setValue(product);
		String total = amounts.toString();
		amount.setText(total);
	}

	@FXML
	public void addIngredient(ActionEvent event) throws IOException {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("addIngredient-pane.fxml"));

		loader.setController(this);
		Parent load = loader.load();
		mainPane.setCenter(load);

		mainPane.getChildren().clear();
		mainPane.setTop(load);

		Image image = new Image("/images/Banner.jpg");
		imageWallIngredient.setImage(image);
		Image image2 = new Image("/images/BannerCasaDorada.jpg");
		imageBannerIngredient.setImage(image2);
	}

	@FXML
	public void createIngredient(ActionEvent event) throws IOException {

		if(!nameIngredient.getText().equals("")) {

			boolean verific = laCasaDorada.findIngredien(nameIngredient.getText());

			if(!verific) {

				Alert alerts = new Alert(AlertType.INFORMATION);
				alerts.setTitle("EXCELENTE");
				alerts.setHeaderText("Se ha agregado exitosamente.");
				alerts.setContentText("Se ha agregado el ingrediente "+nameIngredient.getText()+" exitosamente");
				alerts.showAndWait();

				laCasaDorada.create(nameIngredient.getText(),usersModifiers);
				mainMenu();
			}
			else if(verific) {

				Alert alert = new Alert(AlertType.ERROR);
				alert.setTitle("ERROR");
				alert.setHeaderText("No se pudo añadir el ingrediente");
				alert.setContentText("Ya se encuentra agregado un ingrediente con ese nombre");
				alert.showAndWait();
			}
		}
		else {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("ERROR");
			alert.setHeaderText("No se pudo agregar el ingrediente");
			alert.setContentText("Debe llenar el campo para añadir el ingrediente");
			alert.showAndWait();
		}
	}

	@FXML
	public void addTypeIngredient(ActionEvent event) throws IOException {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("addTypeProduct-pane.fxml"));

		loader.setController(this);
		Parent load = loader.load();
		mainPane.setCenter(load);

		mainPane.getChildren().clear();
		mainPane.setTop(load);

		Image image = new Image("/images/Banner.jpg");
		imageWallProduct.setImage(image);
		Image image2 = new Image("/images/BannerCasaDorada.jpg");
		imegeBannerProduct.setImage(image2);
	}

	@FXML
	public void createTypeProduct(ActionEvent event) throws IOException {

		if(!typeProduct.getText().equals("")) {

			boolean verific = laCasaDorada.findTypeIngredient(typeProduct.getText());

			if(!verific) {

				Alert alerts = new Alert(AlertType.INFORMATION);
				alerts.setTitle("EXCELENTE");
				alerts.setHeaderText("Se ha agregado exitosamente.");
				alerts.setContentText("Se ha agregado el tipo de producto "+typeProduct.getText()+" exitosamente");
				alerts.showAndWait();

				laCasaDorada.createTypeProduct(typeProduct.getText(), usersModifiers);
				mainMenu();
			}
			else if(verific) {

				Alert alert = new Alert(AlertType.ERROR);
				alert.setTitle("ERROR");
				alert.setHeaderText("No se pudo añadir el tipo de producto");
				alert.setContentText("Ya se encuentra agregado un tipo de producto con ese nombre");
				alert.showAndWait();
			}
		}
		else {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("ERROR");
			alert.setHeaderText("No se pudo añadir el tipo de producto");
			alert.setContentText("Debe llenar el campo para añadir el tipo de producto");
			alert.showAndWait();
		}
	}

	@FXML
	public void listUsers(ActionEvent event) throws IOException {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("listUser-pane.fxml"));

		Parent load = loader.load();
		loader.setController(this);
		mainPane.setCenter(load);

		mainPane.getChildren().clear();
		mainPane.setTop(load);

		Image image = new Image("/images/Banner.jpg");
		imageWallUser.setImage(image);
		Image image2 = new Image("/images/BannerCasaDorada.jpg");
		imageBannerUser.setImage(image2);

		inicializateTableViewUsers();
	}

	@FXML
	public void modifyUser(ActionEvent event) {

		boolean verific = false;
		boolean verificPassword = false;

		if(tvUser.getSelectionModel().isEmpty()) {

			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("ERROR");
			alert.setHeaderText("No se pudo actualizar el usuario");
			alert.setContentText("Debe seleccionar uno de la lista");
			alert.showAndWait();
		}
		else {

			String name = listUsers.get(tvUser.getSelectionModel().getSelectedIndex()).getName();
			String lastName = listUsers.get(tvUser.getSelectionModel().getSelectedIndex()).getLastName();
			String id = listUsers.get(tvUser.getSelectionModel().getSelectedIndex()).getId();
			String userName = listUsers.get(tvUser.getSelectionModel().getSelectedIndex()).getUserName();

			User user = laCasaDorada.findUser(name,lastName,id,userName);

			if(!updateName.getText().isEmpty() && !updateName.getText().equals(name)) {
				name = updateName.getText();
				verific = true;
				user.getUsersCreators().setLastModifier(usersModifiers.getCreateObject());
			}
			if(!updateLasName.getText().isEmpty() && !updateLasName.getText().equals(lastName)) {
				lastName = updateLasName.getText();
				verific = true;
				user.getUsersCreators().setLastModifier(usersModifiers.getCreateObject());
			}
			if(!updateId.getText().isEmpty() && !updateId.getText().equals(id)) {
				id = updateId.getText();
				verific = true;
				user.getUsersCreators().setLastModifier(usersModifiers.getCreateObject());
			}
			if(!updateUser.getText().isEmpty() && !updateUser.getText().equals(userName)) {
				userName = updateUser.getText();
				verific = true;
				user.getUsersCreators().setLastModifier(usersModifiers.getCreateObject());
			}
			if(!lastPassword.getText().isEmpty() && !lastPassword.getText().equals(user.getPassword())) {

				Alert alert = new Alert(AlertType.ERROR);
				alert.setTitle("ERROR");
				alert.setHeaderText("No se puede actualizar la contraseña");
				alert.setContentText("La contraseña anterior no coincide con la que se está ingresando");
				alert.showAndWait();

			}else if(!newPassword.getText().isEmpty() && !confirmPassword.getText().isEmpty() && newPassword.getText().equals(confirmPassword.getText())){
				user.setPassword(newPassword.getText());
				verificPassword = true;
			}

			if(verific && verificPassword) {
				Alert alerts = new Alert(AlertType.INFORMATION);
				alerts.setTitle("EXCELENTE");
				alerts.setHeaderText("Se ha actualizado toda la información.");
				alerts.setContentText("Se ha actualizado la contraseña y los demás datos del usuario exitosamente");
				alerts.showAndWait();
			}
			else if(verific) {
				Alert alerts = new Alert(AlertType.INFORMATION);
				alerts.setTitle("EXCELENTE");
				alerts.setHeaderText("Se ha actualizado toda la información.");
				alerts.setContentText("Los datos del usuario han sido actualizados exitosamente");
				alerts.showAndWait();
			}
			else if(verificPassword) {
				Alert alerts = new Alert(AlertType.INFORMATION);
				alerts.setTitle("EXCELENTE");
				alerts.setHeaderText("Se ha actualizado la contraseña.");
				alerts.setContentText("La contraseña del usuario ha sido actualizada exitosamente");
				alerts.showAndWait();
			}

			user.setName(name);
			user.setLastName(lastName);
			user.setId(id);
			user.setUserName(userName);

			listUsers.set(tvUser.getSelectionModel().getSelectedIndex(),new User(name,lastName,id,userName,user.getPassword(),user.getState(),user.getUsersCreators()));

			updateName.setText("");
			updateLasName.setText("");
			updateId.setText("");
			updateUser.setText("");
			lastPassword.setText("");
			newPassword.setText("");
			confirmPassword.setText("");
		}
	}

	@FXML
	public void mouseClickedUser(MouseEvent event) {

		String name = listUsers.get(tvUser.getSelectionModel().getSelectedIndex()).getName();
		String lastName = listUsers.get(tvUser.getSelectionModel().getSelectedIndex()).getLastName();
		String id = listUsers.get(tvUser.getSelectionModel().getSelectedIndex()).getId();
		String userName = listUsers.get(tvUser.getSelectionModel().getSelectedIndex()).getUserName();

		updateName.setText(name);
		updateLasName.setText(lastName);
		updateId.setText(id);
		updateUser.setText(userName);
	}

	@FXML
	public void listClient(ActionEvent event) throws IOException {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("listClient-pane.fxml"));

		loader.setController(this);
		Parent load = loader.load();
		mainPane.setCenter(load);

		mainPane.getChildren().clear();
		mainPane.setTop(load);

		Image image = new Image("/images/Banner.jpg");
		imageWallClient.setImage(image);
		Image image2 = new Image("/images/BannerCasaDorada.jpg");
		imageBannerClient.setImage(image2);

		inicializateTableViewClients();
	}

	@FXML
	public void modifyClient(ActionEvent event) {

		if(tvClient.getSelectionModel().isEmpty()) {

			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("ERROR");
			alert.setHeaderText("No se pudo actualizar el usuario");
			alert.setContentText("Debe seleccionar uno de la lista");
			alert.showAndWait();
		}
		else {

			String name = listClient.get(tvClient.getSelectionModel().getSelectedIndex()).getName();
			String lastName = listClient.get(tvClient.getSelectionModel().getSelectedIndex()).getLastName();
			String id = listClient.get(tvClient.getSelectionModel().getSelectedIndex()).getId();
			String address = listClient.get(tvClient.getSelectionModel().getSelectedIndex()).getAddress();
			String telephone = listClient.get(tvClient.getSelectionModel().getSelectedIndex()).getTelephone();
			String obsClient= listClient.get(tvClient.getSelectionModel().getSelectedIndex()).getFieldOfObservations();

			Client client= laCasaDorada.findObjClient(name,lastName);

			if(!updateNameClient.getText().isEmpty() && !updateNameClient.getText().equals(name)) {
				name = updateNameClient.getText();
				client.getUsersCreators().setLastModifier(usersModifiers.getCreateObject());
			}
			if(!updateLasNameClient.getText().isEmpty() && !updateLasNameClient.getText().equals(lastName)) {
				lastName = updateLasNameClient.getText();
				client.getUsersCreators().setLastModifier(usersModifiers.getCreateObject());
			}
			if(!updateIdClient.getText().isEmpty() && !updateIdClient.getText().equals(id)) {
				id = updateIdClient.getText();
				client.getUsersCreators().setLastModifier(usersModifiers.getCreateObject());
			}
			if(!updateAddressClient.getText().isEmpty() && !updateAddressClient.getText().equals(address)) {
				address = updateAddressClient.getText();
				client.getUsersCreators().setLastModifier(usersModifiers.getCreateObject());
			}
			if(!updateTelephoneClient.getText().isEmpty() && !updateTelephoneClient.getText().equals(telephone)) {
				telephone = updateTelephoneClient.getText();
				client.getUsersCreators().setLastModifier(usersModifiers.getCreateObject());
			}
			if(!updateObsClient.getText().isEmpty() && !updateObsClient.getText().equals(obsClient)) {
				obsClient = updateObsClient.getText();
				client.getUsersCreators().setLastModifier(usersModifiers.getCreateObject());
			}

			client.setName(name);
			client.setLastName(lastName);
			client.setId(id);
			client.setAddress(address);

			listClient.set(tvClient.getSelectionModel().getSelectedIndex(),new Client(name,lastName,id,client.getState(),address,telephone,obsClient,client.getUsersCreators()));

			updateNameClient.setText("");
			updateLasNameClient.setText("");
			updateIdClient.setText("");
			updateAddressClient.setText("");
			updateTelephoneClient.setText("");
			updateObsClient.setText("");
		}
	}

	@FXML
	public void mouseClickedClient(MouseEvent event) {

		String name = listClient.get(tvClient.getSelectionModel().getSelectedIndex()).getName();
		String lastName = listClient.get(tvClient.getSelectionModel().getSelectedIndex()).getLastName();
		String id = listClient.get(tvClient.getSelectionModel().getSelectedIndex()).getId();
		String address = listClient.get(tvClient.getSelectionModel().getSelectedIndex()).getAddress();
		String telephone = listClient.get(tvClient.getSelectionModel().getSelectedIndex()).getTelephone();
		String obsClient= listClient.get(tvClient.getSelectionModel().getSelectedIndex()).getFieldOfObservations();

		updateNameClient.setText(name);
		updateLasNameClient.setText(lastName);
		updateIdClient.setText(id);
		updateAddressClient.setText(address);
		updateTelephoneClient.setText(telephone);
		updateObsClient.setText(obsClient);
	}

	@FXML
	public void listEmployee(ActionEvent event) throws IOException {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("listEmployee-pane.fxml"));

		loader.setController(this);
		Parent load = loader.load();
		mainPane.setCenter(load);

		mainPane.getChildren().clear();
		mainPane.setTop(load);

		Image image = new Image("/images/Banner.jpg");
		imageWallListEmployee.setImage(image);
		Image image2 = new Image("/images/BannerCasaDorada.jpg");
		imageBannerListEmployee.setImage(image2);

		inicializateTableViewEmployee();
	}

	@FXML
	public void modifyEmployee(ActionEvent event) {

		if(tvEmployee.getSelectionModel().isEmpty()) {

			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("ERROR");
			alert.setHeaderText("No se pudo actualizar el usuario");
			alert.setContentText("Debe seleccionar uno de la lista");
			alert.showAndWait();
		}
		else {

			String name = listEmployee.get(tvEmployee.getSelectionModel().getSelectedIndex()).getName();
			String lastName = listEmployee.get(tvEmployee.getSelectionModel().getSelectedIndex()).getLastName();
			String id = listEmployee.get(tvEmployee.getSelectionModel().getSelectedIndex()).getId();

			Employee employee= laCasaDorada.findObjEmployee(id);

			if(!updateNameEmployee.getText().isEmpty() && !updateNameEmployee.getText().equals(name)) {
				name = updateNameEmployee.getText();
				employee.getUsersCreators().setLastModifier(usersModifiers.getCreateObject());
			}
			if(!updateLastNameEmployee.getText().isEmpty() && !updateLastNameEmployee.getText().equals(lastName)) {
				lastName = updateLastNameEmployee.getText();
				employee.getUsersCreators().setLastModifier(usersModifiers.getCreateObject());
			}
			if(!updateIdEmployee.getText().isEmpty() && !updateIdEmployee.getText().equals(id)) {
				id = updateIdEmployee.getText();
				employee.getUsersCreators().setLastModifier(usersModifiers.getCreateObject());
			}

			employee.setName(name);
			employee.setLastName(lastName);
			employee.setId(id);

			listEmployee.set(tvEmployee.getSelectionModel().getSelectedIndex(),new Employee(name,lastName,id,employee.getState(),employee.getUsersCreators()));

			updateNameEmployee.setText("");
			updateLastNameEmployee.setText("");
			updateIdEmployee.setText("");
		}
	}

	@FXML
	public void mouseClickedEmployee(MouseEvent event) {

		String name = listEmployee.get(tvEmployee.getSelectionModel().getSelectedIndex()).getName();
		String lastName = listEmployee.get(tvEmployee.getSelectionModel().getSelectedIndex()).getLastName();
		String id = listEmployee.get(tvEmployee.getSelectionModel().getSelectedIndex()).getId();

		updateNameEmployee.setText(name);
		updateLastNameEmployee.setText(lastName);
		updateIdEmployee.setText(id);
	}

	@FXML
	public void listOrderStart(ActionEvent event) throws IOException {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("listOrders.fxml"));
		loader.setController(this);
		Parent load = loader.load();
		mainPane.setCenter(load);

		mainPane.getChildren().clear();
		mainPane.setTop(load);
		Image image = new Image("/images/Banner.jpg");
		imageWallListOrder.setImage(image);
		Image image2 = new Image("/images/BannerCasaDorada.jpg");
		imageBannerListOrder.setImage(image2);

		stateOrder.setPromptText("Seleccione el estado del pedido");
		stateOrder.getItems().addAll(StateOrder.SOLICITADO,StateOrder.EN_PROCESO,StateOrder.ENVIADO,StateOrder.ENTREGADO,StateOrder.CANCELADO);

		inicializateTableViewOrders();

	}

	public void inicializateTableViewOrders() {

		listOrders = FXCollections.observableArrayList(laCasaDorada.getOrder());

		tvListOrders.setItems(listOrders);
		nameOrder.setCellValueFactory(new PropertyValueFactory<Order,String>("code"));
		estateOrder.setCellValueFactory(new PropertyValueFactory<Order,String>("State"));
		productOrder.setCellValueFactory(new PropertyValueFactory<Order,String>("nameProduct"));
		amountOrder.setCellValueFactory(new PropertyValueFactory<Order,Integer>("amountProduct"));
		clientOrder.setCellValueFactory(new PropertyValueFactory<Order,String>("nameClient"));
		employeeOrder.setCellValueFactory(new PropertyValueFactory<Order,String>("nameEmployee"));
		dateOrder.setCellValueFactory(new PropertyValueFactory<Order,String>("dateDay"));
	}

	@FXML
	public void listProduct(ActionEvent event) throws IOException {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("listProduct.fxml"));

		loader.setController(this);
		Parent load = loader.load();
		mainPane.setCenter(load);

		mainPane.getChildren().clear();
		mainPane.setTop(load);

		Image image = new Image("/images/Banner.jpg");
		imageWallListProduct.setImage(image);
		Image image2 = new Image("/images/BannerCasaDorada.jpg");
		imageBannerListProduct.setImage(image2);

		ArrayList<Size> size = laCasaDorada.getSizes();
		ArrayList<ProductType> productType = laCasaDorada.getProductType();

		updateTypeProduct.setPromptText("Seleccione el tipo de producto");

		for (int i = 0; i < productType.size(); i++) {
			updateTypeProduct.getItems().addAll(productType.get(i).getName());
		}

		comboSizeProduct.setPromptText("Seleccione el tamaño del producto");

		for (int i = 0; i < size.size(); i++) {
			comboSizeProduct.getItems().addAll(size.get(i).getSize());
		}

		inicializateTableViewProduct();
	}

	@FXML
	public void modifyListOrders(ActionEvent event) {

		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("ERROR");

		if(tvListOrders.getSelectionModel().isEmpty()) {

			alert.setHeaderText("No se pudo actualizar el usuario");
			alert.setContentText("Debe seleccionar uno de la lista");
			alert.showAndWait();
		}
		else {

			boolean verify = false;

			ArrayList<Product> products = new ArrayList<>();
			ArrayList<Integer> amounts = new ArrayList<>();

			String code = listOrders.get(tvListOrders.getSelectionModel().getSelectedIndex()).getCode();
			String state = listOrders.get(tvListOrders.getSelectionModel().getSelectedIndex()).getState().toString();
			products = listOrders.get(tvListOrders.getSelectionModel().getSelectedIndex()).getProducts();
			amounts = listOrders.get(tvListOrders.getSelectionModel().getSelectedIndex()).getAmount();
			String client = listOrders.get(tvListOrders.getSelectionModel().getSelectedIndex()).getOrderClient().getName();
			String employee = listOrders.get(tvListOrders.getSelectionModel().getSelectedIndex()).getOrderEmployee().getName();
			String obsOrder = listOrders.get(tvListOrders.getSelectionModel().getSelectedIndex()).getFieldOfObservations();

			Order order = laCasaDorada.findOrder(code);


			if(!updateNameOrder.getText().isEmpty() && !updateNameOrder.getText().equals(code)) {
				code = updateNameOrder.getText();
				order.getUsersCreators().setLastModifier(usersModifiers.getCreateObject());
				verify = true;
			}

			if(!stateOrderList.getValue().equals(state)) {

				if(laCasaDorada.searchState(state,stateOrderList.getValue()) != -1) {
					state = stateOrderList.getValue();
					order.getUsersCreators().setLastModifier(usersModifiers.getCreateObject());
					verify = true;
				}
			}

			if(!updateProductsOrder.getText().isEmpty() && objListProducts(updateProductsOrder.getText()).size() != 0) {
				products = objListProducts(updateProductsOrder.getText());
				order.getUsersCreators().setLastModifier(usersModifiers.getCreateObject());
				verify = true;
			}

			if(!updateAmountOrder.getText().isEmpty() && objListProducts(updateAmountOrder.getText()).size() != 0) {
				amounts = objListAmounts(updateProductsOrder.getText(), products.size());
				order.getUsersCreators().setLastModifier(usersModifiers.getCreateObject());
				verify = true;
			}


			if(!nameClientList.getText().isEmpty() && !nameClientList.getText().equals(client)) {
				client = nameClientList.getText();
				order.getUsersCreators().setLastModifier(usersModifiers.getCreateObject());
				verify = true;
			}

			if(!nameEmployeeList.getText().isEmpty() && !nameEmployeeList.getText().equals(employee)) {
				employee = nameClientList.getText();
				order.getUsersCreators().setLastModifier(usersModifiers.getCreateObject());
				verify = true;
			}

			if(!obsOders.getText().isEmpty() && !obsOders.getText().equals(obsOrder)) {
				obsOrder = obsOders.getText();
				order.getUsersCreators().setLastModifier(usersModifiers.getCreateObject());
				verify = true;
			}

			order.setCode(code);
			order.setState(laCasaDorada.findState(state));
			order.setProducts(products);
			order.setAmount(amounts);
			order.setOrderClient(laCasaDorada.findObjClient(client));
			order.setOrderEmployee(laCasaDorada.findEmployee(employee));
			order.setFieldOfObservations(obsOrder);

			listOrders.set(tvListOrders.getSelectionModel().getSelectedIndex(),new Order(code,laCasaDorada.findState(state),amounts,
					order.getDate(),obsOrder,laCasaDorada.findObjClient(client),products,laCasaDorada.findEmployee(employee),order.getUsersCreators()));

			updateNameProduct.setText("");
			updateIngredientProduct.setText("");
			updateTypeProduct.setValue("");
			comboSizeProduct.setValue("");
			updatePriceProduct.setText("");

			if(verify) {
				Alert alert1 = new Alert(AlertType.INFORMATION);
				alert1.setTitle("EXCELENT");
				alert1.setHeaderText("Se ha actualizado la información");
				alert1.setContentText(null);
				alert1.showAndWait();

			}else {
				alert.setHeaderText("No se pudo actualizar el usuario");
				alert.setContentText("Ingresó los mismos datos anteriores o erróneos.");
				alert.showAndWait();
			}

		} 
	}


	@FXML
	public void modifyListProduct(ActionEvent event) {

		if(tvListProduct.getSelectionModel().isEmpty()) {

			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("ERROR");
			alert.setHeaderText("No se pudo actualizar el usuario");
			alert.setContentText("Debe seleccionar uno de la lista");
			alert.showAndWait();
		}
		else {

			ArrayList<Ingredient> ingredients = new ArrayList<>();

			String name = listOfProducts.get(tvListProduct.getSelectionModel().getSelectedIndex()).getName();
			ingredients = listOfProducts.get(tvListProduct.getSelectionModel().getSelectedIndex()).getIngredients();
			String type = listOfProducts.get(tvListProduct.getSelectionModel().getSelectedIndex()).getProductType().getName();
			String size = listOfProducts.get(tvListProduct.getSelectionModel().getSelectedIndex()).getSizes().getSize();
			String price = listOfProducts.get(tvListProduct.getSelectionModel().getSelectedIndex()).getPrice().toString();
			double priceNum = listOfProducts.get(tvListProduct.getSelectionModel().getSelectedIndex()).getPrice();

			Product product = laCasaDorada.findProducts(name);


			if(!updateNameProduct.getText().isEmpty() && !updateNameProduct.getText().equals(name)) {
				name = updateNameProduct.getText();
				product.getUsersCreators().setLastModifier(usersModifiers.getCreateObject());
			}
			if(!updateIngredientProduct.getText().isEmpty() && objListIngredients(updateIngredientProduct.getText()).size() != 0 ) {
				ingredients = objListIngredients(updateIngredientProduct.getText());
				product.getUsersCreators().setLastModifier(usersModifiers.getCreateObject());

				if(updateTypeProduct.getValue() != null && updateTypeProduct.getValue().equals(type)) {
					type = updateTypeProduct.getValue();
					product.getUsersCreators().setLastModifier(usersModifiers.getCreateObject());
				}
				if(comboSizeProduct.getValue() != null && comboSizeProduct.getValue().equals(size)) {
					size = comboSizeProduct.getValue();
					product.getUsersCreators().setLastModifier(usersModifiers.getCreateObject());
				}
				try {

					if(!updatePriceProduct.getText().isEmpty() && !updatePriceProduct.getText().equals(price)) {

						priceNum = Double.parseDouble(updatePriceProduct.getText());
					}

					product.setName(name);
					product.setIngredients(ingredients);
					product.setProductType(laCasaDorada.findType(type));
					product.setSizes(laCasaDorada.findSize(size));
					product.setPrice(priceNum);

					listOfProducts.set(tvListProduct.getSelectionModel().getSelectedIndex(),new Product(name,ingredients,laCasaDorada.findType(type),laCasaDorada.findSize(size),priceNum,product.getUsersCreators()));

					updateNameProduct.setText("");
					updateIngredientProduct.setText("");
					updateTypeProduct.setValue("");
					comboSizeProduct.setValue("");
					updatePriceProduct.setText("");
				} catch (NumberFormatException e) {
					Alert alert = new Alert(AlertType.ERROR);
					alert.setHeaderText("No ingresó un número");
					alert.setContentText("Debe ingresar un valor númerico en el campo de precio del producto");
					alert.showAndWait();
				}
			}
		}
	}

	public ArrayList<Ingredient> objListIngredients(String ingredient){

		ArrayList<Ingredient> listIngredient = new ArrayList<>();

		String[] partsIngredients = ingredient.split(";");

		boolean verific = false;

		for (int i = 0; i < partsIngredients.length && !verific; i++) {

			Ingredient objIngredient = laCasaDorada.findIngredient(partsIngredients[i]);

			if(objIngredient != null) {

				listIngredient.add(objIngredient);
			}
			else {
				verific = true;
			}
		}

		if(verific) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("ERROR");
			alert.setHeaderText("No se pudo actualizar la lista de ingredientes");
			alert.setContentText("Hay uno o más ingredientes de la lista que no existen");
			alert.showAndWait();
		}

		return listIngredient;
	}

	public ArrayList<Product> objListProducts(String product){

		ArrayList<Product> listProduct = new ArrayList<>();

		String[] partsProducts = product.split(";");

		boolean verific = false;

		for (int i = 0; i < partsProducts.length && !verific; i++) {

			Product objProduct = laCasaDorada.findProducts(partsProducts[i]);

			if(objProduct != null) {

				listProduct.add(objProduct);
			}
			else {
				verific = true;
			}
		}

		if(verific) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("ERROR");
			alert.setHeaderText("No se pudo actualizar la lista de productos");
			alert.setContentText("Hay uno o más productos de la lista que no existen");
			alert.showAndWait();
		}

		return listProduct;
	}

	public ArrayList<Integer> objListAmounts(String amount, int size){

		ArrayList<Integer> listAmount = new ArrayList<>();
		String[] partsAmounts = amount.split(";");

		for (int i = 0; i < partsAmounts.length; i++) {

			try {

				int partsAmount = Integer.parseInt(partsAmounts[i]);
				listAmount.add(partsAmount);

				if(size != listAmount.size()) {
					Alert alert = new Alert(AlertType.ERROR);
					alert.setTitle("ERROR");
					alert.setHeaderText("No se pudo actualizar las cantidades de los productos");
					alert.setContentText("Agregó un número incorrecto de cantidades (más o menos). Tiene que haber igual número de cantidades que de productos");
					alert.showAndWait();
				}
			}catch (NumberFormatException e) {
				Alert alert = new Alert(AlertType.ERROR);
				alert.setHeaderText("No ingresó un número");
				alert.setContentText("Debe ingresar un valor númerico en el campo de precio del producto");
				alert.showAndWait();
			}
		}

		return listAmount;
	}


	@FXML
	public void mouseClickedListProduct(MouseEvent event) {

		ArrayList<Ingredient> ingredients = new ArrayList<>();

		String name = listOfProducts.get(tvListProduct.getSelectionModel().getSelectedIndex()).getName();
		ingredients = listOfProducts.get(tvListProduct.getSelectionModel().getSelectedIndex()).getIngredients();
		String type = listOfProducts.get(tvListProduct.getSelectionModel().getSelectedIndex()).getProductType().getName();
		String size = listOfProducts.get(tvListProduct.getSelectionModel().getSelectedIndex()).getSizes().getSize();
		String price = listOfProducts.get(tvListProduct.getSelectionModel().getSelectedIndex()).getPrice().toString();

		String ingredientMessage = ingredientsToMessage(ingredients);

		updateNameProduct.setText(name);
		updateIngredientProduct.setText(ingredientMessage);
		updateTypeProduct.setValue(type);
		comboSizeProduct.setValue(size);
		updatePriceProduct.setText(price);
	}

	@FXML
	public void mouseClickedListOrder(MouseEvent event) {

		ArrayList<Product> products = new ArrayList<>();
		ArrayList<Integer> amounts = new ArrayList<>();

		String state = listOrders.get(tvListOrders.getSelectionModel().getSelectedIndex()).getState().toString();
		products = listOrders.get(tvListOrders.getSelectionModel().getSelectedIndex()).getProducts();
		amounts = listOrders.get(tvListOrders.getSelectionModel().getSelectedIndex()).getAmount();
		String client = listOrders.get(tvListOrders.getSelectionModel().getSelectedIndex()).getOrderClient().getName();
		String employee = listOrders.get(tvListOrders.getSelectionModel().getSelectedIndex()).getOrderEmployee().getName();
		String obsOrder = listOrders.get(tvListOrders.getSelectionModel().getSelectedIndex()).getFieldOfObservations();

		String productMessage = productsToMessage(products);
		String amountMessage = amountsToMessage(amounts);

		estateOrder.setText(state);
		updateProductsOrder.setText(productMessage);
		updateAmountOrder.setText(amountMessage);
		nameClientList.setText(client);
		nameEmployeeList.setText(employee);
		obsOders.setText(obsOrder);
	}

	public String ingredientsToMessage(ArrayList<Ingredient> ingredient) {

		String message = "";

		for (int i = 0; i < ingredient.size(); i++) {

			if(i != ingredient.size()-1) {

				message += ingredient.get(i).getName()+"-";
			}
			else {
				message += ingredient.get(i).getName();
			}
		}
		return message;
	}

	public String productsToMessage(ArrayList<Product> product) {

		String message = "";

		for (int i = 0; i < product.size(); i++) {

			if(i != product.size()-1) {

				message += product.get(i).getName()+"-";
			}
			else {
				message += product.get(i).getName();
			}
		}
		return message;
	}

	public String amountsToMessage(ArrayList<Integer> amounts) {

		String message = "";

		for (int i = 0; i < amounts.size(); i++) {

			if(i != amounts.size()-1) {

				message += amounts.get(i)+"-";
			}
			else {
				message += amounts.get(i);
			}
		}
		return message;
	}
}