package controller;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {
	private Stage primaryStage;

	@Override
	public void start(Stage primaryStage) {
		try {
			this.primaryStage = primaryStage;
			mainWindow();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void mainWindow() {
		try {
			FXMLLoader loader = new FXMLLoader(saa.class.getResource("/view/MainWindowView.fxml"));
			AnchorPane pane = loader.load();
			primaryStage.setMinWidth(800);
			primaryStage.setMinHeight(600);

			// MainWindowController mainWindowController =
			// loader.getController();
			// mainWindowController.setMain(this, primaryStage);

			Scene scene = new Scene(pane);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Serwis komputerowy v1.0");
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}