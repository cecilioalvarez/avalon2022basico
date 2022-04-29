package es.avalon.Lambdas.Ejemplo1Introduccion;

public class FiltroProductoCaro implements FiltroProducto {

    @Override
    public boolean filtrar(Producto producto) {
        return producto.getImporte()<50;
    }
}
