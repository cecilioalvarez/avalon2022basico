package es.avalon.objetos.EjemploPolimorfismo;

public class Kia extends Coche{

    @Override
    public void girar() {
        System.out.println("el kia gira");
    }

    @Override
    public void cambiarMarcha() {
        System.out.println("el kia cambia de marcha");
    }
}
