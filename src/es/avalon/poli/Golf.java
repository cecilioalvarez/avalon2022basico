package es.avalon.poli;

public class Golf extends Coche {

    @Override
    public void girar() {
        System.out.println("El Golf gira");
    }

    @Override
    public void cambiarMarcha() {
        System.out.println("El gol Cambia de Marcha");
    }
}
