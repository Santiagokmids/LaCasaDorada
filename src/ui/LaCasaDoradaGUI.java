package ui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
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

public class LaCasaDoradaGUI{

	@FXML
	private ImageView imageEnableWallProduct;

	@FXML
	private TextField nameEnableProduct;

	@FXML
	private ImageView imageEnableBannerProduct;

	@FXML
	private ImageView imageEnableWallProductType;

	@FXML
	private TextField nameEnableProductType;

	@FXML
	private ImageView imageEnableBannerProductType;

	@FXML
	private ImageView imageEnableWallIngredient;

	@FXML
	private TextField nameEnableIngredient;

	@FXML
	private ImageView imageEnableBannerIngredient;

	@FXML
	private ImageView imageEnableWallSize;

	@FXML
	private TextField nameEnableSize;

	@FXML
	private ImageView imageEnableBannerSize;

	@FXML
	private TextField nameUserDisable;

	@FXML
	private ImageView imageDisabledWallUser;

	@FXML
	private TextField nameDisabledUser;

	@FXML
	private ImageView imageDisabledBannerUser;

	@FXML
	private ImageView imageDisabledWallOrder;

	@FXML
	private TextField nameDisabledOrder;

	@FXML
	private ImageView imageDisabledBannerOrder;

	@FXML
	private ImageView imageDisabledWallProduct;

	@FXML
	private TextField nameDisabledProduct;

	@FXML
	private ImageView imageDisabledBannerProduct;

	@FXML
	private ImageView imageDisabledWallProductType;

	@FXML
	private TextField nameDisabledProductType;

	@FXML
	private ImageView imageDisabledBannerProductType;

	@FXML
	private ImageView imageDisabledWallSize;

	@FXML
	private TextField nameDisabledSize;

	@FXML
	private ImageView imageDisabledBannerSize;

	@FXML
	private ImageView imageDisabledWallIngredient;

	@FXML
	private TextField nameDisabledIngredient;

	@FXML
	private ImageView imageDisabledBannerIngredient;

	@FXML
	private ImageView imageDeleteWallIngredient;

	@FXML
	private TextField nameDeleteIngredient;

	@FXML
	private ImageView imageDeleteBannerIngredient;

	@FXML
	private ImageView imageDeleteWallProductType;

	@FXML
	private TextField nameDeleteProductType;

	@FXML
	private ImageView imageDeleteBannerProductType;

	@FXML
	private ImageView imageDeleteWallProduct;

	@FXML
	private TextField nameDeleteProduct;

	@FXML
	private ImageView imageDeleteBannerProduct;

	@FXML
	private ImageView imageDeleteWallUser;

	@FXML
	private TextField idDeleteUser;

	@FXML
	private TextField nameDeleteUser;

	@FXML
	private ImageView imageDeleteBannerUser;

	@FXML
	private ImageView imageDeleteWallEmployee;

	@FXML
	private TextField nameDeleteEmployee;

	@FXML
	private TextField lastNameDeleteEmployee;

	@FXML
	private TextField idDeleteEmployee;

	@FXML
	private ImageView imageDeleteBannerEmployee;

	@FXML
	private ImageView imageDeleteWall;

	@FXML
	private TextField nameDeleteClient;

	@FXML
	private TextField lastNameDeleteClient;

	@FXML
	private TextField phoneDeleteClient;

	@FXML
	private ImageView imageDeleteBanner;

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

	@FXML
	private ImageView imageBannerListIngredient;

	@FXML
	private ImageView imageWallListIngredient;

	@FXML
	private TableView<Ingredient> tvListIngredient;

	@FXML
	private TableColumn<Ingredient, String> tcNameIngredient;

	@FXML
	private TextField updateNameIngredient;

	@FXML
	private ImageView imageBannerListType;

	@FXML
	private ImageView imageWallListType;

	@FXML
	private TableView<ProductType> tvListType;

	@FXML
	private TableColumn<ProductType, String> tcNameType;

	@FXML
	private ImageView imageDeleteWallOrder;

	@FXML
	private TextField codeDeleteOrder;

	@FXML
	private ImageView imageDeleteOrder;

	@FXML
	private ImageView imageDeleteWallSize;

	@FXML
	private TextField nameDeleteSize;

	@FXML
	private ImageView imageDeleteSize;

	@FXML
	private ImageView imageBannerListSize;

	@FXML
	private ImageView imageWallListSize;

	@FXML
	private TableView<Size> tvListSize;

	@FXML
	private TableColumn<Size, String> tcNameSize;

	@FXML
	private TextField updateNameSize;

	@FXML
	private ImageView imageDisabledWallClient;

	@FXML
	private TextField nameDisabledClient;

	@FXML
	private TextField lastNameDisabledClient;

	@FXML
	private ImageView imageDisabledBannerClient;

	@FXML
	private ImageView imageDisabledWallEmployee;

	@FXML
	private TextField idDiseableEmployee;

	@FXML
	private ImageView imageDisabledBannerEmployee;

	@FXML
	private TextField updateNameType;

	@FXML
	private ImageView imageEnabledWallClient;

	@FXML
	private TextField nameEnabledClient;

	@FXML
	private TextField lastNameEnabledClient;

	@FXML
	private ImageView imageEnabledBannerClient;

	@FXML
	private ImageView imageEnabledWallOrder;

	@FXML
	private TextField nameEnabledOrder;

	@FXML
	private ImageView imageEnabledWallEmployee;

	@FXML
	private TextField idEnableEmployee;

	@FXML
	private ImageView imageEnabledBannerEmployee;

	@FXML
	private ImageView imageEnabledWallUser;

	@FXML
	private TextField idEnabledUser;

	@FXML
	private TextField nameUserEnable;

	@FXML
	private ImageView imageEnabledBannerUser;

	@FXML
	private ImageView imageEnabledBannerOrder;

	@FXML
	public Label clock;
	
	public static ObservableList<Product> listProduct;
	public static ObservableList<Ingredient> listOfIngredient;
	public static ObservableList<Order> listOrders;
	public static ObservableList<User> listUsers;
	public static ObservableList<PreOrder> observableList;
	public static ObservableList<Ingredient> listIngredients;
	public static ObservableList<Client> listClient;
	public static ObservableList<Employee> listEmployee;
	public static ObservableList<Size> listSizes;
	public static ObservableList<ProductType> listType;
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
					
					laCasaDorada.create(name.getText(), lastName.getText(), id.getText(), nameUser.getText(), password.getText(),null);

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

					laCasaDorada.create(name.getText(), lastName.getText(), id.getText(), nameUser.getText(), password.getText(), usersModifiers);
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
				User user = laCasaDorada.findUsersModifiers(txtUser.getText(), txtPassword.getText());
				User newUser = user;
				usersModifiers = laCasaDorada.create(user, user);
				
				if(user.getUsersCreators() == null) {
					laCasaDorada.deleteUser(user);
					laCasaDorada.create(newUser.getName(), newUser.getLastName(), newUser.getId(), newUser.getUserName(), newUser.getPassword(), usersModifiers);
					
				}
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

				laCasaDorada.create(nameClient.getText(), lastNameClient.getText(), idClient.getText(),
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

			laCasaDorada.create(nameClient.getText(), lastNameClient.getText(), idClient.getText(),
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

				laCasaDorada.createSize(txtSize.getText(), usersModifiers);
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

				laCasaDorada.create(nameEmployee.getText(),lastNameEmployee.getText(),idEmployee.getText(), usersModifiers);

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
		if(selectIngredient.getValue() != null) {
			listIngredients.add(new Ingredient(laCasaDorada.findIngredient(selectIngredient.getValue()).getName(), usersModifiers));
		}
		else {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("CUIDADO");
			alert.setHeaderText("No se pudo añadir un ingrediente a la lista");
			alert.setContentText("Necesita elegir un ingrediente para añadirlo a la lista");
			alert.showAndWait();
		}
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

			if(selectIngredient.getValue() != null && !selectIngredient.getValue().equalsIgnoreCase(name)) {
				name = selectIngredient.getValue();
				ingredient = laCasaDorada.findIngredient(name);
				verific = true;
			}

			if(verific) {

				listIngredients.set(tvProduct.getSelectionModel().getSelectedIndex(),new Ingredient(ingredient.getName(),ingredient.getUsersCreators()));

				Alert alerts = new Alert(AlertType.INFORMATION);
				alerts.setTitle("EXCELENTE");
				alerts.setHeaderText("Se ha reemplazado el ingrediente.");
				alerts.setContentText(null);
				alerts.showAndWait();

			}else {
				alert.setHeaderText("No se pudo Cambiar");
				alert.setContentText("Debe seleccionar un ingrediente de la lista que sea diferente al actual.");
				alert.showAndWait();
			}

			selectIngredient.setValue(name);
		}
	}

	@FXML
	public void mouseClickedProduct(MouseEvent event)  {

		if(tvProduct.getSelectionModel().isEmpty()) {
			Alert alerts = new Alert(AlertType.WARNING);
			alerts.setTitle("CUIDADO");
			alerts.setHeaderText("No se seleccionó ningún dato de la tabla.");
			alerts.setContentText(null);
			alerts.showAndWait();

		}else {
			String name = listIngredients.get(tvProduct.getSelectionModel().getSelectedIndex()).getName();

			selectIngredient.setValue(name);
		}
	}

	@FXML
	public void ordersProducts(ActionEvent event)throws IOException {

		int amounts = 0;
		try {
			if(!amount.getText().equals("") && !amount.getText().equals("0")) {
				amounts = Integer.parseInt(amount.getText());

			}else {
				amounts = 1;
			}

			if(selectProduct.getValue() != null) {
				Product product = laCasaDorada.findProducts(selectProduct.getValue());
				observableList.add(new PreOrder(product, amounts));
			}
			else {
				Alert alert = new Alert(AlertType.WARNING);
				alert.setTitle("CUIDADO");
				alert.setHeaderText("No se pudo añadir un producto a la lista");
				alert.setContentText("Necesita elegir un producto para añadirlo a la lista");
				alert.showAndWait();
			}
		}catch(NumberFormatException nfe) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("CUIDADO");
			alert.setHeaderText("No se pudo añadir una cantidad a la lista");
			alert.setContentText("Ingresó valores NO númericos.");
			alert.showAndWait();
		}

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

