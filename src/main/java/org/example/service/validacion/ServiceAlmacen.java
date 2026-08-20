package org.example.service.validacion;

import org.example.models.inventario.Almacen;


public class ServiceAlmacen {

    public static boolean ValidarAlmacen(String nombre, String titular) {


        if (nombre != null && nombre.length() > 0 && nombre.length() < 15) {
            System.out.println("El nombre es valido");
        } else {
            System.out.println("El nombre no es valido");
        }

        if (titular != null &&  titular.length() > 0 &&  titular.length() < 15) {
            System.out.println("El titular  es valido");
        } else {
            System.out.println("El titular no es valido");
        }
        return true;
    }
}
