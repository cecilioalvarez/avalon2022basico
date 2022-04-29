package es.avalon.lambdas;

public class FiltroProductoCaro implements FiltroProducto{

    @Override
    public boolean filtrar(Producto producto) {
        return producto.getImporte()<50;
    }
}
