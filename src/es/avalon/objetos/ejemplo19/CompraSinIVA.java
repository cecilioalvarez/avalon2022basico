package es.avalon.objetos.ejemplo19;

public class CompraSinIVA extends Compra {
    public CompraSinIVA(int numero, String concepto, double importe) {
        super(numero, concepto, importe);
    }

    @Override
    public double getImporteConIVA() {
        return  getImporte();
    }
}
