package es.avalon.objetos.ejemplo21;

public class Candado implements Accesible{

    @Override
    public void abrir() {
    System.out.println("El candado se abre");
    }

    @Override
    public void cerrar() {
        System.out.println("EL candado se cierra");

    }
}
