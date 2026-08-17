package org.example.controllers.Seguridad;

import javafx.fxml.FXML;
import javafx.scene.control.Hyperlink;

import java.awt.*;

public class InicioSesionController {

    @FXML
    private TextField IdEntradaUsuario;

    @FXML
    private TextField idEntradaContraseña;

    @FXML
    Button idBtnConfirmarInicioSesion;

    @FXML
    Hyperlink IdNoCuenta;

    @FXML
    Hyperlink OlvidoContraseña;

    @FXML
    Label IdMostrarErrores;

}
