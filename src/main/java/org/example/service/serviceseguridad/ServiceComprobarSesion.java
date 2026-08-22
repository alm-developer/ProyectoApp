package org.example.service.serviceseguridad;

import org.example.models.seguridad.Usuario;

public class ServiceComprobarSesion {
    private static Usuario usuarioActivo;

    public static Usuario getUsuarioActivo() {
        return usuarioActivo;
    }

    public static void setUsuarioActivo(Usuario usuarioActivo) {
        ServiceComprobarSesion.usuarioActivo = usuarioActivo;
    }
}
