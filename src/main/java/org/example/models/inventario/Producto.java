package org.example.models.inventario;

public class Producto {
    private String idProducto;
    private String nombre;
    private String descripcion;
    private double Stock;
    private double precioAdquisicion;
    private double precioVenta;
    private String idCategoria;
    private String idAlmacen;

    public Producto(String idProducto, String nombre, String descripcion, double stock,  double precioAdquisicion, double precioVenta, String idCategoria, String idAlmacen) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.Stock = stock;
        this.precioAdquisicion = precioAdquisicion;
        this.precioVenta = precioVenta;
        this.idCategoria = idCategoria;
        this.idAlmacen = idAlmacen;
    }

}
