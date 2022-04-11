package es.avalon.objetos.EjemploObjetos011;

public class Principal {
    public static void main(String[] args) {

        Lampara l = new Lampara(new Bombilla(1));
        l.on();
    }
}
