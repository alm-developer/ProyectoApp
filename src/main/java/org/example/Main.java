package org.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Carga la ventana principal (el menú con el BorderPane)
        Parent root = FXMLLoader.load(getClass().getResource("/views/Menu.fxml"));

        Scene scene = new Scene(root, 900, 600);
        primaryStage.setTitle("Gestor de Almacén");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args); // Esto es lo único que arranca JavaFX
    }
}