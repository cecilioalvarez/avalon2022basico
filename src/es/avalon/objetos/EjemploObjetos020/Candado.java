package es.avalon.objetos.EjemploObjetos020;

public class Candado implements Accesible{

    @Override
    public void abrir() {
        System.out.println("el candado se abre");
    }

    @Override
    public void cerrar() {
        System.out.println("el candado se cierra");
    }

}
