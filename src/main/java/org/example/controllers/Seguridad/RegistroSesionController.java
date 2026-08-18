package org.example.controllers.Seguridad;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import org.example.models.seguridad.Usuario;
import org.example.service.validacion.ServiceUsuario;

import java.awt.*;

public class RegistroSesionController {
    @FXML
    private TextField idEntradaUsuario;

    @FXML
    private TextField idEntradaContraseña;

    @FXML
    private TextField idEntradaContraseñaRepetir;

    @FXML
    Button idBotonConfirmar;

    @FXML
    Hyperlink idYaTienesCuenta;

    @FXML
    Label idTextoErrores;

    @FXML
    public  void RegistrarUsuario(){
        String nombre = idEntradaUsuario.getText();
        String contraseña = idEntradaContraseña.getText();
        String contraseñaRepetir = idEntradaContraseñaRepetir.getText();


        if (ServiceUsuario.validarUsuario(0,nombre,contraseña,contraseñaRepetir)){
            Usuario Usuario1 = new Usuario(nombre,contraseña);
            System.out.println("Usuario registrado con exito");}
        else{
            System.out.println("El usuario no ha introducido bien los datos");

            }


        }


    public void irInicioSesion(ActionEvent actionEvent) {
    }
}


