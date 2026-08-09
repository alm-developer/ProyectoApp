package org.example.models.Contabilidad;

import java.util.Date;

public class Gastos extends Movimientos {

    public Gastos(String idMovimiento, String nombre, Date fechaRealizaicon, String descripcion, String idAlmacen, double valor) {
        super(idMovimiento, nombre, fechaRealizaicon, descripcion, valor, idAlmacen );
    }
}
