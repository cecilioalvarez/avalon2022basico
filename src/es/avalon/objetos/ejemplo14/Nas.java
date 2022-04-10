package es.avalon.objetos.ejemplo14;

import java.util.ArrayList;

public class Nas {
    private String IdNas;

    private ArrayList<DiscoDuro> HuecosDiscoDuro = new ArrayList<DiscoDuro>();

    public ArrayList<DiscoDuro> getHuecosNas() {
        return HuecosDiscoDuro;
    }
    public void recorrerNas(){
        for (int i = 0; i < HuecosDiscoDuro.size(); i++) {
            System.out.print(HuecosDiscoDuro.get(i));
        }
    }

    public void addDisco( DiscoDuro HDD) {

        HuecosDiscoDuro.add(HDD);
    }

    public double GetCapacidadTotal() {
        double total = 0;

        for (int i = 0; i < HuecosDiscoDuro.size(); i++) {
            total= total+HuecosDiscoDuro.get(i).getCapacidad();
        }
        System.out.println("La capacidad total de los discos es: " );
        return total;

    }

    public String getIdNas() {
        return IdNas;
    }

    public void setIdNas(String idNas) {
        IdNas = idNas;
    }
}
