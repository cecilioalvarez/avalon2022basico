package Objetos.Ejemplo013;

public class Principal {
    public static void main(String[] args) {
        Bombilla b = new Bombilla();
        b.on();
        System.out.println(b.isEstado());
        b.off();
        System.out.println(b.isEstado());
    }
}
