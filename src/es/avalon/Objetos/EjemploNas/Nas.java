package es.avalon.Objetos.EjemploNas;

import java.util.ArrayList;

public class Nas {

    private int idNas;
    private int tamano;
    private ArrayList<Disco> discos= new ArrayList<Disco>();

    public int getIdNas() {
        return idNas;
    }

    public void setIdNas(int idNas) {
        this.idNas = idNas;
    }

    public ArrayList<Disco> getDisco() {
        return discos;
    }

    public void setDisco(ArrayList<Disco> discos) {
        this.discos = discos;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }


    public void addDisco(Disco disco){
        discos.add(disco);
    }
}
