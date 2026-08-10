package org.example.UI;

import org.example.service.Ge.GestionAlmacen;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CrearAlmacenUI {

    private static final Scanner lector = new Scanner(System.in);

    private String idAlmacen;
    private String nombre;
    private String titular;

    public static void IntroducirDatos() {
        System.out.println("---Formulario de iniciacion---");
        System.out.println ("Escribe el nombre del Almacen: ");
        String nombre = lector.nextLine();
        System.out.println ("Escribe el titular del Almacen: ");
        String titular = lector.nextLine();
        GestionAlmacen.CrearAlmacen(nombre,titular);


    }
}
