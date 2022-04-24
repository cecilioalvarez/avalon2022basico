package es.avalon.APIsCore.Genericos.ejemplo2;

public class Main {

    public static void main(String[] args) {

        Galleta g1 = new Galleta("Chocolate");
        Galleta g2 = new Galleta("Vainilla");
        Galleta g3 = new Galleta("Fresa");
        Galleta g4 = new Galleta("Chocolate");

        PackDoble<Galleta> miPack = new PackDoble<Galleta>(g1, g4);

        System.out.println(miPack.getItem1().getSabor());
        System.out.println(g1.equals(g4));
        System.out.println(miPack.iguales());
    }
}
