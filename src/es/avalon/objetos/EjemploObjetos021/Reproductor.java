package es.avalon.objetos.EjemploObjetos021;

public class Reproductor implements Reproducir{
    private int id;

    //Constructor
    public Reproductor(int id) {
        this.id = id;
    }

    //Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public void play() {
        System.out.println("Reproduciendo");
    }

    @Override
    public void stop() {
        System.out.println("Pausa");
    }

    @Override
    public void siguiente() {
        System.out.println("Siguiente");
    }

    @Override
    public void atras() {
        System.out.println("Atras");
    }
}
