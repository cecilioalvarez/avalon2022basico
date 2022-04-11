package es.avalon.objetos.ejemplo16;

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
