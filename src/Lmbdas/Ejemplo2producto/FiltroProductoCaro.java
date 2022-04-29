package Lmbdas.Ejemplo2producto;

public class FiltroProductoCaro implements  FiltroProducto{

    @Override
    public boolean filtar(Producto prodcuto) {
        if(prodcuto.getImporte()<50){
            return true;
        }else{
            return false;
        }

    }
}
