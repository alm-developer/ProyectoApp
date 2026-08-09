package org.example.models.Contabilidad;

import java.util.Date;

public class Ingresos extends Movimientos{
    private boolean pendienteIngresar;

    public Ingresos(String idMovimiento, String nombre, Date fechaRealizaicon, String descripcion, String idAlmacen, double valor, boolean pendienteIngresar) {
        super(idMovimiento, nombre, fechaRealizaicon, descripcion, idAlmacen, valor);
        this.pendienteIngresar = true;
    }
}
