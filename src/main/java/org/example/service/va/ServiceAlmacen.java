package org.example.service.va;

import org.example.models.Inventario.Almacen;


public class ServiceAlmacen {

    public static Almacen almSolAlm(String id_almacen, String nombre, String titular) {

        if (id_almacen != null) {
            System.out.println("El id es valido");
        } else {
            System.out.println("El id no puede ser nulo");

        }

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

        Almacen nuevoAlmacen = new Almacen(id_almacen, nombre, titular);
        return nuevoAlmacen;
    }
}
