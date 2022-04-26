package es.avalon.Objetos.EjemploIVA;

public class ivaReducido extends Compra{

    public ivaReducido(int numero, String concepto, double importe) {
        super(numero, concepto, importe);
    }

        @Override
        public double getImporteConIVA() {
            return getImporte()*1.10;
        }
}
