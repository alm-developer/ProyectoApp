package org.example.service.Ge;

import org.example.models.Contabilidad.Movimientos;
import org.example.models.Contabilidad.Ingresos;

import java.time.LocalDate;
import java.util.ArrayList;

public class GestionMovimientos {

    ArrayList<Movimientos> listaMovimientos = new ArrayList<>();

    public static void CrearMovimiento() {
        Movimientos movimiento = new Ingresos("fd44","angel", LocalDate.now(), "3434", 10, "adasd");
    }

    public void eliminarMovimiento(){

    }

    public void editarMovimiento(){

    }

    public void buscarMovimiento(){

    }

    public void seleccionarMovimiento(){

    }
}


