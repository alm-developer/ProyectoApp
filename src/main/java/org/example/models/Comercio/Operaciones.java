package org.example.models.Comercio;

import org.example.models.Inventario.Producto;

import java.util.ArrayList;

public abstract class Operaciones {
    private String idPreOperacion;
    private String nombre;
    private String Fecha;
    ArrayList <Producto> listaProPre = new ArrayList<>();
    private double resultado;
    private String idAlmacen;

    public Operaciones(String idPreOperacion, String nombre, String fecha, String idAlmacen) {
        this.idPreOperacion = idPreOperacion;
        this.nombre = nombre;
        this.Fecha = fecha;
        this.listaProPre = listaProPre;
        this.resultado = resultado;
        this.idAlmacen = idAlmacen;
    }


}
