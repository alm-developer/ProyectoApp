package org.example.controllers.seguridad;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import org.example.Main;
import org.example.dao.SeguridadDao.UsuarioDao;
import org.example.models.seguridad.Usuario;
import org.example.service.validacion.ServiceUsuario;

import java.io.IOException;

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
    public void RegistrarUsuario() {
        String nombre = idEntradaUsuario.getText();
        String contraseña = idEntradaContraseña.getText();
        String contraseñaRepetir = idEntradaContraseñaRepetir.getText();

        if (ServiceUsuario.validarUsuario(nombre, contraseña, contraseñaRepetir)) {
            if (UsuarioDao.exsisteUsuario(nombre)) {
                idTextoErrores.setText("El nombre de usuario ya está en uso.");
                System.out.println("El nombre que se intenta guardar ya exsiste");
            } else {
                Usuario Usuario1 = new Usuario(nombre, contraseña);
                boolean registradoBd = UsuarioDao.crearUsuario(Usuario1);

                if (registradoBd) {
                    System.out.println("Usuario registrado con exito");
                    idTextoErrores.setText("Registrado con exito");

                } else {
                    idTextoErrores.setText("Rellena todos los datos");
                    System.out.println("No se han rellenado los datos");
                }
            }
        } else {
            idTextoErrores.setText("Introduce los datos o corrigelos");
            System.out.println("No se han rellenado todos los campos");
        }

    }


    public void irInicioSesion(ActionEvent actionEvent) {

    }
}


