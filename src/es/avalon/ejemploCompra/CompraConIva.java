package es.avalon.ejemploCompra;

public class CompraConIva extends Compra{


     public CompraConIva(int numero, String concepto, double importe) {
        super(numero, concepto, importe);
    }

    @Override
    public double getImporteConIVA() {
        return getImporte()*1.21;
    }


}
