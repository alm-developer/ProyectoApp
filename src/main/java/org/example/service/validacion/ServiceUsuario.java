package org.example.service.validacion;

import javafx.scene.control.Alert;

public class ServiceUsuario {

    public static boolean validarUsuario(String nombre, String contraseña, String repetirContraseña) {

        // esto es que si es nulo o contiene solo espacios salta el error
        if (nombre == null || nombre.isBlank()) {
            return false;
        } else if (contraseña == null || contraseña.isBlank()) {
            return false;
        } else if (!contraseña.equals(repetirContraseña)) {
            return false;
        }
        return true;

    }

}
