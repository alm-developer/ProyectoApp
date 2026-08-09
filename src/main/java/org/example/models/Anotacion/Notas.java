package org.example.models.Anotacion;

import java.util.Date;

public class Notas {
    private String idNotas;
    private String Titulo;
    private Date FechaReal;

    public Notas(String idNotas, String titulo, Date fechaReal, String idAlmacen) {
        this.idNotas = idNotas;
        Titulo = titulo;
        FechaReal = fechaReal;
        IdAlmacen = idAlmacen;
    }

    private String IdAlmacen;

}
