package org.example.models.Contabilidad;

import java.util.Date;

public abstract class Movimientos {
        private String idMovimiento;
        private String nombre;
        private Date FechaRealizaicon;
        private String Descripcion;
        private String IdAlmacen;
        private double valor;


    public Movimientos(String idMovimiento, String nombre, Date fechaRealizaicon, String descripcion, String idAlmacen, double valor) {
        this.idMovimiento = idMovimiento;
        this.nombre = nombre;
        this.FechaRealizaicon = fechaRealizaicon;
        this.Descripcion = descripcion;
        this.IdAlmacen = idAlmacen;
        this.valor = valor;
    }

    public String getIdMovimiento() {
        return idMovimiento;
    }

    public Date getFechaRealizaicon() {
        return FechaRealizaicon;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public String getIdAlmacen() {
        return IdAlmacen;
    }
}
