package org.example.service.Ge;

import org.example.models.Inventario.Almacen;
import org.example.service.va.ServiceAlmacen;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionAlmacen {

    private final Scanner lector = new Scanner(System.in);
    private static String almacenSeleccionado;
    private static int idAlmacen = 0;

    private static ArrayList<Almacen> listaAlmacenes = new ArrayList<>();

    public static ArrayList<Almacen> getListaAlmacenes() {
        return listaAlmacenes;
    }

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

    public static String getAlmacenSeleccionado() {
        return almacenSeleccionado;
    }

    public static void CrearAlmacen(String nombre, String titular) {
        String codigoFinal = "D" + idAlmacen;
        Almacen almacenCreado = ServiceAlmacen.almSolAlm(String.valueOf(codigoFinal), nombre, titular);
        listaAlmacenes.add(almacenCreado);
        System.out.println("Almacén añadido a la lista correctamente.");
        idAlmacen++;
    }

    public static void editarAlmacen(String idAlmacen){

    }

    public void eliminarAlmacen(Almacen almacenSeleccionado) {
        listaAlmacenes.remove(almacenSeleccionado);
    }

    public static void seleccionarAlmacen(String idAlmacen) {
        if (GestionAlmacen.BuscarAlmacen(idAlmacen)){
            almacenSeleccionado = idAlmacen;
            System.out.println("Almacen seleccionado");

        } else{
            System.out.println("El id de almacén " + idAlmacen + " no coincide con ninguno.");        }
    }

    public static boolean BuscarAlmacen(String idBuscado) {
        for (Almacen Almacen : listaAlmacenes) {
            if (Almacen.getIdAlmacen().equals(idBuscado)){
                return true;
            }
        }
        return false;
    }

    public static void seleccionadorAutomaticoCreadorInicial() {
        if (GestionAlmacen.getListaAlmacenes().isEmpty()) {
            System.out.println("---- Advertencia ----");
            System.out.println("Debes crear primero un almacén.");
            System.out.println("---------------------");


            Almacen recienCreado = GestionAlmacen.getListaAlmacenes().get(GestionAlmacen.getListaAlmacenes().size() - 1);
            almacenSeleccionado = (recienCreado.getIdAlmacen());
        }

    }




    }




