package es.avalon.objetos.EjemploObjetos020;

public class Taquilla implements Accesible{

    private int numero;

    //Constructor

    public Taquilla(int numero) {
        this.numero = numero;
    }


    //Getters and Setters

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public void abrir() {
        System.out.println("la taquilla se abre");
    }

    @Override
    public void cerrar() {
        System.out.println("la taquilla se cierra");
    }

}
