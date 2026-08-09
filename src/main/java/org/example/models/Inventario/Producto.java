package org.example.models.Inventario;

public class Producto {
    private String idProducto;
    private String nombre;
    private String descripcion;
    private double precioAdquisicion;
    private double precioVenta;
    private String idAlmacen;

    public Producto(String idProducto, String nombre, String descripcion, double precioAdquisicion, double precioVenta, String idAlmacen) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioAdquisicion = precioAdquisicion;
        this.precioVenta = precioVenta;
        this.idAlmacen = idAlmacen;
    }

}
