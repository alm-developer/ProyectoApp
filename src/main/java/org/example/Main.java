package org.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.example.dao.SeguridadDao.UsuarioDao;
import org.example.database.DatabaseConnection;
import org.example.models.seguridad.Usuario;

import java.io.IOException;
import java.io.PipedReader;

public class Main extends Application {
    private static Stage stagePrincipal;

    @Override
    public void start(Stage primaryStage) throws IOException {
        //La stage principal es importante porque es la ventana que se abre, la escena es lo que se pone en la ventana
        //Sin la stage nada funcionaria
        //Por eso todo lo modificado va para la stage, porque basicamente es la pantalla
            stagePrincipal = primaryStage;
            DatabaseConnection.inicializarDatabase();
            Parent root = FXMLLoader.load(getClass().getResource("/views/seguridad/RegistroSesion.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setTitle("Registro Usuario");
            primaryStage.setScene(scene);
            primaryStage.setFullScreen(true);
            primaryStage.setResizable(false);
            primaryStage.show();


    }
    public static void abrirVentana(String rutaFxml) throws IOException {
        try {
            Parent root = FXMLLoader.load(Main.class.getResource(rutaFxml));
           //el loader debe de obener el fxml
            Stage ventana = new Stage();
            Scene escena = new Scene(root);
            ventana.setScene(escena);
            ventana.setResizable(false);
            ventana.show();
            // luego se debe crear la stage con este
            //despues se debe definir la escena
            // despues el titulo y ademas que no se pueda hacer mas grande la ventana y despues el show muestra
        } catch (IOException e) {
            System.err.println("Error al cambiar a la pantalla: " + rutaFxml);
            e.printStackTrace();
        }

    }


    public static void cambiarPantalla(String rutaFxml) throws IOException {
        try {
            //obtiene la escena entonces la ruta ya estaria guardada en root.
            Parent root = FXMLLoader.load(Main.class.getResource(rutaFxml));
            //establece el archivo como pantalla
            stagePrincipal.getScene().setRoot(root);
        } catch (IOException e) {
            System.err.println("Error al cambiar a la pantalla: " + rutaFxml);
            e.printStackTrace();
        }

    }
        public static void main(String[] args){
        launch(args);
    }

}