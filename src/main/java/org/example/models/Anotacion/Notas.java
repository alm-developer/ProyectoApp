package org.example.models.Anotacion;

import java.time.LocalDate;
import java.util.Date;

public class Notas {
    private String idNotas;
    private String titulo;
    private String Descripcion;
    private LocalDate fechaReal;
    private String IdAlmacen;

    public Notas(String idNotas, String titulo, String descripcion, LocalDate fechaReal, String idAlmacen) {
        this.idNotas = idNotas;
        this.titulo = titulo;
        this.Descripcion = descripcion;
        this.fechaReal = fechaReal;
        IdAlmacen = idAlmacen;
    }



}
