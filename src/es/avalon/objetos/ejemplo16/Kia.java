package es.avalon.objetos.ejemplo16;

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
