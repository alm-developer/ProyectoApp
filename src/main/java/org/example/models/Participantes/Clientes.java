package org.example.models.Participantes;

import org.example.models.Inventario.Producto;

public class Clientes extends Personas {

    public Clientes(String idAlmacen, String nombre, String descripcion, boolean confianza, int numeroOperaciones) {
        super(idAlmacen, nombre, descripcion, confianza, numeroOperaciones);
    }
}
