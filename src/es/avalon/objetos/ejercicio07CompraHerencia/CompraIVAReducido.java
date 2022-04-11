package es.avalon.objetos.ejercicio07CompraHerencia;

public class CompraIVAReducido extends Compra{

    public CompraIVAReducido(int numero, String concepto, double importe) {
        super(numero, concepto, importe);
    }

    @Override
    public double getImporteConIVA() {
        return getImporte() * 1.10;
    }
}
