package org.example.models.Comercio;

import org.example.models.Inventario.Producto;

import java.util.ArrayList;

public abstract class Operaciones {

    ArrayList <Producto> listaProVenCom = new ArrayList<>();

    private String idPreOperacion;
    private String nombre;
    private String fecha;
    private double resultado;
    private boolean penRes;
    private String idAlmacen;

    public Operaciones(String idPreOperacion, String nombre, String fecha, boolean penRes, String idAlmacen ) {
        this.idPreOperacion = idPreOperacion;
        this.nombre = nombre;
        this.fecha = fecha;
        this.listaProVenCom = listaProVenCom;
        this.resultado = 0.0;
        this.penRes = penRes;
        this.idAlmacen = idAlmacen;
    }


}
