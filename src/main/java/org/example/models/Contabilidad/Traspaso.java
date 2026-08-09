package org.example.models.Contabilidad;

import java.util.Date;

public class Traspaso extends Movimientos{
    private String idAlmacenDonador;
    private String idAlmacenRecibidor;

    public Traspaso(String idMovimiento, Date fechaRealizaicon, String descripcion, String idAlmacen, String idAlmacenDonador, String idAlmacenRecibidor) {
        super(idMovimiento, fechaRealizaicon, descripcion, idAlmacen);
        this.idAlmacenDonador = idAlmacenDonador;
        this.idAlmacenRecibidor = idAlmacenRecibidor;
    }
}
