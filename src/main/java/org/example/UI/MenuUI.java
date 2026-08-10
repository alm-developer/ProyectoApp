package org.example.UI;

import org.example.service.Ge.GestionAlmacen;

import java.util.Scanner;
public class MenuUI {

    private static final Scanner lector = new Scanner(System.in);


    public static void menu(){
        GestionAlmacen.mostrarAlmacenes();
        GestionAlmacen.seleccionadorAutomaticoCreadorInicial();
        seleccionAlmacen();
    }

    public static void seleccionAlmacen(){

    }
}
