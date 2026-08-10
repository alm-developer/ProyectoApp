package org.example.models.Contabilidad;

import java.time.LocalDate;
import java.util.Date;

public abstract class Movimientos {
        private String idMovimiento;
        private String nombre;
        private LocalDate fechaRealizaicon;
        private String descripcion;
        private String IdAlmacen;
        private double valor;


    public Movimientos(String idMovimiento, String nombre, LocalDate fechaRealizaicon, String descripcion, double valor, String idAlmacen ) {
        this.idMovimiento = idMovimiento;
        this.nombre = nombre;
        this.fechaRealizaicon = fechaRealizaicon;
        this.descripcion = descripcion;
        this.valor = 0.0;
        this.IdAlmacen = idAlmacen;

    }

    public String getIdMovimiento() {
        return idMovimiento;
    }

    public LocalDate getFechaRealizaicon() {
        return fechaRealizaicon;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getIdAlmacen() {
        return IdAlmacen;
    }
}
