package org.example.models.inventario;

public class Almacen {


    private int idAlmacen;
    private String nombre;
    private String titular;
    private int idUsuario;

    public Almacen(String titular, String nombre,int idUsuario ) {
        this.titular = titular;
        this.nombre = nombre;
        this.idUsuario = idUsuario;
    }
    public Almacen(int id_Almacen, String titular, String nombre, int idUsuario) {
        this.idAlmacen = id_Almacen;
        this.titular = titular;
        this.nombre = nombre;
        this.idUsuario = idUsuario;

    }


    public int getIdAlmacen() {
        return idAlmacen;
    }

    public String getTitular() {
        return titular;
    }

    public String getNombre() {
        return nombre;
    }



}

