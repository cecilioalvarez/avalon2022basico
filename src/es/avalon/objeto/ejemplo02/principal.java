package es.avalon.objeto.ejemplo02;

public class principal {
    public static void main(String[] args) {

        factura f1= new factura();
        f1.setNumero(1);
        f1.setConcepto("ordenador");
        f1.setImporte(200);
        System.out.println(f1.getNumero());
        System.out.println(f1.getConcepto());
        System.out.println(f1.getImporte());
        System.out.println(f1.importeConIVA());
    }



}
