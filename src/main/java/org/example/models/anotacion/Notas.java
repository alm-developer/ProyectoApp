package org.example.models.anotacion;

import java.time.LocalDate;

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
