package es.avalon.objetos.Ejemplo19;

public class CompraSinIva extends Compra{

    public CompraSinIva(double importe, String concepto, int ncompra) {
        super(importe, concepto, ncompra);
    }

    @Override
    public double getImporte1() {
        return getImporte();
    }
}
