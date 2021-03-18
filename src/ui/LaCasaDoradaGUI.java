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

public class LaCasaDoradaGUI {

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
	public void incializateProgram(ActionEvent event) throws IOException {
		loadLogin();
	}
	
	@FXML
	public void loginUsers(ActionEvent event)throws IOException {

		if(!txtUser.getText().equals("") && !txtPassword.getText().equals("")) {

			if(!laCasaDorada.searchUser(txtUser.getText(), txtPassword.getText())){

				FXMLLoader loader = new FXMLLoader(getClass().getResource("main-menu.fxml"));

				loader.setController(this);
				Parent loginUser = loader.load();

				mainPane.getChildren().clear();
				mainPane.setCenter(loginUser);

			}else
				showAlert();
		}else
			showAlert();
	}

	@FXML
	public void showAlert() {

		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("ERROR");
		alert.setHeaderText("Nombre de usuario o contrase�a INVALIDO");
		alert.setContentText("Tu nombre de usuario o contrase�a son incorrectos, por favor intente de nuevo. ");

		alert.showAndWait();  
	}
	
}