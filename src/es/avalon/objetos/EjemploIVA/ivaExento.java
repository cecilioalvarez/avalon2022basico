package es.avalon.objetos.EjemploIVA;

public class ivaExento extends Compra{


    public ivaExento(int numero, String concepto, double importe) {
        super(numero, concepto, importe);
    }

    @Override
    public double getImporteConIVA() {
        return 0;
    }
}
