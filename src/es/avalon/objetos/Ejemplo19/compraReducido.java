package es.avalon.objetos.Ejemplo19;

public class compraReducido extends Compra {
    public compraReducido(double importe, String concepto, int ncompra) {
        super(importe, concepto, ncompra);
    }

    @Override
    public double getImporte1() {
        return getImporte()*1.1;
    }
}
