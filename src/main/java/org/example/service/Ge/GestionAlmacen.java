package org.example.service.Ge;

import org.example.models.Inventario.Almacen;
import org.example.service.va.ServiceAlmacen;

import java.util.ArrayList;

public class GestionAlmacen {

    private static ArrayList<Almacen> listaAlmacenes = new ArrayList<Almacen>();

    public static void mostrarAlmacenes() {
        if (listaAlmacenes.isEmpty()) {
            System.out.println("No exsisten almacenes");
            System.out.println(" ");
        } else {
            System.out.println("---ALMACENES---");
            for (Almacen i : listaAlmacenes) {
                System.out.println(" ");
                System.out.println("Id del Almacen: " + i.getIdAlmacen());
                System.out.println("Nombre del Almacen: " + i.getNombre());
                System.out.println("Titular del Almacen: " + i.getTitular());
                System.out.println("Numero total de prodcutos: " + i.getListaProductos().size());
                System.out.println(" ");
            }
        }

    }


    public static void guardarAlmacen() {
        Almacen almacenCreado = ServiceAlmacen.almSolAlm("AS", "ASDA", "ANGEL");
        listaAlmacenes.add(almacenCreado);
        System.out.println("Almacén añadido a la lista correctamente.");
    }

    public void eliminarAlmacen(Almacen almacenSeleccionado) {
        listaAlmacenes.remove(almacenSeleccionado);
    }

    public void seleccionarAlmacen(){

    }


}
