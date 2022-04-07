package Objetos.Ejemplo007;

import Objetos.Ejemplo006.Rectangulo;

public class Principal {
    public static void main(String[] args) {
        LamparaTecho l = new LamparaTecho(10,15,20);
        System.out.println(l.getBombilla1());
        System.out.println(l.getBombilla2());
        System.out.println(l.getBombilla3());
        System.out.println(l.total());
        l.setBombilla1(5);
        l.setBombilla2(25);
        l.setBombilla3(35);
        System.out.println("nuevo valores");
        System.out.println(l.getBombilla1());
        System.out.println(l.getBombilla2());
        System.out.println(l.getBombilla3());
        System.out.println(l.total());
    }
    }


