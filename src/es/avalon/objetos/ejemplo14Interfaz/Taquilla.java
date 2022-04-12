package es.avalon.objetos.ejemplo14Interfaz;


//Implementamos la interfaz mediante "implements"
public class Taquilla implements Accesible{

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


    //Metodos implementados de la interfaz
    @Override
    public void abrir() {
        System.out.println("La taquilla se abre");
    }

    @Override
    public void cerrar() {
        System.out.println("La taquilla se cierra");
    }
}