			if(selectProduct.getValue() != null && !selectProduct.getValue().equalsIgnoreCase(name)) {
				name = selectProduct.getValue();
				product = laCasaDorada.findProducts(selectProduct.getValue());
				verific = true;
			}

			try {
				int validation = Integer.parseInt(amount.getText());

				if(!amount.getText().isEmpty() && validation != amounts) {

					amounts = validation;
					verificAmount = true;
					System.out.println(amounts+" beforeeee");
				}

			}catch(NumberFormatException nfe) {

				alert.setHeaderText("NO se pudo actualizar la cantidad.");
				alert.setContentText("Ingres+o valore No númericos");
				alert.showAndWait();
			}

			Alert alerts = new Alert(AlertType.INFORMATION);
			alerts.setTitle("EXCELENTE");

			if(verific && verificAmount) {
				alerts.setHeaderText("Se han reemplazado los datos.");
				alerts.setContentText("Se ha reemplazado el producto y su cantidad.");
				alerts.showAndWait();

				preorder.setAmount(amounts);

			}else if(verific) {
				alerts.setHeaderText("Se ha reemplazado el producto.");
				alerts.setContentText(null);
				alerts.showAndWait();

			}else if(verificAmount) {
				alerts.setHeaderText("Se ha reemplazado la cantidad del producto.");
				alerts.setContentText(null);
				alerts.showAndWait();

				preorder.setAmount(amounts);
			}
			else {
				alert.setHeaderText("No se pudo Cambiar");
				alert.setContentText("Debe seleccionar un producto de la lista y seleccionar su respectiva cantidad");
				alert.showAndWait();
			}

			observableList.set(tvOrder.getSelectionModel().getSelectedIndex(),new PreOrder(product,amounts));

