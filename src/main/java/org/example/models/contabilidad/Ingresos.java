package org.example.models.contabilidad;

import java.time.LocalDate;

public class Ingresos extends Movimientos{

    public Ingresos(String idMovimiento, String nombre, LocalDate fechaRealizaicon, String descripcion, double valor, String idAlmacen) {
        super(idMovimiento, nombre, fechaRealizaicon, descripcion,valor, idAlmacen);
    }


}
