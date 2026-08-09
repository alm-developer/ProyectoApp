package org.example.models.Comercio;

public class PreVenta extends Operaciones {
    private boolean VenPenRes;
    public PreVenta(String idPreOperacion, String nombre, String fecha, String idAlmacen, boolean VenPenRes) {
        super(idPreOperacion, nombre, fecha, idAlmacen);
        this.VenPenRes = true;
    }
}
