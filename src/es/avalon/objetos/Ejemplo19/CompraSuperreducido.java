package es.avalon.objetos.Ejemplo19;

public class CompraSuperreducido extends Compra{

    public CompraSuperreducido(double importe, String concepto, int ncompra) {
        super(importe, concepto, ncompra);
    }

    @Override
    public double getImporte1() {
        return super.getImporte()*;
    }
}

