package es.avalon.objetos.EjemploObjetos004;

public class Principal {
    public static void main(String[] args) {

        Factura f1 = new Factura();
        f1.setNumero(1);
        f1.setImporte(200);
        f1.setConcepto("Ordenador");

        System.out.println(f1.getConcepto());
        System.out.println(f1.getNumero());
        System.out.println(f1.getImporte());
        System.out.println(f1.importeConIVA());
        System.out.println(f1.importeConIVA(20));
    }
}
