package org.example.models.Inventario;

public class Categorias {
    private String idCategoria;
    private String nombre;
    private String descripcion;
    private String idAlmacen;

    public Categorias(String idCategoria, String nombre, String descripcion, String idAlmacen) {
        this.idCategoria = idCategoria;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.idAlmacen = idAlmacen;
    }

}
