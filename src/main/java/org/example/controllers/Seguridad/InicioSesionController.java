package org.example.controllers.Seguridad;

import javafx.fxml.FXML;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.example.Main;


import java.awt.*;
import java.io.IOException;

public class InicioSesionController {

    @FXML
    private TextField idEntradaUsuario;

    @FXML
    private TextField idEntradaContraseña;

    @FXML
    Button idBtnConfirmar;

    @FXML
    Hyperlink idIrRegistro;

    @FXML
    Hyperlink OlvidoContraseña;

    @FXML
    Label idTextoErrores;

    @FXML
    public void iniciarSesion(){

    }
    @FXML
    public void irRegistro(){
        try {
            Main.cambiarPantalla("/views/seguridad/RegistroSesion.fxml");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


