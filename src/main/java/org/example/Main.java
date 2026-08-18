package org.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
            Parent root = FXMLLoader.load(getClass().getResource("/views/seguridad/RegistroSesion.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setTitle("Registro Usuario");
            primaryStage.setScene(scene);
            primaryStage.setFullScreen(true);
            primaryStage.setResizable(false);
            primaryStage.show();

    }
        public static void main(String[] args){
        launch(args);
    }

}