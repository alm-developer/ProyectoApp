package org.example.models.Comercio;

public class Compra extends Operaciones {
    private boolean penRes;
    public Compra(String idPreOperacion, String nombre, String fecha, String idAlmacen, boolean pendRes) {
        super(idPreOperacion, nombre, fecha, idAlmacen);
        this.penRes = false;
    }
}
