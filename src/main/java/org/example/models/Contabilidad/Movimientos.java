package org.example.models.Contabilidad;

import java.time.LocalDate;
import java.util.Date;

public abstract class Movimientos {
        private String idMovimiento;
        private String nombre;
        private LocalDate FechaRealizaicon;
        private String Descripcion;
        private String IdAlmacen;
        private double valor;


    public Movimientos(String idMovimiento, String nombre, LocalDate fechaRealizaicon, String descripcion, double valor, String idAlmacen ) {
        this.idMovimiento = idMovimiento;
        this.nombre = nombre;
        this.FechaRealizaicon = fechaRealizaicon;
        this.Descripcion = descripcion;
        this.valor = 0.0;
        this.IdAlmacen = idAlmacen;

    }

    public String getIdMovimiento() {
        return idMovimiento;
    }

    public LocalDate getFechaRealizaicon() {
        return FechaRealizaicon;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public String getIdAlmacen() {
        return IdAlmacen;
    }
}
