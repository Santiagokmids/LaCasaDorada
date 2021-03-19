package ui;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import model.LaCasaDorada;
import model.State;

public class LaCasaDoradaGUI {
	
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
	private TextField id;

	@FXML
	private PasswordField password;

	@FXML
	private PasswordField passwordTwo;

	private LaCasaDorada laCasaDorada;

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
	public void loadRegister() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("register-pane.fxml"));

		loader.setController(this);
		Parent load = loader.load();
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
					alerts.setContentText("Se ha registrado exitosamente a "+nameUser.getText()+" exitosamente");
					alerts.showAndWait();

					laCasaDorada.create(name.getText(), lastName.getText(), id.getText(), nameUser.getText(), password.getText(), State.ENABLE);
					loadLogin();

				}else {

					alert.setHeaderText("Las contraseñas no coinciden");
					alert.setContentText("Las contraseñas deben ser iguales");
					alert.showAndWait();
				}

			}
		}
		else {

			alert.setHeaderText("No se pudo crear el Usuario");
			alert.setContentText("Debe llenar todos los campos para crear el usuario");
			alert.showAndWait();

		}
	}

	@FXML
	void loadRegisterEmployee(ActionEvent event) throws IOException {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("registerEmployee-pane.fxml"));

		loader.setController(this);
		Parent load = loader.load();
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

		Parent loginUser = loader.load();

		mainPane.getChildren().clear();
		mainPane.setCenter(loginUser);

		Image image = new Image("/images/BannerCasaDorada.jpg");
		imageBanner.setImage(image);
	}

	@FXML
	public void showAlert() {

		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("ERROR");
		alert.setHeaderText("Nombre de usuario o contraseña INVALIDO");
		alert.setContentText("Su nombre de usuario o contraseña son incorrectos, por favor intente de nuevo. ");
		alert.setContentText("Tu nombre de usuario o contraseña son incorrectos, por favor intente de nuevo. ");

		alert.showAndWait();  
	}

	@FXML
	void createEmployee(ActionEvent event) {

	}

}