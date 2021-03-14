package ui;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import model.LaCasaDorada;

public class Main extends Application{
	
	private LaCasaDorada laCasaDorada;
	private LaCasaDoradaGUI laCasaDoradaGUI;
	
	public Main() {
		
		boolean loadInformation;
		
		laCasaDorada = new LaCasaDorada();
		laCasaDoradaGUI = new LaCasaDoradaGUI(laCasaDorada);
		
		try {
			loadInformation = laCasaDorada.loadData();
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
			loadInformation = false;
		}
		
		if(!loadInformation) {
			
			Alert alert = new Alert(AlertType.INFORMATION);
			
		    alert.setTitle("La Casa Dorada");
		    alert.setContentText("Error cargando el archivo");
		    alert.showAndWait();
		}
	}
	
	public static void main(String[] args) {
<<<<<<< HEAD
		
=======

		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(""));
		
		fxmlLoader.setController(laCasaDoradaGUI);
		
		Parent root = fxmlLoader.load();
		
		Scene scene = new Scene(root);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("La Casa Dorada");
		primaryStage.show();
>>>>>>> 9dbc3920482ab4664a4446abe59ed56970591ae0
	}

}
