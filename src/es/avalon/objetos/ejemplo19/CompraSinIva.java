package es.avalon.objetos.ejemplo19;

public class CompraSinIva extends Compra{
    public CompraSinIva(int numero, String concepto, double importe) {
        super(numero, concepto, importe);
    }

    @Override
    public double getImporteConIVA() {
        return  getImporte();
    }
}
