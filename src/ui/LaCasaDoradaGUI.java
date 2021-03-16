package ui;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
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
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("main-menu.fxml"));

		loader.setController(this);
		Parent load = loader.load();

		mainPane.getChildren().clear();
		mainPane.setCenter(load);
	} 		

	@FXML
	public void incializateProgram(ActionEvent event) throws IOException {
		loadLogin();
	}
}