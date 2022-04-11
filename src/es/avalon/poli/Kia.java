package es.avalon.poli;

public class Kia extends Coche {
    @Override
    public void girar() {
        System.out.println("El kia gira");
    }

    @Override
    public void cambiarMarcha() {
        System.out.println("El Kia cambia de marcha");
    }
}
