package org.example.models.participantes;

import org.example.utils.TipoPersona;

public class Personas {
    private String idAlmacen;
    private String nombre;
    private String descripcion;
    private boolean confianza;
    private TipoPersona tipoPersona;
    private int numeroOperaciones;


    public Personas(String idAlmacen, String nombre, String descripcion, boolean confianza, TipoPersona tipoPersona, int numeroOperaciones) {
        this.idAlmacen = idAlmacen;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.confianza = confianza;
        this.tipoPersona = tipoPersona;
        this.numeroOperaciones = numeroOperaciones;
    }

}
