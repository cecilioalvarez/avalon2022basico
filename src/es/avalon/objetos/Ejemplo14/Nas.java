package es.avalon.objetos.Ejemplo14;

import java.util.ArrayList;

public class Nas {
    // Como variable tiene el ArrayList de discosduros
    private ArrayList<DiscoDuro>discoDuros=new ArrayList<>();

    //Constructor
    public Nas(ArrayList<DiscoDuro> discoDuros, int posicion) {
        this.discoDuros = discoDuros;

    }

    public Nas() {
    }

    public ArrayList<DiscoDuro> getDiscoDuros() {
        return discoDuros;
    }
    public void setDiscoDuros(ArrayList<DiscoDuro> discoDuros) {
        this.discoDuros = discoDuros;
    }
    //Contructor vacio
    //Metodo para añadir discos duros al NAS
    public void addDisco(DiscoDuro discoDuro){
        discoDuros.add(discoDuro);
    }
    //Metodo para calcular la suma del tamaño de los discos duros
    public double tamañoNas(){
        int total=0;
        for (int i=0;i< discoDuros.size();i++){
            total+=discoDuros.get(i).getCapacidad();
        }
        return total;
    }



}
