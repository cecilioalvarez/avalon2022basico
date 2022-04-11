package es.avalon.objetos.ejercicio05NAS;

import java.util.ArrayList;

public class NAS {

    private ArrayList<DiscoDuro> discos = new ArrayList<>();


    public NAS() {}

    public ArrayList<DiscoDuro> getDiscos() {
        return discos;
    }

    public void setDiscos(ArrayList<DiscoDuro> discos) {
        this.discos = discos;
    }

    public void addDisco(DiscoDuro disco){
        discos.add(disco);
    }


}
