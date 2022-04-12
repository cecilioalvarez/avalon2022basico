package es.avalon.objeto.ejemplo21;

public class Candado implements  Accesible {

    @Override
    public void abrir() {

        System.out.println("el candado se abre");

    }

    @Override
    public void cerrar() {

        System.out.println("el candado se cierra");


    }
}
