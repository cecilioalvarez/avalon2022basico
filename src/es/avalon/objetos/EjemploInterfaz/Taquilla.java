package es.avalon.objetos.EjemploInterfaz;

public class Taquilla implements Interfaz{

    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Taquilla(int numero) {
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
