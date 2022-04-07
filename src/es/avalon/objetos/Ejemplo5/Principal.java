package es.avalon.objetos.Ejemplo5;

public class Principal {
    public static void main(String[] args) {
        Factura f1 = new Factura();
        f1.setNumero(1);
        f1.setConcepto("ordenador");
        f1.setImporte(200);
        System.out.println(f1.getNumero());
        System.out.println(f1.getConcepto());
        System.out.println(f1.getImporte());

        System.out.println(f1.importeConIVA(21));
        System.out.println(".........");
        System.out.println(f1.importeConIVA());
        f1.setConcepto("coche");
        System.out.println(f1.getConcepto());
    }
}
