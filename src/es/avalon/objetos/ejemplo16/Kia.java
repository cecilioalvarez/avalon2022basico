package es.avalon.objetos.ejemplo16;

public class Kia extends Coche{
    @Override
    public void girar() {
        System.out.println("El Kia gira");

    }

    @Override
    public void cambiarMarcha() {
        System.out.println("El Kia cambia de marcha");
    }
}
