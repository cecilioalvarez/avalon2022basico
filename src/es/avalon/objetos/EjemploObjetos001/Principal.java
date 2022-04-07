package es.avalon.objetos.EjemploObjetos001;

public class Principal {
    public static void main(String[] args) {

        Factura f1 = new Factura();
        f1.numero = 1;
        f1.concepto = "Ordenador";
        f1.importe = 200;

        System.out.println(f1.concepto);
        System.out.println(f1.numero);
        System.out.println(f1.importe);
        System.out.println(f1.importeConIVA());
    }
}
