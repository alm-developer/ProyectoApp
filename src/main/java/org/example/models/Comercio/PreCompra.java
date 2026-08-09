package org.example.models.Comercio;

public class PreCompra extends Operaciones {
    private boolean ComPenRes;

    public PreCompra(String idPreOperacion, String nombre, String fecha, String idAlmacen, boolean ComPenRes) {
        super(idPreOperacion, nombre, fecha, idAlmacen);
        this.ComPenRes = true;
    }
}
