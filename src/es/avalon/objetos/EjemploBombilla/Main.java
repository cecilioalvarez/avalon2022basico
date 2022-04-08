package es.avalon.objetos.EjemploBombilla;

public class Main {
    public static void main(String[] args) {

        Lampara l=new Lampara(new Bombilla(1));

        l.on();
    }
}
