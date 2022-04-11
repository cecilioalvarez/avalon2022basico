package es.avalon.objetos.EjemploObjetos012;

import java.util.ArrayList;

class NAS {
    private ArrayList<DiscoDuro> discos= new ArrayList<>();

    public ArrayList<DiscoDuro> getDiscos() {
        return discos;
    }

    public void setDiscos(ArrayList<DiscoDuro> discos) {
        this.discos = discos;
    }

    public NAS() {
    }

    public void addDisco(DiscoDuro disco) {

        discos.add(disco);
    }
}
