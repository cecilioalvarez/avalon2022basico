package es.avalon.Objetos.EjemploIVA;

public class ivaGeneral extends Compra{

        public ivaGeneral(int numero, String concepto, double importe) {
            super(numero, concepto, importe);
        }

        @Override
        public double getImporteConIVA() {
            return getImporte()*1.21;
        }
}
