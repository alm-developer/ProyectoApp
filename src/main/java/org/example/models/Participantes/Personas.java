package org.example.models.Participantes;

import org.example.utils.TiposPersonas;

public class Personas {
    private String idAlmacen;
    private String nombre;
    private String descripcion;
    private boolean confianza;
    private int numeroOperaciones;
    private TiposPersonas tipoPersona;

    public Personas(String idAlmacen, String nombre, String descripcion, boolean confianza, TiposPersonas tipoPersona, int numeroOperaciones) {
        this.idAlmacen = idAlmacen;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.confianza = confianza;
        this.tipoPersona = tipoPersona;
        this.numeroOperaciones = numeroOperaciones;
    }

}
