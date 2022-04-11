package es.avalon.objetos.Ejemplo14;

import java.util.ArrayList;

public class NAS {
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
