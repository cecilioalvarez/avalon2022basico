package es.avalon.objetos.EjemploPolimorfismo;

public class Golf extends Coche{

    @Override
    public void girar() {
        System.out.println("el golf gira");
    }

    @Override
    public void cambiarMarcha() {
        System.out.println("el golf cambia de marcha");
    }
}
