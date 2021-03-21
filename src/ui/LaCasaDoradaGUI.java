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
import model.PreOrder;
import model.Product;
import model.ProductType;
import model.Size;
import model.State;
import model.StateOrder;
import model.User;

public class LaCasaDoradaGUI {

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
	private TableColumn<PreOrder, Product> colName;

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

	public static ObservableList<Product> listProduct;
	public static ObservableList<User> listUsers;
	public static ObservableList<PreOrder> observableList;
	public static ObservableList<Ingredient> listIngredients;

	public LaCasaDoradaGUI(LaCasaDorada laCasaDorada) {
		this.laCasaDorada = laCasaDorada;
	}

	public void initializateTableViewUsers() {

		listUsers = FXCollections.observableArrayList(laCasaDorada.getUsers());

		tvUser.setItems(listUsers);
		tcName.setCellValueFactory(new PropertyValueFactory<User,String>("name"));
		tcLastName.setCellValueFactory(new PropertyValueFactory<User,String>("lastName"));
		tcId.setCellValueFactory(new PropertyValueFactory<User,String>("id"));
		tcUser.setCellValueFactory(new PropertyValueFactory<User,String>("userName"));
	}

	@FXML
	public void loadBanner() throws IOException {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("main-image.fxml"));

		loader.setController(this);
		Parent load = loader.load();  

		mainPane.getChildren().clear();
		mainPane.setCenter(load);

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

					laCasaDorada.create(name.getText(), lastName.getText(), id.getText(), nameUser.getText(), password.getText(), State.ENABLE);
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

