package org.example.models.Contabilidad;

import java.time.LocalDate;
import java.util.Date;

public class Gastos extends Movimientos {

    public Gastos(String idMovimiento, String nombre, LocalDate fechaRealizaicon, String descripcion, String idAlmacen, double valor) {
        super(idMovimiento, nombre, fechaRealizaicon, descripcion, valor, idAlmacen );
    }
}
