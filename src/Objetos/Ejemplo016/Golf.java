package Objetos.Ejemplo016;

public class Golf extends  Coche{
    public Golf() {
    }

    @Override
    public void girar() {
        System.out.println("el golf gira");
    }

    @Override
    public void cambiarMarcha() {
        System.out.println("el golf cambia de marcha");
    }
}
