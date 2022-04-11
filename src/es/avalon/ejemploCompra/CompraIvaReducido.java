package es.avalon.ejemploCompra;

public class CompraIvaReducido  extends Compra{


    public CompraIvaReducido(int numero, String concepto, double importe) {
        super(numero, concepto, importe);
    }

    @Override
    public double getImporteConIVA() {
        return getImporte()*1.10;
    }
    }

