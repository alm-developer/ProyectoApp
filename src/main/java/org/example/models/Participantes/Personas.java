package org.example.models.Participantes;

public class Personas {
    private String idAlmacen;
    private String nombre;
    private String descripcion;
    private boolean confianza;
    private int numeroOperaciones;

    public Personas(String idAlmacen, String nombre, String descripcion, boolean confianza, int numeroOperaciones) {
        this.idAlmacen = idAlmacen;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.confianza = confianza;
        this.numeroOperaciones = numeroOperaciones;
    }

}
