package es.avalon.objeto.ejemplo14;

import java.util.ArrayList;
public class Nas {
    private ArrayList<DiscoDuro> discos= new ArrayList<>();

    public ArrayList<DiscoDuro> getDiscos() {
        return discos;
    }

    public void setDiscos(ArrayList<DiscoDuro> discos) {
        this.discos = discos;
    }

    public Nas() {
    }

    public void addDisco(DiscoDuro disco) {

        discos.add(disco);
    }


}
