package org.example.controllers.seguridad;

import javafx.fxml.FXML;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.example.Main;
import org.example.dao.SeguridadDao.UsuarioDao;
import org.example.models.seguridad.Usuario;


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
            String usuario = idEntradaUsuario.getText();
            String contrasena = idEntradaContraseña.getText();

            try {
                Usuario usuarioTemporal = new Usuario(usuario,contrasena);
                if (UsuarioDao.exsisteUsuario(usuario)){
                    if (UsuarioDao.comprobarInicioSesion(usuarioTemporal)){
                        System.out.println("Has iniciado sesion");
                        idTextoErrores.setText("Se ha iniciado sesion correctamente");
                    } else{
                        System.out.println("No se ha podido iniciar sesion");
                        idTextoErrores.setText("Usuario o contraseña incorrectos");
                    }
                } else {
                    System.out.println("El nombre de usuario no exsiste");
                    idTextoErrores.setText("El nombre de usuario no exsiste");
                }

            } catch (Exception e) {
                e.printStackTrace();
            }


    }
    @FXML
    public void irRegistro(){

    }
}


