package es.avalon.objetos.EjemploNas;

import es.avalon.objetos.GenerateRandom;

public class Disco {
    private int idDisco;
    private int capacidad;
    private boolean conectado;


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

    public void discoOn(){
        conectado= true;
        System.out.println("\n El Disco: " + getIdDisco() + " Está conectado");
    }

    public void discoOff(){
        conectado=false;
        System.out.println("\n El Disco: " + getIdDisco() + " No está conectado o no tiene capacidad");
    }

}
