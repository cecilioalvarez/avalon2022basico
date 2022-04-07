package es.avalon.objetos;

public class Principal {
    public static void main(String[] args) {

        Factura f= new Factura();
        f.setNumero(1);
        f.setConcepto("Ordenador");
        f.setImporte(200);

        System.out.println(f.getNumero());
        System.out.println(f.getConcepto());
        System.out.println(f.getImporte());
        System.out.println(f.importeIva());
    }
}
