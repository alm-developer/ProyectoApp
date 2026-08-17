package org.example.models.seguridad;

public class Usuario {
    private String IdUsuario;
    private String nombre;
    private String contraseña;

    public Usuario(String IdUsuario, String nombre, String contraseña) {
        this.IdUsuario = IdUsuario;
        this.nombre = nombre;
        this.contraseña = contraseña;
    }
}
