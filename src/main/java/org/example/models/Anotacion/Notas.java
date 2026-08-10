package org.example.models.Anotacion;

import java.util.Date;

public class Notas {
    private String idNotas;
    private String titulo;
    private Date fechaReal;

    public Notas(String idNotas, String titulo, Date fechaReal, String idAlmacen) {
        this.idNotas = idNotas;
        this.titulo = titulo;
        fechaReal = fechaReal;
        IdAlmacen = idAlmacen;
    }

    private String IdAlmacen;

}
