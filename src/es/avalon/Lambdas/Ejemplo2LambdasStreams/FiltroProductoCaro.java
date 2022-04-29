package es.avalon.Lambdas.Ejemplo2LambdasStreams;

import es.avalon.Lambdas.Ejemplo1Introduccion.Producto;

public class FiltroProductoCaro implements FiltroProducto {

    @Override
    public boolean filtrar(Producto producto) {
        return producto.getImporte()<50;
    }
}
