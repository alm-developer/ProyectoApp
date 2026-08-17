package org.example.models.contabilidad;

import java.time.LocalDate;

public class Traspaso extends Movimientos {
    private String idAlmacenDonador;
    private String idAlmacenRecibidor;

    public Traspaso(String idMovimiento, String nombre, LocalDate fechaRealizaicon, String descripcion, double valor, String idAlmacen) {
        super(idMovimiento, nombre, fechaRealizaicon, descripcion,valor, idAlmacen);
        this.idAlmacenDonador = idAlmacenDonador;
        this.idAlmacenRecibidor = idAlmacenRecibidor;
    }
}
