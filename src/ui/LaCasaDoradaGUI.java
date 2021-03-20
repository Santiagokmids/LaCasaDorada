package ui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

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
import javafx.scene.layout.BorderPane;
import model.Client;
import model.Employee;
import model.LaCasaDorada;
import model.Order;
import model.PreOrder;
import model.Product;
import model.State;
import model.StateOrder;

public class LaCasaDoradaGUI {

	@FXML
	private ImageView imageBannerUser;

	@FXML
	private ImageView imageWallUser;

	@FXML
	private TableView<?> tvUser;

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
	private ComboBox<Product> selectProduct;

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
	private ImageView imageBannerOrders;
	
	static ObservableList<PreOrder> observableList;
	
	public LaCasaDoradaGUI(LaCasaDorada laCasaDorada) {
		this.laCasaDorada = laCasaDorada;
	}

	public void initialize() {
		//the method (initialize) is called several times by diferents fxml file loads 
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
			loadLogin();
		}
		else {

			alert.setHeaderText("No se pudo crear el Usuario");
			alert.setContentText("Debe llenar todos los campos para crear el usuario");
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
		mainPane.setCenter(addOrder);

		Image image = new Image("images/BannerCasaDorada.jpg");
		imageBannerOrders.setImage(image);
		Image image2 = new Image("/images/BannerCasaDorada.jpg");
		imageBannerOrders.setImage(image2);
		
		initializeTableView();
		ArrayList<Product> products = laCasaDorada.getProduct();
		selectProduct.setPromptText("Seleccione el producto");
		
		for (int i = 0; i < products.size(); i++) {
			selectProduct.getItems().add(products.get(i));
		}
	}
	
	@FXML
	public void addOrder(ActionEvent event)throws IOException {

		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("ERROR");
		
		int amounts = Integer.parseInt(amount.getText());
		ordersProducts(event, selectProduct.getValue(), amounts);
		
		if(!txtEmployeeOrder.getText().equals("") && !txtClientOrder.getText().equals("") && !txtFieldOrder.getText().equals("") && 
				stateOrder.getValue() != null && !observableList.isEmpty()){

			try {
				Alert alerts = new Alert(AlertType.INFORMATION);
				alerts.setTitle("EXCELENTE!");
				alerts.setHeaderText("Se ha añadido.");
				alerts.setContentText("Se ha añadido a exitosamente el pedido.");
				alerts.showAndWait();

				/*laCasaDorada.create(stateOrder.getValue(), ArrayList<Integer> amount, Date date, String fieldOfObservations, Client orderClient,
							ArrayList<Product>products, Employee ordEmployee);
					mainMenu();*/

			} catch (NumberFormatException nfe) {

				Alert alert1 = new Alert(AlertType.ERROR);
				alert1.setTitle("ERROR");
				alert1.setHeaderText("You should enter numbers in weidth and height");
				alert1.setContentText(null);

				alert.showAndWait();
			}

		}else {

			alert.setHeaderText("No se pudo Añadir el pedido");
			alert.setContentText("Debe llenar todos los campos para añadir el pedido");
			alert.showAndWait();
		}
	}
	
	@FXML
	public ArrayList<Product> ordersProducts(ActionEvent event, Product product, Integer amount)throws IOException {
		observableList.add(new PreOrder(product,amount));
		return null;
		
	}	
	
	 private void initializeTableView() {
		    
	    	observableList = FXCollections.observableArrayList(laCasaDorada.getPreorder());
	    
			tvOrder.setItems(observableList);
			
			colName.setCellValueFactory(new PropertyValueFactory<PreOrder,Product>("Name")); 
			colAmount.setCellValueFactory(new PropertyValueFactory<PreOrder,Integer>("Amount"));
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
	}

	@FXML
	public void modify(ActionEvent event) {

	}
}