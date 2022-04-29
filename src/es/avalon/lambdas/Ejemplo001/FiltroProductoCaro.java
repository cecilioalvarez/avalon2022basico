package es.avalon.lambdas.Ejemplo001;

public class FiltroProductoCaro implements FiltroProducto{

    @Override
    public boolean filtrar(Producto producto) {
        return producto.getImporte()<50;
    }
}