					laCasaDorada.create(name.getText(), lastName.getText(), id.getText(), nameUser.getText(), password.getText(), State.ENABLE);
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
						adressClient.getText(), telephoneClient.getText(), fieldObservations.getText());
				mainMenu();

			}else {

				alert.setHeaderText("No se pudo crear el Cliente");
				alert.setContentText("Ya hay clientes con ese nombre y apellido");
				alert.showAndWait();
			}

		} else if(!nameClient.getText().equals("") && !lastNameClient.getText().equals("") && !adressClient.getText().equals("") && 
				!telephoneClient.getText().equals("") && !fieldObservations.getText().equals("")) {

			Alert alerts = new Alert(AlertType.INFORMATION);
			alerts.setTitle("EXCELENTE");
			alerts.setHeaderText("Se ha registrado exitosamente.");
			alerts.setContentText("Se ha registrado a "+nameClient.getText()+" exitosamente");
			alerts.showAndWait();

			laCasaDorada.create(name.getText(), lastName.getText(), null, nameUser.getText(), password.getText(), State.ENABLE);
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

				laCasaDorada.create(nameEmployee.getText(),lastNameEmployee.getText(),idEmployee.getText(),State.ENABLE);

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

		Image image = new Image("images/BannerCasaDorada.jpg");
		imageBannerOrders.setImage(image);
		Image image2 = new Image("/images/BannerCasaDorada.jpg");
		imageWallOrders.setImage(image2);

		ArrayList<Product> products = laCasaDorada.getProduct();
		inicializateTableView();
		selectProduct.setPromptText("Seleccione el producto");

		for (int i = 0; i < products.size(); i++) {
			selectProduct.getItems().add(products.get(i).getName());
		}

		stateOrder.setPromptText("Seleccione el estado del pedido");
		stateOrder.getItems().addAll(StateOrder.SOLICITADO,StateOrder.EN_PROCESO,StateOrder.ENVIADO,StateOrder.ENTREGADO,StateOrder.CANCELADO);
	}

	@FXML
	public void addOrder(ActionEvent event)throws IOException {

		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("ERROR");

		if(!txtEmployeeOrder.getText().equals("") && !txtClientOrder.getText().equals("") && !txtFieldOrder.getText().equals("") && 
				stateOrder.getValue() != null && !observableList.isEmpty()){

			try {

				Employee employee = laCasaDorada.findEmployee(txtEmployeeOrder.getText());
				Client client = laCasaDorada.findClient(txtClientOrder.getText());

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

					laCasaDorada.create(stateOrder.getValue(), amount, date, txtFieldOrder.getText(),client,products,employee);
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
					laCasaDorada.create(nameOfProduct.getText(), ingredients, type, sizes, price);

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

		Image image = new Image("images/BannerCasaDorada.jpg");
		imageBannerProduct.setImage(image);
		Image image2 = new Image("/images/BannerCasaDorada.jpg");
		imageWallProduct.setImage(image2);

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

			listIngredients.set(tvProduct.getSelectionModel().getSelectedIndex(),new Ingredient(name));

			selectIngredient.setValue(null);
		}
	}

	@FXML
	public void mouseClickedProduct(MouseEvent event) {

		String name = listIngredients.get(tvProduct.getSelectionModel().getSelectedIndex()).getName();

		selectIngredient.setValue(name);
	}

	private void inicializateTableViewProducts(ArrayList<Ingredient> ingre) {

		listIngredients = FXCollections.observableArrayList(ingre);

		tvProduct.setItems(listIngredients);

		colIngredient.setCellValueFactory(new PropertyValueFactory<Ingredient,String>("Name")); 
	}
	
	private void inicializateTableView() {

		observableList = FXCollections.observableArrayList(laCasaDorada.getPreorder());

		tvOrder.setItems(observableList);

		colName.setCellValueFactory(new PropertyValueFactory<PreOrder,Product>("Name")); 
		colAmount.setCellValueFactory(new PropertyValueFactory<PreOrder,Integer>("Amount"));
	}

	@FXML
	public void ordersProducts(ActionEvent event)throws IOException {
		
		int amounts = 0;
		
		if(!amount.getText().equals("")) {
			amounts = Integer.parseInt(amount.getText());
			
		}else {
			amounts = 1;
		}
	
		Product products = laCasaDorada.findProducts(selectProduct.getValue());
		observableList.add(new PreOrder(products,amounts));
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

				laCasaDorada.create(nameIngredient.getText());
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

				laCasaDorada.createTypeProduct(typeProduct.getText());
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

		loader.setController(this);
		Parent load = loader.load();
		mainPane.setCenter(load);

		mainPane.getChildren().clear();
		mainPane.setTop(load);

		Image image = new Image("/images/Banner.jpg");
		imageWallUser.setImage(image);
		Image image2 = new Image("/images/BannerCasaDorada.jpg");
		imageBannerUser.setImage(image2);

		initializateTableViewUsers();
	}

	@FXML
	public void modify(ActionEvent event) {

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
			}
			if(!updateLasName.getText().isEmpty() && !updateLasName.getText().equals(lastName)) {
				lastName = updateLasName.getText();
				verific = true;
			}
			if(!updateId.getText().isEmpty() && !updateId.getText().equals(id)) {
				id = updateId.getText();
				verific = true;
			}
			if(!updateUser.getText().isEmpty() && !updateUser.getText().equals(userName)) {
				userName = updateUser.getText();
				verific = true;
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

			listUsers.set(tvUser.getSelectionModel().getSelectedIndex(),new User(name,lastName,id,userName,user.getPassword(),user.getState()));

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
	public void mouseClicked(MouseEvent event) {

		String name = listUsers.get(tvUser.getSelectionModel().getSelectedIndex()).getName();
		String lastName = listUsers.get(tvUser.getSelectionModel().getSelectedIndex()).getLastName();
		String id = listUsers.get(tvUser.getSelectionModel().getSelectedIndex()).getId();
		String userName = listUsers.get(tvUser.getSelectionModel().getSelectedIndex()).getUserName();

		updateName.setText(name);
		updateLasName.setText(lastName);
		updateId.setText(id);
		updateUser.setText(userName);
	}
}