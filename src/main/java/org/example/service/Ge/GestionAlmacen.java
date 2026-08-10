package org.example.service.Ge;

import org.example.UI.CrearAlmacenUI;
import org.example.models.Inventario.Almacen;
import org.example.service.va.ServiceAlmacen;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionAlmacen {

    private final Scanner lector = new Scanner(System.in);
    private static String almacenSeleccionado;
    private static int idAlmacen = 0;

    private static ArrayList<Almacen> listaAlmacenes = new ArrayList<>();
    private int contador = 0;

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

    public static String getAlmacenSeleccioado() {
        return almacenSeleccionado;
    }

    public static void CrearAlmacen(String nombre, String titular) {

        String codigoFinal = "D" + idAlmacen;
        Almacen almacenCreado = ServiceAlmacen.almSolAlm(String.valueOf(idAlmacen), nombre, titular);
        listaAlmacenes.add(almacenCreado);
        System.out.println("Almacén añadido a la lista correctamente.");
        idAlmacen++;
    }

    public void eliminarAlmacen(Almacen almacenSeleccionado) {
        listaAlmacenes.remove(almacenSeleccionado);
    }

    public static void seleccionarAlmacen(String idAlmacen) {
        if (GestionAlmacen.BuscarAlmacen(idAlmacen)){
            almacenSeleccionado = idAlmacen;
            System.out.println("Almacen seleccionado");

        } else{
            System.out.println("El id de almacen" + idAlmacen + "no coincide con ninguno");
        }
    }


    public static boolean BuscarAlmacen(String idBuscado) {
        for (Almacen Almacen : listaAlmacenes) {
            if (Almacen.getIdAlmacen().equals(idBuscado)){
                return true;
            }
        }
        return false;
    }

    public static void crearAutomatico(){
        if (GestionAlmacen.getListaAlmacenes().isEmpty()){
            GestionAlmacen.Crear();
            Almacen recienCreado = GestionAlmacen.getListaAlmacenes().get(GestionAlmacen.getListaAlmacenes().size() - 1);
            seleccionarAlmacen(recienCreado.getIdAlmacen());

        }

    }
    public static void Crear(){
        System.out.println("----Advertencia----");
        System.out.println("Debes crear primero un almacen");
        System.out.println("-------------------");
        CrearAlmacenUI.IntroducirDatos();

    }
    public static void comprobarExsistencia() {
        if (GestionAlmacen.getListaAlmacenes().isEmpty()) {
            System.out.println("----Advertencia----");
            System.out.println("Debes crear primero un almacen");
            System.out.println("-------------------");
            CrearAlmacenUI.IntroducirDatos();

        }


    }
}



