package Objetos.Ejemplo016;

public class Kia extends Coche{
    public Kia() {
    }

    @Override
    public void girar() {
        System.out.println("el KIA gira");
    }

    @Override
    public void cambiarMarcha() {
        System.out.println("el KIA cambia de marcha");
    }
}
