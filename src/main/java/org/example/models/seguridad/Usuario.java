package org.example.models.seguridad;

import org.example.service.validacion.ServiceUsuario;

public class Usuario {
    private int IdUsuario;
    private String nombre;
    private String contraseña;

    public Usuario(String nombre, String contraseña) {
        this.IdUsuario = 0;
        this.nombre = nombre;
        this.contraseña = contraseña;

    }
}
