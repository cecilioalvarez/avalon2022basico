package es.avalon.objetos.Ejemplo14;

import java.util.ArrayList;

public class Nas {

    private ArrayList<DiscoDuro>discoDuros=new ArrayList<DiscoDuro>();


    public Nas(ArrayList<DiscoDuro> discoDuros, int posicion) {
        this.discoDuros = discoDuros;

    }

    public ArrayList<DiscoDuro> getDiscoDuros() {
        return discoDuros;
    }

    public void setDiscoDuros(ArrayList<DiscoDuro> discoDuros) {
        this.discoDuros = discoDuros;
    }

    public Nas() {
    }

    public void addDisco(DiscoDuro discoDuro){
        discoDuros.add(discoDuro);
    }
    public double tamañoNas(){
        int total=0;
        for (int i=0;i< discoDuros.size();i++){
            total+=discoDuros.get(i).getCapacidad();
        }
        return total;
    }



}
