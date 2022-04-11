package es.avalon.objetos.EjemploPolimorfismo;

public class Main {
    public static void main(String[] args) {

        Conductor c= new Conductor(new Kia());
        c.cambiarMarcha();
        c.setCoche(new Golf());
        c.cambiarMarcha();
    }
}
