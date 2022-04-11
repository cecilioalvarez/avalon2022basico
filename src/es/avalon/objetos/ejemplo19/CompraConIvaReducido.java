package es.avalon.objetos.ejemplo19;

public class CompraConIvaReducido extends Compra{
    public CompraConIvaReducido(int numero, String concepto, double importe) {
        super(numero, concepto, importe);
    }

    @Override
    public double getImporteConIVA() {
        return getImporte()*1.10;
    }
}
