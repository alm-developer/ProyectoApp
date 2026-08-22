package org.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.example.dao.SeguridadDao.UsuarioDao;
import org.example.database.DatabaseConnection;
import org.example.models.seguridad.Usuario;
import org.example.ui.seguridad.InicioSesionUI;

import java.io.IOException;
import java.io.PipedReader;

public class Main extends Application {
    private static Stage stagePrincipal;

    @Override
    public void start(Stage primaryStage) throws IOException {

        InicioSesionUI primeraPantalla = new InicioSesionUI();

        Scene escena = new Scene(primeraPantalla,1000,700);
        primaryStage.setTitle("INICIO SESION");
        primaryStage.setScene(escena);
        primaryStage.show();
        primaryStage.setFullScreen(true);
        primaryStage.setResizable(false);

    }

        public static void main(String[] args){
        launch(args);
    }

}