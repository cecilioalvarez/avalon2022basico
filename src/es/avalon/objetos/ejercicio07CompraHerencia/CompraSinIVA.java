package es.avalon.objetos.ejercicio07CompraHerencia;

public class CompraSinIVA extends Compra{

    public CompraSinIVA(int numero, String concepto, double importe) {
        super(numero, concepto, importe);
    }

    @Override
    public double getImporteConIVA() {
        return getImporte();
    }
}
