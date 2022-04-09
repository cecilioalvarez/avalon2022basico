package es.avalon.objetos.EjemploNas;

public class Disco {
    private int idDisco;
    private int capacidad;


    public int getIdDisco() {
        return idDisco;
    }

    public void setIdDisco(int idDisco) {
        this.idDisco = idDisco;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Disco(int idDisco, int capacidad){
        this.idDisco=idDisco;
        this.capacidad=capacidad;
    }

}
