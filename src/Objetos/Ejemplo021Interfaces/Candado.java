package Objetos.Ejemplo021Interfaces;

public class Candado implements  Accesible{


    @Override
    public void abrir() {
        System.out.println("el candado se abre");
    }

    @Override
    public void cerrar() {
        System.out.println("el candado se cierra");
    }
}
