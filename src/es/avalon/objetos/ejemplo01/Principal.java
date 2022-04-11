package es.avalon.objetos.ejemplo01;

public class Principal {
    public static void main(String[] args) {

        factura f1= new factura();
        f1.numero=1;
        f1.concepto="ordenador";
        f1.importe=200;
        System.out.println(f1.numero);
        System.out.println(f1.concepto);
        System.out.println(f1.importe);
        System.out.println(f1.importeConIva());

    }
}
