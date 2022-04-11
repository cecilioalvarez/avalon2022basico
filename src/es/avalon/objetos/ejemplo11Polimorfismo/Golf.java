package es.avalon.objetos.ejemplo11Polimorfismo;

public class Golf extends Coche{

    @Override
    public void girar() {
        System.out.println("El Golf gira");
    }

    @Override
    public void cambiarMarcha() {
        System.out.println("El Golf cambia de marcha");
    }
}
