package es.avalon.implemen;

public class Candado implements Accesible{
    @Override
    public void abrir() {
        System.out.println("El candado se abre");
    }

    @Override
    public void cerrar() {
        System.out.println("el cancdado se cierra");

    }
}
