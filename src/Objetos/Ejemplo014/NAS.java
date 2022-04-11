package Objetos.Ejemplo014;

import java.util.ArrayList;

public class NAS {
    private ArrayList <Disco> discos = new ArrayList<Disco>();



    public NAS() {
    }

    public ArrayList<Disco> getDiscos() {
        return discos;
    }
    public void add(Disco disco){
        discos.add(disco);

    }
    public void setDiscos(ArrayList<Disco> discos) {
        this.discos = discos;
    }
}