			selectIngredient.setValue(name);
		}
	}

	@FXML
	public void mouseClickedOrder(MouseEvent event) {

		if(tvOrder.getSelectionModel().isEmpty()) {
			Alert alerts = new Alert(AlertType.WARNING);
			alerts.setTitle("CUIDADO");
			alerts.setHeaderText("No se seleccionó ningún dato de la tabla.");
			alerts.setContentText(null);
			alerts.showAndWait();

		}else{  
			String product = observableList.get(tvOrder.getSelectionModel().getSelectedIndex()).getProduct().getName();
			Integer amounts = observableList.get(tvOrder.getSelectionModel().getSelectedIndex()).getAmount();

			selectProduct.setValue(product);
			String total = amounts.toString();
			amount.setText(total);
		}
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


		loader.setController(this);

		Parent load = loader.load();
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
			
			listUsers.set(tvUser.getSelectionModel().getSelectedIndex(),new User(name,lastName,id,userName,user.getPassword(),user.getUsersCreators()));

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

		if(tvUser.getSelectionModel().isEmpty()) {
			Alert alerts = new Alert(AlertType.WARNING);
			alerts.setTitle("CUIDADO");
			alerts.setHeaderText("No se seleccionó ningún dato de la tabla.");
			alerts.setContentText(null);
			alerts.showAndWait();

		}else {

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

			listClient.set(tvClient.getSelectionModel().getSelectedIndex(),new Client(name,lastName,id,address,telephone,obsClient,client.getUsersCreators()));

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

		if(tvClient.getSelectionModel().isEmpty()) {
			Alert alerts = new Alert(AlertType.WARNING);
			alerts.setTitle("CUIDADO");
			alerts.setHeaderText("No se seleccionó ningún dato de la tabla.");
			alerts.setContentText(null);
			alerts.showAndWait();

		}else {
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

			listEmployee.set(tvEmployee.getSelectionModel().getSelectedIndex(),new Employee(name,lastName,id,employee.getUsersCreators()));

			updateNameEmployee.setText("");
			updateLastNameEmployee.setText("");
			updateIdEmployee.setText("");
		}
	}

	@FXML
	public void mouseClickedEmployee(MouseEvent event) {

		if(tvEmployee.getSelectionModel().isEmpty()) {
			Alert alerts = new Alert(AlertType.WARNING);
			alerts.setTitle("CUIDADO");
			alerts.setHeaderText("No se seleccionó ningún dato de la tabla.");
			alerts.setContentText(null);
			alerts.showAndWait();

		}else{
			String name = listEmployee.get(tvEmployee.getSelectionModel().getSelectedIndex()).getName();
			String lastName = listEmployee.get(tvEmployee.getSelectionModel().getSelectedIndex()).getLastName();
			String id = listEmployee.get(tvEmployee.getSelectionModel().getSelectedIndex()).getId();

			updateNameEmployee.setText(name);
			updateLastNameEmployee.setText(lastName);
			updateIdEmployee.setText(id);
		}
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

		stateOrderList.setPromptText("Seleccione el estado del pedido");
		stateOrderList.getItems().addAll("SOLICITADO","EN_PROCESO","ENVIADO","ENTREGADO","CANCELADO");

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

			alert.setHeaderText("No se pudo actualizar la orden");
			alert.setContentText("Debe seleccionar una de la lista");
			alert.showAndWait();
		}
		else {

			boolean verify = false, states = false;

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


			if(!stateOrderList.getValue().equals(state)) {

				if(laCasaDorada.searchState(state,stateOrderList.getValue()) != -1) {
					state = stateOrderList.getValue();
					states = true;
					order.getUsersCreators().setLastModifier(usersModifiers.getCreateObject());

				}

			}else if(laCasaDorada.searchState(state,stateOrderList.getValue()) == 0) {
				states = true;
			}

			if(!updateProductsOrder.getText().isEmpty() && objListProducts(updateProductsOrder.getText()).size() != 0 && products != objListProducts(updateProductsOrder.getText())) {
				products = objListProducts(updateProductsOrder.getText());
				order.getUsersCreators().setLastModifier(usersModifiers.getCreateObject());
				verify = true;

				if(!updateAmountOrder.getText().isEmpty() && (objListAmounts(updateAmountOrder.getText())).size() == products.size() && amounts != objListAmounts(updateAmountOrder.getText())) {
					amounts = objListAmounts(updateAmountOrder.getText());
					order.getUsersCreators().setLastModifier(usersModifiers.getCreateObject());
					verify = true;
				}


				if(!nameClientList.getText().isEmpty() && !nameClientList.getText().equals(client) && laCasaDorada.findObjClient(nameClientList.getText()) != null) {
					client = nameClientList.getText();
					order.getUsersCreators().setLastModifier(usersModifiers.getCreateObject());
					verify = true;
				}

				if(!nameEmployeeList.getText().isEmpty() && !nameEmployeeList.getText().equals(employee) && laCasaDorada.findEmployee(nameEmployeeList.getText()) != null) {
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

				updateProductsOrder.setText("");
				updateAmountOrder.setText("");
				stateOrderList.setValue("");
				nameClientList.setText("");
				nameEmployeeList.setText("");
				obsOrdersList.setText("");

				if(verify) {

					if(!states){
						alert.setHeaderText("No se pudo cambiar el estado de la orden");
						alert.setContentText("El estado del pedido no se actualizó, pero los demás datos sí fueron actualizados");
						alert.showAndWait();
					}
					else {
						Alert alert1 = new Alert(AlertType.INFORMATION);
						alert1.setTitle("EXCELENT");
						alert1.setHeaderText("Se ha actualizado la información");
						alert1.setContentText(null);
						alert1.showAndWait();
					}

				}
				else {

					if(!states){
						alert.setHeaderText("No se pudo actualizar la orden");
						alert.setContentText("Ingresó los mismos datos anteriores o erróneos.");
						alert.showAndWait();
					}
					else {
						alert.setHeaderText("Se actualizó el estado de la orden");
						alert.setContentText("Sólo se actualizó el estado de la orden.");
						alert.showAndWait();
					}
				}

			}


		}

	} 

	@FXML
	public void modifyListProduct(ActionEvent event) {

		if(tvListProduct.getSelectionModel().isEmpty()) {

			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("ERROR");
			alert.setHeaderText("No se pudo actualizar el Producto");
			alert.setContentText("Debe seleccionar uno de la lista");
			alert.showAndWait();
		}
		else {

			ArrayList<Ingredient> ingredients = new ArrayList<>();
			boolean verify = false;

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
				verify = true;
			}
			if(!updateIngredientProduct.getText().isEmpty() && objListIngredients(updateIngredientProduct.getText()).size() != 0 ) {
				ingredients = objListIngredients(updateIngredientProduct.getText());
				product.getUsersCreators().setLastModifier(usersModifiers.getCreateObject());
				verify = true;

				if(updateTypeProduct.getValue() != null && updateTypeProduct.getValue().equals(type)) {
					type = updateTypeProduct.getValue();
					product.getUsersCreators().setLastModifier(usersModifiers.getCreateObject());
					verify = true;

				}
				if(comboSizeProduct.getValue() != null && comboSizeProduct.getValue().equals(size)) {
					size = comboSizeProduct.getValue();
					product.getUsersCreators().setLastModifier(usersModifiers.getCreateObject());
					verify = true;

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

					if(verify) {
						Alert alert = new Alert(AlertType.INFORMATION);
						alert.setHeaderText("Se actualizó a información");
						alert.setContentText("Se ha actualizado la información del producto.");
						alert.showAndWait();
					}

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

		String[] partsIngredients = ingredient.split("-");

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

		String[] partsProducts = product.split("-");

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

	public ArrayList<Integer> objListAmounts(String amounts){

		ArrayList<Integer> listAmount = new ArrayList<>();
		boolean verify = false;

		String[] partsAmounts = amounts.split("-");

		for (int i = 0; i < partsAmounts.length && !verify; i++) {
			try {
				int partsAmount = Integer.parseInt(partsAmounts[i]);
				listAmount.add(partsAmount);

			}catch (NumberFormatException e) {
				Alert alert = new Alert(AlertType.ERROR);
				alert.setHeaderText("No ingresó un número");
				alert.setContentText("Debe ingresar un valor númerico en el campo de precio del producto");
				alert.showAndWait();
				verify = true;
			}
		}

		return listAmount;
	}

	@FXML
	public void mouseClickedListProduct(MouseEvent event) {

		if(tvListProduct.getSelectionModel().isEmpty()) {
			Alert alerts = new Alert(AlertType.WARNING);
			alerts.setTitle("CUIDADO");
			alerts.setHeaderText("No se seleccionó ningún dato de la tabla.");
			alerts.setContentText(null);
			alerts.showAndWait();

		}else{
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

	}

	@FXML
	public void mouseClickedListOrder(MouseEvent event) {

		if(tvListOrders.getSelectionModel().isEmpty()) {
			Alert alerts = new Alert(AlertType.WARNING);
			alerts.setTitle("CUIDADO");
			alerts.setHeaderText("No se seleccionó ningún dato de la tabla.");
			alerts.setContentText(null);
			alerts.showAndWait();

		}else{ 
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

			stateOrderList.setValue(state);
			updateProductsOrder.setText(productMessage);
			updateAmountOrder.setText(amountMessage);
			nameClientList.setText(client);
			nameEmployeeList.setText(employee);
			obsOders.setText(obsOrder);
		}

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

	@FXML
	public void loadDeleteClient() throws IOException {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("deleteClient-pane.fxml"));
		loader.setController(this);

		Parent load = loader.load();
		mainPane.setCenter(load);

		mainPane.getChildren().clear();
		mainPane.setTop(load);
		Image image = new Image("/images/Banner.jpg");
		imageDeleteWall.setImage(image);
		Image image2 = new Image("/images/BannerCasaDorada.jpg");
		imageDeleteBanner.setImage(image2);
	} 

	@FXML
	public void deleteClient(ActionEvent event) throws IOException {

		if(!nameDeleteClient.getText().isEmpty() && !lastNameDeleteClient.getText().isEmpty() && !phoneDeleteClient.getText().isEmpty()) {

			Client client = laCasaDorada.findObjClient(nameDeleteClient.getText(),lastNameDeleteClient.getText(),phoneDeleteClient.getText());

			if(client != null) {

				Order order = laCasaDorada.findClientInOrder(client);

				if(order != null) {
					Alert alert = new Alert(AlertType.ERROR);
					alert.setTitle("ERROR");
					alert.setHeaderText("No se pudo eliminar el cliente");
					alert.setContentText("El cliente ya ha realizado un pedido");
					alert.showAndWait();
				}
				else {

					Alert alerts = new Alert(AlertType.INFORMATION);
					alerts.setTitle("EXCELENTE");

					Alert alert1 = new Alert(AlertType.CONFIRMATION);
					alert1.setHeaderText("¿Está seguro de eliminar al cliente "+nameDeleteClient.getText()+"?.");
					Optional<ButtonType> result = alert1.showAndWait();

					if(result.get() == ButtonType.OK) {

						alerts.setHeaderText("Se ha eliminado exitosamente.");
						alerts.showAndWait();
						laCasaDorada.deleteClient(client);
						mainMenu();

					}else {
						alerts.setHeaderText("No se ha eliminado.");
						alerts.showAndWait();
						mainMenu();
					}
				}
			}
			else {
				Alert alert = new Alert(AlertType.ERROR);
				alert.setTitle("ERROR");
				alert.setHeaderText("No se pudo eliminar el cliente");
				alert.setContentText("No existe un cliente con ese nombre y/o apellido");
				alert.showAndWait();
			}
		}
		else {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("ERROR");
			alert.setHeaderText("No se pudo eliminar el cliente");
			alert.setContentText("Debe llenar los campos para eliminar el cliente");
			alert.showAndWait();
		}
	}

	@FXML
	public void loadDeleteEmployee() throws IOException {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("deleteEmployee-pane.fxml"));
		loader.setController(this);

		Parent load = loader.load();
		mainPane.setCenter(load);

		mainPane.getChildren().clear();
		mainPane.setTop(load);
		Image image = new Image("/images/Banner.jpg");
		imageDeleteWallEmployee.setImage(image);
		Image image2 = new Image("/images/BannerCasaDorada.jpg");
		imageDeleteBannerEmployee.setImage(image2);
	}

	@FXML
	public void deleteEmployee(ActionEvent event) throws IOException {

		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("ERROR");

		if(!idDeleteEmployee.getText().isEmpty()) {

			Employee employee = laCasaDorada.findObjEmployee(idDeleteEmployee.getText());

			if(employee != null) {

				if(!employee.getId().equalsIgnoreCase(usersModifiers.getCreateObject().getId())) {

					Order order = laCasaDorada.findEmployeeInOrder(employee);

					if(order != null) {
						alert.setHeaderText("No se pudo eliminar el empleado");
						alert.setContentText("El empleado ya ha realizado un pedido");
						alert.showAndWait();
					}
					else {

						Alert alerts = new Alert(AlertType.INFORMATION);
						alerts.setTitle("EXCELENTE");

						Alert alert1 = new Alert(AlertType.CONFIRMATION);
						alert1.setHeaderText("¿Está seguro de eliminar al empleado "+employee.getName()+"?.");
						Optional<ButtonType> result = alert1.showAndWait();

						if(result.get() == ButtonType.OK) {

							alerts.setHeaderText("Se ha eliminado exitosamente.");
							alerts.showAndWait();
							laCasaDorada.deleteEmployee(employee);
							mainMenu();
						}
					}
				}else {
					alert.setHeaderText("No se pudo eliminar el empleado");
					alert.setContentText("El empleado que se quiere eliminar tiene la sesión aciva.");
					alert.showAndWait();
				}
			}
			else {
				alert.setHeaderText("No se pudo eliminar el empleado");
				alert.setContentText("No existe un empleado con ese número de identificación");
				alert.showAndWait();
			}
		}
		else {

			alert.setHeaderText("No se pudo eliminar el empleado");
			alert.setContentText("Debe llenar el campo para eliminar el empleado");
			alert.showAndWait();
		}
	}

	@FXML
	public void loadDeletedUser() throws IOException {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("deleteUser-pane.fxml"));
		loader.setController(this);

		Parent load = loader.load();
		mainPane.setCenter(load);

		mainPane.getChildren().clear();
		mainPane.setTop(load);
		Image image = new Image("/images/Banner.jpg");
		imageDeleteWallUser.setImage(image);
		Image image2 = new Image("/images/BannerCasaDorada.jpg");
		imageDeleteBannerUser.setImage(image2);
	}

	@FXML
	public void deleteUser(ActionEvent event) throws IOException {

		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("ERROR");

		if(!nameDeleteUser.getText().isEmpty() && !idDeleteUser.getText().isEmpty()) {

			User user = laCasaDorada.findUser(nameDeleteUser.getText(),idDeleteUser.getText());

			if(user != null) {

				if(user != usersModifiers.getCreateObject()) {

					Order order = laCasaDorada.findUserInOrder(user);

					if(order != null) {

						alert.setHeaderText("No se pudo eliminar el usuario");
						alert.setContentText("No se puede eliminar porque el usuario está activo en el sistema.");
						alert.showAndWait();

					}
					else {
						Product product = laCasaDorada.findUserInProduct(user);

						if(product != null) {

							alert.setHeaderText("No se pudo eliminar el usuario");
							alert.setContentText("No se puede eliminar porque el usuario está activo en el sistema");
							alert.showAndWait();
						}else {

							Ingredient ingredient = laCasaDorada.findUserInIngredient(user);

							if(ingredient != null) {
								alert.setHeaderText("No se pudo eliminar el usuario");
								alert.setContentText("No se puede eliminar porque el usuario está activo en el sistema");
								alert.showAndWait();
							}
							else {

								Size size = laCasaDorada.findUserInSize(user);

								if(size != null) {
									alert.setHeaderText("No se pudo eliminar el usuario");
									alert.setContentText("No se puede eliminar porque el usuario está activo en el sistema");
									alert.showAndWait();
								}
								else {

									ProductType PorductType = laCasaDorada.findUserInProductType(user);

									if(PorductType != null) {
										alert.setHeaderText("No se pudo eliminar el usuario");
										alert.setContentText("No se puede eliminar porque el usuario está activo en el sistema");
										alert.showAndWait();
									}
									else {

										Alert alerts = new Alert(AlertType.INFORMATION);
										alerts.setTitle("EXCELENTE");

										Alert alert1 = new Alert(AlertType.CONFIRMATION);
										alert1.setHeaderText("¿Está seguro de eliminar al usuario "+nameDeleteUser.getText()+"?.");
										Optional<ButtonType> result = alert1.showAndWait();

										if(result.get() == ButtonType.OK) {

											alerts.setHeaderText("Se ha eliminado exitosamente.");
											alerts.showAndWait();
											laCasaDorada.deleteUser(user);
											mainMenu();
										}
									}
								}
							}
						}
					}

				}else {
					alert.setHeaderText("No se pudo eliminar el usuario");
					alert.setContentText("El usuario que desea eliminar está actualmente con la sesión activa.");
					alert.showAndWait();
				}

			}
			else {
				alert.setHeaderText("No se pudo eliminar el usuario");
				alert.setContentText("No existe un usuario con ese nombre de usuario y/o número de identificación");
				alert.showAndWait();
			}
		}
		else {
			alert.setHeaderText("No se pudo eliminar el usuario");
			alert.setContentText("Debe llenar los campos para eliminar el usuario");
			alert.showAndWait();
		}
	}

	@FXML
	public void loadDeletedProduct() throws IOException {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("deleteProduct-pane.fxml"));
		loader.setController(this);

		Parent load = loader.load();
		mainPane.setCenter(load);

		mainPane.getChildren().clear();
		mainPane.setTop(load);
		Image image = new Image("/images/Banner.jpg");
		imageDeleteWallProduct.setImage(image);
		Image image2 = new Image("/images/BannerCasaDorada.jpg");
		imageDeleteBannerProduct.setImage(image2);
	}

	@FXML
	public void deleteProduct(ActionEvent event) throws IOException {

		if(!nameDeleteProduct.getText().isEmpty()) {

			Product product = laCasaDorada.findObjectProduct(nameDeleteProduct.getText());

			if(product != null) {

				Order order = laCasaDorada.findProductInOrder(product);

				if(order != null) {

					Alert alert = new Alert(AlertType.ERROR);
					alert.setTitle("ERROR");
					alert.setHeaderText("No se pudo eliminar el producto");
					alert.setContentText("No se puede eliminar porque el producto está activo en el sistema");
					alert.showAndWait();
				}
				else {

					Alert alerts = new Alert(AlertType.INFORMATION);
					alerts.setTitle("EXCELENTE");

					Alert alert1 = new Alert(AlertType.CONFIRMATION);
					alert1.setHeaderText("¿Está seguro de eliminar el producto "+nameDeleteProduct.getText()+"?.");
					Optional<ButtonType> result = alert1.showAndWait();

					if(result.get() == ButtonType.OK) {

						alerts.setHeaderText("Se ha eliminado exitosamente.");
						alerts.showAndWait();
						laCasaDorada.deleteProduct(product);
						mainMenu();
					}				
				}
			}
			else {
				Alert alert = new Alert(AlertType.ERROR);
				alert.setTitle("ERROR");
				alert.setHeaderText("No se pudo eliminar el usuario");
				alert.setContentText("No existe un usuario con ese nombre de usuario y/o número de identificación");
				alert.showAndWait();
			}
		}
		else {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("ERROR");
			alert.setHeaderText("No se pudo eliminar el producto");
			alert.setContentText("Debe llenar el campo para eliminar el producto");
			alert.showAndWait();
		}
	}

	@FXML
	public void loadDeletedTypeProduct() throws IOException {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("deleteProductType-pane.fxml"));
		loader.setController(this);

		Parent load = loader.load();
		mainPane.setCenter(load);

		mainPane.getChildren().clear();
		mainPane.setTop(load);
		Image image = new Image("/images/Banner.jpg");
		imageDeleteWallProductType.setImage(image);
		Image image2 = new Image("/images/BannerCasaDorada.jpg");
		imageDeleteBannerProductType.setImage(image2);
	}

	@FXML
	public void deleteProductType(ActionEvent event) throws IOException {

		if(!nameDeleteProductType.getText().isEmpty()) {

			ProductType productType = laCasaDorada.findType(nameDeleteProductType.getText());

			if(productType != null) {

				Product product = laCasaDorada.findTypeOfProduct(productType);

				if(product != null) {
					Alert alert = new Alert(AlertType.ERROR);
					alert.setTitle("ERROR");
					alert.setHeaderText("No se pudo eliminar el tipo de producto");
					alert.setContentText("No se puede eliminar porque el tipo producto está activo en el sistema");
					alert.showAndWait();
				}
				else {

					Alert alerts = new Alert(AlertType.INFORMATION);
					alerts.setTitle("EXCELENTE");

					Alert alert1 = new Alert(AlertType.CONFIRMATION);
					alert1.setHeaderText("¿Está seguro de eliminar el tipo producto "+nameDeleteProductType.getText()+"?.");
					Optional<ButtonType> result = alert1.showAndWait();

					if(result.get() == ButtonType.OK) {

						alerts.setHeaderText("Se ha eliminado exitosamente.");
						alerts.showAndWait();
						laCasaDorada.deleteProductType(productType);
						mainMenu();
					}				

				}
			}
			else {
				Alert alert = new Alert(AlertType.ERROR);
				alert.setTitle("ERROR");
				alert.setHeaderText("No se pudo eliminar el tipo de producto");
				alert.setContentText("No existe un tipo de producto con ese nombre");
				alert.showAndWait();
			}
		}
		else {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("ERROR");
			alert.setHeaderText("No se pudo eliminar el tipo de producto");
			alert.setContentText("Debe llenar el campo para eliminar el tipo de producto");
			alert.showAndWait();
		}
	}

	@FXML
	public void loadDeleteIngredient() throws IOException {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("deleteIngredient-pane.fxml"));
		loader.setController(this);

		Parent load = loader.load();
		mainPane.setCenter(load);

		mainPane.getChildren().clear();
		mainPane.setTop(load);
		Image image = new Image("/images/Banner.jpg");
		imageDeleteWallIngredient.setImage(image);
		Image image2 = new Image("/images/BannerCasaDorada.jpg");
		imageDeleteBannerIngredient.setImage(image2);
	}

	@FXML
	public void deleteIngredient(ActionEvent event) throws IOException {

		if(!nameDeleteIngredient.getText().isEmpty()) {

			Ingredient ingredient = laCasaDorada.findIngredient(nameDeleteIngredient.getText());

			if(ingredient != null) {

				Product product = laCasaDorada.findIngredientInProduct(ingredient);

				if(product != null) {

					Alert alert = new Alert(AlertType.ERROR);
					alert.setTitle("ERROR");
					alert.setHeaderText("No se pudo eliminar el ingrediente");
					alert.setContentText("No se puede eliminar porque el ingrediente está activo en el sistema");
					alert.showAndWait();
				}
				else {

					Alert alerts = new Alert(AlertType.INFORMATION);
					alerts.setTitle("EXCELENTE");

					Alert alert1 = new Alert(AlertType.CONFIRMATION);
					alert1.setHeaderText("¿Está seguro de eliminar el ingrediente "+nameDeleteIngredient.getText()+"?.");
					Optional<ButtonType> result = alert1.showAndWait();

					if(result.get() == ButtonType.OK) {

						alerts.setHeaderText("Se ha eliminado exitosamente.");
						alerts.showAndWait();
						laCasaDorada.deleteIngredient(ingredient);
						mainMenu();
					}			
				}
			}
			else {
				Alert alert = new Alert(AlertType.ERROR);
				alert.setTitle("ERROR");
				alert.setHeaderText("No se pudo eliminar el ingrediente");
				alert.setContentText("No existe un ingrediente con ese nombre");
				alert.showAndWait();
			}
		}
		else {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("ERROR");
			alert.setHeaderText("No se pudo eliminar el ingrediente");
			alert.setContentText("Debe llenar el campo para eliminar el ingrediente");
			alert.showAndWait();
		}
	}

	@FXML
	public void listIngredient(ActionEvent event) throws IOException {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("listIngredient.fxml"));

		loader.setController(this);
		Parent load = loader.load();

		mainPane.getChildren().clear();
		mainPane.setTop(load);

		Image image = new Image("/images/Banner.jpg");
		imageWallListIngredient.setImage(image);
		Image image2 = new Image("/images/BannerCasaDorada.jpg");
		imageBannerListIngredient.setImage(image2);

		inicializateTableViewIngredient();
	}

	public void inicializateTableViewIngredient() {
		listOfIngredient = FXCollections.observableArrayList(laCasaDorada.getIngredient());

		tvListIngredient.setItems(listOfIngredient);
		tcNameIngredient.setCellValueFactory(new PropertyValueFactory<Ingredient,String>("name"));
	}

	@FXML
	public void modifyListIngredient(ActionEvent event) {

		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("ERROR");

		if(tvListIngredient.getSelectionModel().isEmpty()) {

			alert.setHeaderText("No se pudo actualizar el ingrediente");
			alert.setContentText("Debe seleccionar uno de la lista");
			alert.showAndWait();
		}
		else {

			boolean verify = false;

			String name = listOfIngredient.get(tvListIngredient.getSelectionModel().getSelectedIndex()).getName();

			Ingredient ingredient = laCasaDorada.findIngredient(name);


			if(!updateNameIngredient.getText().isEmpty() && !updateNameIngredient.getText().equalsIgnoreCase(name)) {
				name = updateNameIngredient.getText();
				verify = true;
				ingredient.getUsersCreators().setLastModifier(usersModifiers.getCreateObject());
				ingredient.setName(name);
			}

			listOfIngredient.set(tvListIngredient.getSelectionModel().getSelectedIndex(),new Ingredient(name,ingredient.getUsersCreators()));

			updateNameIngredient.setText("");

			if(!verify) {

				alert.setTitle("ERROR");
				alert.setHeaderText("No se pudo actualizar la información.");
				alert.setContentText(null);
			}
			else {
				Alert alert1 = new Alert(AlertType.INFORMATION);
				alert1.setHeaderText("Se actualizó el ingrediente");
				alert1.setContentText("El ingrediente cambió de nombre.");
				alert1.showAndWait();
			}
		}
	}

	@FXML
	public void mouseClickedListIngredient(MouseEvent event) {

		if(tvListIngredient.getSelectionModel().isEmpty()) {
			Alert alerts = new Alert(AlertType.WARNING);
			alerts.setTitle("CUIDADO");
			alerts.setHeaderText("No se seleccionó ningún dato de la tabla.");
			alerts.setContentText(null);
			alerts.showAndWait();

		}else{  
			String name = listOfIngredient.get(tvListIngredient.getSelectionModel().getSelectedIndex()).getName();

			updateNameIngredient.setText(name);
		}
	}

	@FXML
	public void listType(ActionEvent event) throws IOException {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("listType.fxml"));

		loader.setController(this);
		Parent load = loader.load();

		mainPane.getChildren().clear();
		mainPane.setTop(load);

		Image image = new Image("/images/Banner.jpg");
		imageWallListType.setImage(image);
		Image image2 = new Image("/images/BannerCasaDorada.jpg");
		imageBannerListType.setImage(image2);

		inicializateTableViewType();
	}

	public void inicializateTableViewType() {
		listType = FXCollections.observableArrayList(laCasaDorada.getProductType());

		tvListType.setItems(listType);
		tcNameType.setCellValueFactory(new PropertyValueFactory<ProductType,String>("name"));
	}

	@FXML
	public void modifyListType(ActionEvent event) {

		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("ERROR");

		if(tvListType.getSelectionModel().isEmpty()) {

			alert.setHeaderText("No se pudo actualizar el Tipo de Producto");
			alert.setContentText("Debe seleccionar uno de la lista");
			alert.showAndWait();
		}
		else {

			boolean verify = false;

			String name = listType.get(tvListType.getSelectionModel().getSelectedIndex()).getName();

			ProductType type = laCasaDorada.findType(name);


			if(!updateNameType.getText().isEmpty() && !updateNameType.getText().equalsIgnoreCase(name)) {
				name = updateNameType.getText();
				verify = true;
				type.getUsersCreators().setLastModifier(usersModifiers.getCreateObject());
				type.setName(name);
			}

			listType.set(tvListType.getSelectionModel().getSelectedIndex(),new ProductType(name,type.getUsersCreators()));

			updateNameType.setText("");

			if(!verify) {

				alert.setTitle("ERROR");
				alert.setHeaderText("No se pudo actualizar la información.");
				alert.setContentText(null);
				alert.showAndWait();
			}
			else {
				Alert alert1 = new Alert(AlertType.INFORMATION);
				alert1.setHeaderText("Se actualizó el tipo de producto");
				alert1.setContentText("El tipo de producto actualizó el nombre.");
				alert1.showAndWait();
			}

		}
	}

	@FXML
	public void mouseClickedListType(MouseEvent event) {

		if(tvListType.getSelectionModel().isEmpty()) {
			Alert alerts = new Alert(AlertType.WARNING);
			alerts.setTitle("CUIDADO");
			alerts.setHeaderText("No se seleccionó ningún dato de la tabla.");
			alerts.setContentText(null);
			alerts.showAndWait();

		}else{  
			String name = listType.get(tvListType.getSelectionModel().getSelectedIndex()).getName();
			updateNameType.setText(name);
		}
	}

	@FXML
	public void listSizes(ActionEvent event) throws IOException {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("listSize.fxml"));

		loader.setController(this);
		Parent load = loader.load();

		mainPane.getChildren().clear();
		mainPane.setTop(load);

		Image image = new Image("/images/Banner.jpg");
		imageBannerListSize.setImage(image);
		Image image2 = new Image("/images/BannerCasaDorada.jpg");
		imageBannerListSize.setImage(image2);

		inicializateTableViewSize();
	}

	public void inicializateTableViewSize() {
		listSizes = FXCollections.observableArrayList(laCasaDorada.getSizes());

		tvListSize.setItems(listSizes);
		tcNameSize.setCellValueFactory(new PropertyValueFactory<Size,String>("size"));
	}

	@FXML
	public void modifyListSize(ActionEvent event) {

		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("ERROR");

		if(tvListSize.getSelectionModel().isEmpty()) {

			alert.setHeaderText("No se pudo actualizar el Tamaño");
			alert.setContentText("Debe seleccionar uno de la lista");
			alert.showAndWait();
		}
		else {

			boolean verify = false;

			String size = listSizes.get(tvListSize.getSelectionModel().getSelectedIndex()).getSize();

			Size sizes = laCasaDorada.findSize(size);


			if(!updateNameSize.getText().isEmpty() && !updateNameSize.getText().equalsIgnoreCase(size)) {
				size = updateNameSize.getText();
				verify = true;
				sizes.getUsersCreators().setLastModifier(usersModifiers.getCreateObject());
				sizes.setSize(size);
			}

			listSizes.set(tvListSize.getSelectionModel().getSelectedIndex(),new Size(size,sizes.getUsersCreators()));

			updateNameSize.setText("");

			if(!verify) {

				alert.setTitle("ERROR");
				alert.setHeaderText("No se pudo actualizar la información.");
				alert.setContentText(null);
				alert.showAndWait();
			}
			else {
				Alert alert1 = new Alert(AlertType.INFORMATION);
				alert1.setHeaderText("Se actualizó el tamaño");
				alert1.setContentText("El tamaño actualizó el nombre.");
				alert1.showAndWait();
			}

		}
	}

	@FXML
	public void mouseClickedListSize(MouseEvent event)  {

		if(tvListSize.getSelectionModel().isEmpty()) {
			Alert alerts = new Alert(AlertType.WARNING);
			alerts.setTitle("CUIDADO");
			alerts.setHeaderText("No se seleccionó ningún dato de la tabla.");
			alerts.setContentText(null);
			alerts.showAndWait();

		}else{  
			String size = listSizes.get(tvListSize.getSelectionModel().getSelectedIndex()).getSize();

			updateNameSize.setText(size);
		}
	}

	@FXML
	public void loadDeleteOrder() throws IOException {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("deleteOrder.fxml"));
		loader.setController(this);

		Parent load = loader.load();
		mainPane.setTop(load);

		mainPane.getChildren().clear();
		mainPane.setTop(load);
		Image image = new Image("/images/Banner.jpg");
		imageDeleteWallOrder.setImage(image);
		Image image2 = new Image("/images/BannerCasaDorada.jpg");
		imageDeleteOrder.setImage(image2);
	} 

	@FXML
	public void deleteOrder(ActionEvent event) throws IOException {

		if(!codeDeleteOrder.getText().isEmpty()) {

			Order order = laCasaDorada.findOrder(codeDeleteOrder.getText());

			if(order != null) {

				Alert alerts = new Alert(AlertType.INFORMATION);
				alerts.setTitle("EXCELENTE");

				Alert alert1 = new Alert(AlertType.CONFIRMATION);
				alert1.setHeaderText("¿Está seguro de eliminar el pedido No. "+codeDeleteOrder.getText()+"?.");
				Optional<ButtonType> result = alert1.showAndWait();

				if(result.get() == ButtonType.OK) {

					alerts.setHeaderText("Se ha eliminado exitosamente.");
					alerts.showAndWait();
					laCasaDorada.deleteOrder(order);
					mainMenu();

				}else {
					alerts.setHeaderText("No se ha eliminado.");
					alerts.showAndWait();
					mainMenu();
				}
			}
			else {
				Alert alert = new Alert(AlertType.ERROR);
				alert.setTitle("ERROR");
				alert.setHeaderText("No se pudo eliminar el pedido");
				alert.setContentText("No existe un pedido con ese código.");
				alert.showAndWait();
			}
		}
		else {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("ERROR");
			alert.setHeaderText("No se pudo eliminar el pedido");
			alert.setContentText("Debe llenar los campos para eliminar el pedido");
			alert.showAndWait();
		}
	}

	@FXML
	public void loadDeleteSize() throws IOException {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("deleteSize.fxml"));
		loader.setController(this);

		Parent load = loader.load();
		mainPane.setCenter(load);

		mainPane.getChildren().clear();
		mainPane.setTop(load);

		Image image = new Image("/images/Banner.jpg");
		imageDeleteWallSize.setImage(image);
		Image image2 = new Image("/images/BannerCasaDorada.jpg");
		imageDeleteSize.setImage(image2);
	}

	@FXML
	public void deletedSize(ActionEvent event) throws IOException {

		if(!nameDeleteSize.getText().isEmpty()) {

			Size size = laCasaDorada.findSize(nameDeleteSize.getText());

			if(size != null) {

				Product product = laCasaDorada.findSizeInProduct(size);

				if(product != null) {

					Alert alert = new Alert(AlertType.ERROR);
					alert.setTitle("ERROR");
					alert.setHeaderText("No se pudo eliminar el tamaño");
					alert.setContentText("No se puede eliminar porque el tamaño está activo en el sistema");
					alert.showAndWait();
				}
				else {

					Alert alerts = new Alert(AlertType.INFORMATION);
					alerts.setTitle("EXCELENTE");

					Alert alert1 = new Alert(AlertType.CONFIRMATION);
					alert1.setHeaderText("¿Está seguro de eliminar el tamaño "+nameDeleteSize.getText()+"?.");
					Optional<ButtonType> result = alert1.showAndWait();

					if(result.get() == ButtonType.OK) {

						alerts.setHeaderText("Se ha eliminado exitosamente.");
						alerts.showAndWait();
						laCasaDorada.deleteSize(size);
						mainMenu();
					}			
				}
			}
			else {
				Alert alert = new Alert(AlertType.ERROR);
				alert.setTitle("ERROR");
				alert.setHeaderText("No se pudo eliminar el tamaño");
				alert.setContentText("No existe un tamaño con ese nombre");
				alert.showAndWait();
			}
		}
		else {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("ERROR");
			alert.setHeaderText("No se pudo eliminar el tamaño");
			alert.setContentText("Debe llenar el campo para eliminar el tamaño");
			alert.showAndWait();
		}
	}

	@FXML
	public void loadDisabledIngredient() throws IOException {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("disabledIngredient-pane.fxml"));
		loader.setController(this);

		Parent load = loader.load();
		mainPane.setCenter(load);

		mainPane.getChildren().clear();
		mainPane.setTop(load);

		Image image = new Image("/images/Banner.jpg");
		imageDisabledWallIngredient.setImage(image);
		Image image2 = new Image("/images/BannerCasaDorada.jpg");
		imageDisabledBannerIngredient.setImage(image2);
	}

	@FXML
	public void disabledIngredient(ActionEvent event) throws IOException {

		if(!nameDisabledIngredient.getText().isEmpty()) {

			Ingredient ingredient = laCasaDorada.findIngredient(nameDisabledIngredient.getText());

			if(ingredient != null) {

				if(ingredient.getState() == State.DISABLED) {

					Alert alert = new Alert(AlertType.ERROR);
					alert.setTitle("ERROR");
					alert.setHeaderText("No se pudo deshabilitar el ingrediente");
					alert.setContentText("El ingrediente ya se encuentra deshabilitado");
					alert.showAndWait();
				}
				else {
					laCasaDorada.disableIngredient(ingredient);

					Alert alerts = new Alert(AlertType.INFORMATION);
					alerts.setTitle("EXCELENTE");
					alerts.setHeaderText("Se ha deshabilitado exitosamente.");
					alerts.setContentText("Se ha deshabilitado el producto "+nameDisabledIngredient.getText()+" exitosamente");
					alerts.showAndWait();

					mainMenu();
				}
			}
			else {
				Alert alert = new Alert(AlertType.ERROR);
				alert.setTitle("ERROR");
				alert.setHeaderText("No se pudo deshabilitar el ingrediente");
				alert.setContentText("No existe un ingrediente con ese nombre");
				alert.showAndWait();
			}
		}
		else {

			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("ERROR");
			alert.setHeaderText("No se pudo deshabilitar el ingrediente");
			alert.setContentText("Debe llenar el campo para deshabilitar el ingrediente");
			alert.showAndWait();
		}
	}

	@FXML
	public void loadDisabledSize() throws IOException {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("disableSize-pane.fxml"));
		loader.setController(this);

		Parent load = loader.load();
		mainPane.setCenter(load);

		mainPane.getChildren().clear();
		mainPane.setTop(load);

		Image image = new Image("/images/Banner.jpg");
		imageDisabledWallSize.setImage(image);
		Image image2 = new Image("/images/BannerCasaDorada.jpg");
		imageDisabledBannerSize.setImage(image2);
	}

	@FXML
	public void disabledSize(ActionEvent event) throws IOException {

		if(!nameDisabledSize.getText().isEmpty()) {

			Size size = laCasaDorada.findSize(nameDisabledSize.getText());

			if(size != null) {

				if(size.getState() == State.DISABLED) {

					Alert alert = new Alert(AlertType.ERROR);
					alert.setTitle("ERROR");
					alert.setHeaderText("No se pudo deshabilitar el tamaño del producto");
					alert.setContentText("El tamaño del producto ya se encuentra deshabilitado");
					alert.showAndWait();
				}
				else {
					laCasaDorada.disableSize(size);

					Alert alerts = new Alert(AlertType.INFORMATION);
					alerts.setTitle("EXCELENTE");
					alerts.setHeaderText("Se ha deshabilitado exitosamente.");
					alerts.setContentText("Se ha deshabilitado el tamaño de producto "+nameDisabledSize.getText()+" exitosamente");
					alerts.showAndWait();

					mainMenu();
				}
			}
			else {
				Alert alert = new Alert(AlertType.ERROR);
				alert.setTitle("ERROR");
				alert.setHeaderText("No se pudo deshabilitar el tamaño de producto");
				alert.setContentText("No existe un tamaño de producto con ese nombre");
				alert.showAndWait();
			}
		}
		else {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("ERROR");
			alert.setHeaderText("No se pudo deshabilitar el tamaño de producto");
			alert.setContentText("Debe llenar el campo para deshabilitar el tamaño de producto");
			alert.showAndWait();
		}
	}

	@FXML
	public void loadDisabledProductType() throws IOException {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("disabledProductType-pane.fxml"));

		loader.setController(this);

		Parent load = loader.load();
		mainPane.setCenter(load);

		mainPane.getChildren().clear();
		mainPane.setTop(load);

		Image image = new Image("/images/Banner.jpg");
		imageDisabledWallProductType.setImage(image);
		Image image2 = new Image("/images/BannerCasaDorada.jpg");
		imageDisabledBannerProductType.setImage(image2);
	}

	@FXML
	public void disabledProductType(ActionEvent event) throws IOException {

		if(!nameDisabledProductType.getText().isEmpty()) {

			ProductType productType = laCasaDorada.findType(nameDisabledProductType.getText());

			if(productType != null) {

				if(productType.getState() == State.DISABLED) {

					Alert alert = new Alert(AlertType.ERROR);
					alert.setTitle("ERROR");
					alert.setHeaderText("No se pudo deshabilitar el tipo de producto");
					alert.setContentText("El tipo de producto ya se encuentra deshabilitado");
					alert.showAndWait();
				}
				else {
					laCasaDorada.disableType(productType);

					Alert alerts = new Alert(AlertType.INFORMATION);
					alerts.setTitle("EXCELENTE");
					alerts.setHeaderText("Se ha deshabilitado exitosamente.");
					alerts.setContentText("Se ha deshabilitado el tipo de producto "+nameDisabledProductType.getText()+" exitosamente");
					alerts.showAndWait();

					mainMenu();
				}
			}
			else {
				Alert alert = new Alert(AlertType.ERROR);
				alert.setTitle("ERROR");
				alert.setHeaderText("No se pudo deshabilitar el tipo de producto");
				alert.setContentText("No existe un tipo de producto con ese nombre");
				alert.showAndWait();
			}

		}
		else {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("ERROR");
			alert.setHeaderText("No se pudo deshabilitar el tipo de producto");
			alert.setContentText("Debe llenar el campo para deshabilitar el tipo de producto");
			alert.showAndWait();
		}
	}

	@FXML
	public void loadDisabledProduct(ActionEvent event) throws IOException {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("disabledProduct-pane.fxml"));

		loader.setController(this);

		Parent load = loader.load();
		mainPane.setCenter(load);

		mainPane.getChildren().clear();
		mainPane.setTop(load);

		Image image = new Image("/images/Banner.jpg");
		imageDisabledWallProduct.setImage(image);
		Image image2 = new Image("/images/BannerCasaDorada.jpg");
		imageDisabledBannerProduct.setImage(image2);
	}

	@FXML
	public void disabledProduct(ActionEvent event) throws IOException {

		if(!nameDisabledProduct.getText().isEmpty()) {

			Product product = laCasaDorada.findProducts(nameDisabledProduct.getText());

			if(product != null) {

				if(product.getState() == State.DISABLED) {

					Alert alert = new Alert(AlertType.ERROR);
					alert.setTitle("ERROR");
					alert.setHeaderText("No se pudo deshabilitar el producto");
					alert.setContentText("El producto ya se encuentra deshabilitado");
					alert.showAndWait();
				}
				else {

					laCasaDorada.disableProduct(product);

					Alert alerts = new Alert(AlertType.INFORMATION);
					alerts.setTitle("EXCELENTE");
					alerts.setHeaderText("Se ha deshabilitado exitosamente.");
					alerts.setContentText("Se ha deshabilitado el producto "+nameDisabledProduct.getText()+" exitosamente");
					alerts.showAndWait();

					mainMenu();
				}
			}
			else {
				Alert alert = new Alert(AlertType.ERROR);
				alert.setTitle("ERROR");
				alert.setHeaderText("No se pudo deshabilitar el producto");
				alert.setContentText("No existe un producto con ese nombre");
				alert.showAndWait();
			}
		}
		else {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("ERROR");
			alert.setHeaderText("No se pudo deshabilitar el producto");
			alert.setContentText("Debe llenar el campo para deshabilitar el producto");
			alert.showAndWait();
		}
	}

	@FXML
	public void loadEnabledClient(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("enabledClient.fxml"));
		loader.setController(this);

		Parent load = loader.load();
		mainPane.setCenter(load);

		mainPane.getChildren().clear();
		mainPane.setTop(load);
		Image image = new Image("/images/Banner.jpg");

		imageEnabledWallClient.setImage(image);
		Image image2 = new Image("/images/BannerCasaDorada.jpg");
		imageEnabledBannerClient.setImage(image2);
	}

	@FXML
	public void enabledClient(ActionEvent event) throws IOException {

		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("ERROR");

		if(!nameEnabledClient.getText().isEmpty() && !lastNameEnabledClient.getText().isEmpty()) {

			Client client = laCasaDorada.findObjClient(nameDisabledClient.getText(),lastNameDisabledClient.getText());

			if(client != null) {

				if(client.getState() == State.ENABLE) {

					alert.setHeaderText("No se pudo habilitar el cliente");
					alert.setContentText("El cliente ya se encuentra habilitado");
				}
				else {

					laCasaDorada.enableClient(client);

					Alert alerts = new Alert(AlertType.INFORMATION);
					alerts.setTitle("EXCELENTE");
					alerts.setHeaderText("Se ha habilitado exitosamente.");
					alerts.setContentText("Se ha habilitado el cliente "+nameEnabledClient.getText()+" exitosamente");
					alerts.showAndWait();

					mainMenu();
				}
			}
			else {
				alert.setHeaderText("No se pudo habilitar el cliente");
				alert.setContentText("No existe un cliente con ese nombre");
				alert.showAndWait();
			}
		}
		else {
			alert.setHeaderText("No se pudo habilitar el cliente");
			alert.setContentText("Debe llenar los campos para habilitar el cliente");
			alert.showAndWait();
		}

	}

	@FXML
	public void loadEnabledOrder(ActionEvent event) throws IOException {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("enabledOrder.fxml"));

		loader.setController(this);

		Parent load = loader.load();
		mainPane.setCenter(load);

		mainPane.getChildren().clear();
		mainPane.setTop(load);

		Image image = new Image("/images/Banner.jpg");
		imageEnabledWallOrder.setImage(image);
		Image image2 = new Image("/images/BannerCasaDorada.jpg");
		imageEnabledBannerOrder.setImage(image2);
	}


	@FXML
	public void enabledOrder(ActionEvent event) throws IOException {

		if(!nameEnabledOrder.getText().isEmpty()) {

			Order order = laCasaDorada.findOrder(nameEnabledOrder.getText());

			if(order != null) {

				if(order.getStates() == State.ENABLE) {

					Alert alert = new Alert(AlertType.ERROR);
					alert.setTitle("ERROR");
					alert.setHeaderText("No se pudo habilitar el pedido");
					alert.setContentText("El pedido ya se encuentra habilitado");
					alert.showAndWait();
				}
				else {

					laCasaDorada.enableOrder(order);

					Alert alerts = new Alert(AlertType.INFORMATION);
					alerts.setTitle("EXCELENTE");
					alerts.setHeaderText("Se ha habilitado exitosamente.");
					alerts.setContentText("Se ha habilitado el pedido "+nameEnabledOrder.getText()+" exitosamente");
					alerts.showAndWait();

					mainMenu();
				}
			}
			else {
				Alert alert = new Alert(AlertType.ERROR);
				alert.setTitle("ERROR");
				alert.setHeaderText("No se pudo habilitar el pedido");
				alert.setContentText("No existe un pedido con ese código");
				alert.showAndWait();
			}
		}
		else {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("ERROR");
			alert.setHeaderText("No se pudo habilitar el pedido");
			alert.setContentText("Debe llenar los dos campos para habilitar el pedido");
			alert.showAndWait();
		}
	}

	@FXML
	public void loadEnabledEmployee(ActionEvent event) throws IOException {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("enabledEmployee.fxml"));
		loader.setController(this);

		Parent load = loader.load();
		mainPane.setCenter(load);

		mainPane.getChildren().clear();
		mainPane.setTop(load);
		Image image = new Image("/images/Banner.jpg");
		imageEnabledWallEmployee.setImage(image);
		Image image2 = new Image("/images/BannerCasaDorada.jpg");
		imageEnabledBannerEmployee.setImage(image2);

	}

	@FXML
	public void enabledEmployee(ActionEvent event) throws IOException {

		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("ERROR");

		if(!idEnableEmployee.getText().isEmpty()) {

			Employee employee = laCasaDorada.findEmployee(idEnableEmployee.getText());

			if(employee != null) {

				if(employee.getState() == State.ENABLE) {

					alert.setHeaderText("No se pudo habilitar el empleado");
					alert.setContentText("El empleado ya se encuentra deshabilitado");
					alert.showAndWait();
				}
				else {

					laCasaDorada.enableEmployee(employee);

					Alert alerts = new Alert(AlertType.INFORMATION);
					alerts.setTitle("EXCELENTE");
					alerts.setHeaderText("Se ha habilitado exitosamente.");
					alerts.setContentText("Se ha habilitado el empleado "+employee.getName()+" exitosamente");
					alerts.showAndWait();

					mainMenu();
				}
			}else {
				alert.setHeaderText("No se pudo habilitar el empleado");
				alert.setContentText("No existe un empleado con ese No. de identificación");
				alert.showAndWait();
			}

		}else {
			alert.setHeaderText("No se pudo habilitar el empleado");
			alert.setContentText("Debe llenar el campo para habilitar el empleado");
			alert.showAndWait();
		}

	}

	@FXML
	public void loadEnabledUser(ActionEvent event) throws IOException {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("enableUser.fxml"));

		loader.setController(this);

		Parent load = loader.load();
		mainPane.setCenter(load);

		mainPane.getChildren().clear();
		mainPane.setTop(load);

		Image image = new Image("/images/Banner.jpg");
		imageEnabledWallUser.setImage(image);
		Image image2 = new Image("/images/BannerCasaDorada.jpg");
		imageEnabledBannerUser.setImage(image2);
	}

	@FXML
	public void enabledUser(ActionEvent event) throws IOException {

		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("ERROR");

		if(!idEnabledUser.getText().isEmpty() && !nameUserEnable.getText().isEmpty()) {

			User user = laCasaDorada.findUser(nameUserEnable.getText(),idEnabledUser.getText());

			if(user != null) {

				if(user.getState() == State.ENABLE) {

					alert.setHeaderText("No se pudo habilitar el usuario");
					alert.setContentText("El usuario ya se encuentra habilitado");
					alert.showAndWait();
				}
				else {

					laCasaDorada.enableUser(user);

					Alert alerts = new Alert(AlertType.INFORMATION);
					alerts.setTitle("EXCELENTE");
					alerts.setHeaderText("Se ha habilitado exitosamente.");
					alerts.setContentText("Se ha habilitado el usuario "+nameUserEnable.getText()+" exitosamente");
					alerts.showAndWait();

					mainMenu();
				}
			}
			else {
				alert.setHeaderText("No se pudo habilitar el usuario");
				alert.setContentText("No existe un usuario con ese nombre de usuario y/o número de identificación");
				alert.showAndWait();
			}
		}
		else {
			alert.setHeaderText("No se pudo habilitar el usuario");
			alert.setContentText("Debe llenar los campos para habilitar el usuario");
			alert.showAndWait();

		}
	}

	@FXML
	public void aboutTeam(ActionEvent event) throws IOException {

		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("CRÉDITOS");
		alert.setHeaderText("TRABAJO REALIZADO POR: ");
		alert.setContentText("Luis Miguel Ossa Arias y Santiago Trochez Velasco\nUniversidad Icesi \n29/03/2021");
		alert.showAndWait();
	}

	@FXML
	public void loadDisabledClient(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("disabledClient.fxml"));
		loader.setController(this);

		Parent load = loader.load();
		mainPane.setCenter(load);

		mainPane.getChildren().clear();
		mainPane.setTop(load);
		Image image = new Image("/images/Banner.jpg");

		imageDisabledWallClient.setImage(image);
		Image image2 = new Image("/images/BannerCasaDorada.jpg");
		imageDisabledBannerClient.setImage(image2);
	}

	@FXML
	public void loadDisabledOrder(ActionEvent event) throws IOException {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("disabledOrder-pane.fxml"));

		loader.setController(this);

		Parent load = loader.load();
		mainPane.setCenter(load);

		mainPane.getChildren().clear();
		mainPane.setTop(load);

		Image image = new Image("/images/Banner.jpg");
		imageDisabledWallOrder.setImage(image);
		Image image2 = new Image("/images/BannerCasaDorada.jpg");
		imageDisabledBannerOrder.setImage(image2);
	}

	@FXML
	public void disabledClient(ActionEvent event) throws IOException {

		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("ERROR");

		if(!nameDisabledClient.getText().isEmpty() && !lastNameDisabledClient.getText().isEmpty()) {

			Client client = laCasaDorada.findObjClient(nameDisabledClient.getText(),lastNameDisabledClient.getText());

			if(client != null) {

				if(client.getState() == State.DISABLED) {

					alert.setHeaderText("No se pudo deshabilitar el cliente");
					alert.setContentText("El cliente ya se encuentra deshabilitado");
				}
				else {

					laCasaDorada.disableClient(client);

					Alert alerts = new Alert(AlertType.INFORMATION);
					alerts.setTitle("EXCELENTE");
					alerts.setHeaderText("Se ha deshabilitado exitosamente.");
					alerts.setContentText("Se ha deshabilitado el cliente "+nameDisabledClient.getText()+" exitosamente");
					alerts.showAndWait();

					mainMenu();
				}
			}
			else {
				alert.setHeaderText("No se pudo deshabilitar el cliente");
				alert.setContentText("No existe un cliente con ese nombre");
				alert.showAndWait();
			}
		}
		else {
			alert.setHeaderText("No se pudo deshabilitar el cliente");
			alert.setContentText("Debe llenar los campos para deshabilitar el cliente");
			alert.showAndWait();
		}

	}

	@FXML
	public void disabledOrder(ActionEvent event) throws IOException {

		if(!nameDisabledOrder.getText().isEmpty()) {

			Order order = laCasaDorada.findOrder(nameDisabledOrder.getText());

			if(order != null) {

				if(order.getStates() == State.DISABLED) {

					Alert alert = new Alert(AlertType.ERROR);
					alert.setTitle("ERROR");
					alert.setHeaderText("No se pudo deshabilitar el pedido");
					alert.setContentText("El pedido ya se encuentra deshabilitado");
					alert.showAndWait();
				}
				else {

					laCasaDorada.disableOrder(order);

					Alert alerts = new Alert(AlertType.INFORMATION);
					alerts.setTitle("EXCELENTE");
					alerts.setHeaderText("Se ha deshabilitado exitosamente.");
					alerts.setContentText("Se ha deshabilitado el pedido "+nameDisabledOrder.getText()+" exitosamente");
					alerts.showAndWait();

					mainMenu();
				}
			}
			else {
				Alert alert = new Alert(AlertType.ERROR);
				alert.setTitle("ERROR");
				alert.setHeaderText("No se pudo deshabilitar el pedido");
				alert.setContentText("No existe un pedido con ese código");
				alert.showAndWait();
			}
		}
		else {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("ERROR");
			alert.setHeaderText("No se pudo deshabilitar el pedido");
			alert.setContentText("Debe llenar los dos campos para deshabilitar el pedido");
			alert.showAndWait();
		}
	}

	@FXML
	public void loadDisabledEmployee(ActionEvent event) throws IOException {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("disabledEmployee-pane.fxml"));
		loader.setController(this);

		Parent load = loader.load();
		mainPane.setCenter(load);

		mainPane.getChildren().clear();
		mainPane.setTop(load);
		Image image = new Image("/images/Banner.jpg");
		imageDisabledWallEmployee.setImage(image);
		Image image2 = new Image("/images/BannerCasaDorada.jpg");
		imageDisabledBannerEmployee.setImage(image2);

	}

	@FXML
	public void loadDisabledUser(ActionEvent event) throws IOException {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("disabledUser-pane.fxml"));

		loader.setController(this);

		Parent load = loader.load();
		mainPane.setCenter(load);

		mainPane.getChildren().clear();
		mainPane.setTop(load);

		Image image = new Image("/images/Banner.jpg");
		imageDisabledWallUser.setImage(image);
		Image image2 = new Image("/images/BannerCasaDorada.jpg");
		imageDisabledBannerUser.setImage(image2);
	}

	@FXML
	public void disabledEmployee(ActionEvent event) throws IOException {

		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("ERROR");

		if(!idDiseableEmployee.getText().isEmpty()) {

			Employee employee = laCasaDorada.findEmployee(idDiseableEmployee.getText());

			if(employee != null) {

				if(!employee.getId().equalsIgnoreCase(usersModifiers.getCreateObject().getId())) {

					if(employee.getState() == State.DISABLED) {

						alert.setHeaderText("No se pudo deshabilitar el empleado");
						alert.setContentText("El empleado ya se encuentra deshabilitado");
						alert.showAndWait();
					}
					else {

						laCasaDorada.disableEmployee(employee);

						Alert alerts = new Alert(AlertType.INFORMATION);
						alerts.setTitle("EXCELENTE");
						alerts.setHeaderText("Se ha deshabilitado exitosamente.");
						alerts.setContentText("Se ha deshabilitado el empleado "+employee.getName()+" exitosamente");
						alerts.showAndWait();

						mainMenu();
					}
				}else {
					alert.setHeaderText("No se pudo deshabilitar el empleado");
					alert.setContentText("El empleado "+employee.getName()+" tiene la sesión actualmente activa.");
					alert.showAndWait();
				}
			}
			else {
				alert.setHeaderText("No se pudo deshabilitar el empleado");
				alert.setContentText("No existe un empleado con ese No. de identificación");
				alert.showAndWait();
			}
		}
		else {
			alert.setHeaderText("No se pudo deshabilitar el empleado");
			alert.setContentText("Debe llenar el campo para deshabilitar el empleado");
			alert.showAndWait();
		}

	}

	@FXML
	public void disabledUser(ActionEvent event) throws IOException {

		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("ERROR");

		if(!nameDisabledUser.getText().isEmpty() && !nameUserDisable.getText().isEmpty()) {

			User user = laCasaDorada.findUser(nameUserDisable.getText(),nameDisabledUser.getText());

			if(user != null) {

				if(user != usersModifiers.getCreateObject()) {

					if(user.getState() == State.DISABLED) {

						alert.setHeaderText("No se pudo deshabilitar el usuario");
						alert.setContentText("El usuario ya se encuentra deshabilitado");
						alert.showAndWait();
					}
					else {

						laCasaDorada.disableUser(user);

						Alert alerts = new Alert(AlertType.INFORMATION);
						alerts.setTitle("EXCELENTE");
						alerts.setHeaderText("Se ha deshabilitado exitosamente.");
						alerts.setContentText("Se ha deshabilitado el usuario "+nameDisabledUser.getText()+" exitosamente");
						alerts.showAndWait();

						mainMenu();
					}
				}else {
					alert.setHeaderText("No se pudo deshabilitar el usuario");
					alert.setContentText("El usuario "+nameDisabledUser.getText()+" tiene la sesión actualmente activa.");
					alert.showAndWait();
				}
			}
			else {
				alert.setHeaderText("No se pudo deshabilitar el usuario");
				alert.setContentText("No existe un usuario con ese nombre de usuario y/o número de identificación");
				alert.showAndWait();
			}
		}
		else {
			alert.setHeaderText("No se pudo deshabilitar el usuario");
			alert.setContentText("Debe llenar los campos para deshabilitar el usuario");
			alert.showAndWait();

		}
	}

	@FXML
	public void loadEnableSize() throws IOException {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("enableSize-pane.fxml"));
		loader.setController(this);

		Parent load = loader.load();
		mainPane.setCenter(load);

		mainPane.getChildren().clear();
		mainPane.setTop(load);

		Image image = new Image("/images/Banner.jpg");
		imageEnableWallSize.setImage(image);
		Image image2 = new Image("/images/BannerCasaDorada.jpg");
		imageEnableBannerSize.setImage(image2);
	}

	@FXML
	public void enableSize(ActionEvent event) throws IOException {

		if(!nameEnableSize.getText().isEmpty()) {

			Size size = laCasaDorada.findSize(nameEnableSize.getText());

			if(size != null) {

				if(size.getState() == State.ENABLE) {

					Alert alert = new Alert(AlertType.ERROR);
					alert.setTitle("ERROR");
					alert.setHeaderText("No se pudo habilitar el tamaño del producto");
					alert.setContentText("El tamaño del producto ya se encuentra habilitado");
					alert.showAndWait();
				}
				else {
					laCasaDorada.enableSize(size);

					Alert alerts = new Alert(AlertType.INFORMATION);
					alerts.setTitle("EXCELENTE");
					alerts.setHeaderText("Se ha habilitado exitosamente.");
					alerts.setContentText("Se ha habilitado el tamaño de producto "+nameEnableSize.getText()+" exitosamente");
					alerts.showAndWait();

					mainMenu();
				}
			}
			else {
				Alert alert = new Alert(AlertType.ERROR);
				alert.setTitle("ERROR");
				alert.setHeaderText("No se pudo habilitar el tamaño de producto");
				alert.setContentText("No existe un tamaño de producto con ese nombre");
				alert.showAndWait();
			}
		}
		else {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("ERROR");
			alert.setHeaderText("No se pudo habilitar el tamaño de producto");
			alert.setContentText("Debe llenar el campo para habilitar el tamaño de producto");
			alert.showAndWait();
		}
	}

	@FXML
	public void loadEnableIngredient() throws IOException {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("enableIngredient-pane.fxml"));
		loader.setController(this);

		Parent load = loader.load();
		mainPane.setCenter(load);

		mainPane.getChildren().clear();
		mainPane.setTop(load);

		Image image = new Image("/images/Banner.jpg");
		imageEnableWallIngredient.setImage(image);
		Image image2 = new Image("/images/BannerCasaDorada.jpg");
		imageEnableBannerIngredient.setImage(image2);
	}

	@FXML
	public void enableIngredient(ActionEvent event) throws IOException {

		if(!nameEnableIngredient.getText().isEmpty()) {

			Ingredient ingredient = laCasaDorada.findIngredient(nameEnableIngredient.getText());

			if(ingredient != null) {

				if(ingredient.getState() == State.ENABLE) {

					Alert alert = new Alert(AlertType.ERROR);
					alert.setTitle("ERROR");
					alert.setHeaderText("No se pudo habilitar el ingrediente");
					alert.setContentText("El ingrediente ya se encuentra habilitado");
					alert.showAndWait();
				}
				else {
					laCasaDorada.enableIngredient(ingredient);

					Alert alerts = new Alert(AlertType.INFORMATION);
					alerts.setTitle("EXCELENTE");
					alerts.setHeaderText("Se ha habilitado exitosamente.");
					alerts.setContentText("Se ha habilitado el producto "+nameEnableIngredient.getText()+" exitosamente");
					alerts.showAndWait();

					mainMenu();
				}
			}
			else {
				Alert alert = new Alert(AlertType.ERROR);
				alert.setTitle("ERROR");
				alert.setHeaderText("No se pudo habilitar el ingrediente");
				alert.setContentText("No existe un ingrediente con ese nombre");
				alert.showAndWait();
			}
		}
		else {

			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("ERROR");
			alert.setHeaderText("No se pudo habilitar el ingrediente");
			alert.setContentText("Debe llenar el campo para habilitar el ingrediente");
			alert.showAndWait();
		}
	}

	@FXML
	public void loadEnableProductType() throws IOException {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("enableProductType-pane.fxml"));

		loader.setController(this);

		Parent load = loader.load();
		mainPane.setCenter(load);

		mainPane.getChildren().clear();
		mainPane.setTop(load);

		Image image = new Image("/images/Banner.jpg");
		imageEnableWallProductType.setImage(image);
		Image image2 = new Image("/images/BannerCasaDorada.jpg");
		imageEnableBannerProductType.setImage(image2);
	}

	@FXML
	public void enableProductType(ActionEvent event) throws IOException {

		if(!nameEnableProductType.getText().isEmpty()) {

			ProductType productType = laCasaDorada.findType(nameEnableProductType.getText());

			if(productType != null) {

				if(productType.getState() == State.ENABLE) {

					Alert alert = new Alert(AlertType.ERROR);
					alert.setTitle("ERROR");
					alert.setHeaderText("No se pudo habilitar el tipo de producto");
					alert.setContentText("El tipo de producto ya se encuentra habilitado");
					alert.showAndWait();
				}
				else {
					laCasaDorada.enableType(productType);

					Alert alerts = new Alert(AlertType.INFORMATION);
					alerts.setTitle("EXCELENTE");
					alerts.setHeaderText("Se ha habilitado exitosamente.");
					alerts.setContentText("Se ha habilitado el tipo de producto "+nameEnableProductType.getText()+" exitosamente");
					alerts.showAndWait();

					mainMenu();
				}
			}
			else {
				Alert alert = new Alert(AlertType.ERROR);
				alert.setTitle("ERROR");
				alert.setHeaderText("No se pudo deshabilitar el tipo de producto");
				alert.setContentText("No existe un tipo de producto con ese nombre");
				alert.showAndWait();
			}

		}
		else {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("ERROR");
			alert.setHeaderText("No se pudo habilitar el tipo de producto");
			alert.setContentText("Debe llenar el campo para habilitar el tipo de producto");
			alert.showAndWait();
		}
	}

	@FXML
	public void loadEnableProduct(ActionEvent event) throws IOException {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("enableProduct-pane.fxml"));

		loader.setController(this);

		Parent load = loader.load();
		mainPane.setCenter(load);

		mainPane.getChildren().clear();
		mainPane.setTop(load);

		Image image = new Image("/images/Banner.jpg");
		imageEnableWallProduct.setImage(image);
		Image image2 = new Image("/images/BannerCasaDorada.jpg");
		imageEnableBannerProduct.setImage(image2);
	}

	@FXML
	public void enableProduct(ActionEvent event) throws IOException {

		if(!nameEnableProduct.getText().isEmpty()) {

			Product product = laCasaDorada.findProducts(nameEnableProduct.getText());

			if(product != null) {

				if(product.getState() == State.ENABLE) {

					Alert alert = new Alert(AlertType.ERROR);
					alert.setTitle("ERROR");
					alert.setHeaderText("No se pudo habilitar el producto");
					alert.setContentText("El producto ya se encuentra habilitado");
					alert.showAndWait();
				}
				else {

					laCasaDorada.enableProduct(product);

					Alert alerts = new Alert(AlertType.INFORMATION);
					alerts.setTitle("EXCELENTE");
					alerts.setHeaderText("Se ha habilitado exitosamente.");
					alerts.setContentText("Se ha habilitado el producto "+nameEnableProduct.getText()+" exitosamente");
					alerts.showAndWait();

					mainMenu();
				}
			}
			else {
				Alert alert = new Alert(AlertType.ERROR);
				alert.setTitle("ERROR");
				alert.setHeaderText("No se pudo habilitar el producto");
				alert.setContentText("No existe un producto con ese nombre");
				alert.showAndWait();
			}
		}
		else {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("ERROR");
			alert.setHeaderText("No se pudo habilitar el producto");
			alert.setContentText("Debe llenar el campo para habilitar el producto");
			alert.showAndWait();
		}
	}
}