package es.avalon.objetos.ejemplo18;

public class CompraConIVA  extends Compra{
    public CompraConIVA(int numero, String concepto, double importe) {
        super(numero, concepto, importe);
    }

    @Override
    public double getImporteConIVA() {
        return getImporte()*1.21;
    }
}
