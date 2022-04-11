package es.avalon.poli;

public class Principal {

    public static void main(String[] args) {
        Conductor c = new Conductor(new Kia());
        c.cambiarMarcha();
        c.girarCoche();
        c.setCoche(new Golf());
        c.cambiarMarcha();
        c.girarCoche();
    }
}
