package org.example.UI;

import org.example.service.Ge.GestionAlmacen;

import java.util.Scanner;
public class MenuUI {

    private static final Scanner lector = new Scanner(System.in);


    public static void menu(){
        GestionAlmacen.mostrarAlmacenes();

        System.out.println("----Menu----");
        System.out.println("""
                0. Crear Almacen
                1. Eliminar Almacen
                2. Salir
                3. Seleccionar Almacen
                """);
        introducirOpcion();
    }
    public static void introducirOpcion(){
        System.out.println("Elije una opcion");
        int opcion = lector.nextInt();
        lector.nextLine();
        switch (opcion){
            case 0:
                System.out.println("pasa a crear almacen");
                break;
            case 1:
                System.out.println("pasa a eliminar almacen");
                break;
            case 2:
                System.out.println("Sale de la app");
                break;
            case 3:
                System.out.println("Seleccionar Almacen");
                break;
            default:
                System.out.println("Elije una opcion valida");
                break;
        }

    }
}
