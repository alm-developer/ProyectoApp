package org.example.models.contabilidad;

import java.time.LocalDate;

public class Gastos extends Movimientos {

    public Gastos(String idMovimiento, String nombre, LocalDate fechaRealizaicon, String descripcion, String idAlmacen, double valor) {
        super(idMovimiento, nombre, fechaRealizaicon, descripcion, valor, idAlmacen );
    }
}
