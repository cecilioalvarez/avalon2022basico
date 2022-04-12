package es.avalon.objetos.Ejemplo21;

public class Candado implements Accesible{
    int numero;

    public Candado(int numero) {
        this.numero = numero;
    }

    @Override
    public void abrir() {
        System.out.println("El candado se abre");

    }

    @Override
    public void cerrar() {
        System.out.println("El candado se cierra");

    }
}
