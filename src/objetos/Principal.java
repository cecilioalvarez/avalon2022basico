package objetos;

public class Principal {

    public static void main(String[] args){

        Factura f1 = new Factura();
        f1.setConcepto("Ordenador");
        f1.setImporte(50);
        f1.setNumero(1);
        System.out.println(f1.getNumero());
        System.out.println(f1.getConcepto());
        System.out.println(f1.getImporte());
        System.out.println(f1.importeConIVA());

    }
}
