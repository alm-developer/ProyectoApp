package org.example.models.Contabilidad;

import java.util.Date;

public class Ingresos extends Movimientos{

    public Ingresos(String idMovimiento, String nombre, Date fechaRealizaicon, String descripcion, double valor, String idAlmacen) {
        super(idMovimiento, nombre, fechaRealizaicon, descripcion,valor, idAlmacen);
    }
}
