package es.avalon.objetos.ejemplo02;

public class Principal {
    public static void main(String[] args) {
        Factura f1 = new Factura();
        f1.setNumero(1);
        f1.setConcepto("ordenador");
        f1.setImporte(200);
        System.out.println(f1.getNumero());
        System.out.println(f1.getConcepto());
        System.out.println(f1.getImporte());
        System.out.println(f1.importeConIVA());
    }
}
