package org.example.models.Inventario;

import org.example.service.va.ServiceProducto;

import java.util.ArrayList;

public class Almacen {

    ArrayList <Producto> listaProductos = new ArrayList<>();

    private String idAlmacen;
    private String nombre;
    private String titular;


    public Almacen(String id_Almacen, String titular, String nombre) {
        this.idAlmacen = id_Almacen;
        this.titular = titular;
        this.nombre = nombre;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void guardarProducto() {
        Producto productoCreado = ServiceProducto.proSolAlm("34f", "nombre", "askdasdasdasdasd", 12.2d, 234.3d);
        listaProductos.add(productoCreado);
        System.out.println("Almacén añadido a la lista correctamente.");
    }

    public void eliminarProducto(Producto productoSeleccionado){
        listaProductos.remove(productoSeleccionado);
    }


    public String getTitular() {
        return titular;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdAlmacen() {
        return idAlmacen;
    }



}

