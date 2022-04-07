package Objetos.Ejemplo001;

public class Principal {
    public static void main(String[] args) {
        Factura f = new Factura();//intancia de objeto
        f.numero=1;
        f.concepto="ordenador";
        f.importe=200;
        System.out.println(f.numero);
        System.out.println(f.concepto);
        System.out.println(f.importe);
        System.out.println(f.importeConIVA());
    }
}
