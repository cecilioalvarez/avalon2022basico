package es.avalon.objetos.Ejemplo14;

import java.util.ArrayList;

public class Ordenador {

    private Nas[] listaNas=new Nas[0];
    private Nas nas;

    public Ordenador() {
    }

    public Ordenador(Nas[] listaNas) {
        this.listaNas = listaNas;
    }

    public void addDisco(DiscoDuro discoDuro) {
        this.nas.addDisco(discoDuro);
    }

    public double tamañoNas() {
        return nas.tamañoNas();
    }

    public Ordenador(Nas nas) {
        this.nas = nas;
    }

    public Nas getNas() {
        return nas;
    }

    public void setNas(Nas nas) {
        this.nas = nas;
    }
    public double capacidadDisco (){
        double total=0;
        ArrayList<DiscoDuro>discoDuros=nas.getDiscoDuros();
        for (int i=0;i<discoDuros.size();i++){
            total+=discoDuros.get(i).getCapacidad();
        }
        return total;
    }



}
