package es.avalon.objetos.ejemplo14;

import java.util.ArrayList;

public class Nas {
    private String IdNas;

    private final ArrayList<DiscoDuro> HuecosDiscoDuro = new ArrayList<>();


    public void recorrerNas(){
        for (DiscoDuro datoDisco : HuecosDiscoDuro) {
            System.out.println(datoDisco.getNombre() + ". Capacidad: " + datoDisco.getCapacidad() + "TB");
            //La capacidad de los discos en el Nas es:
            // Disco 1. Capacidad: 30GB

        }
    }

    public void addDisco( DiscoDuro HDD) {

        HuecosDiscoDuro.add(HDD);
    }

    public double GetCapacidadTotal() {
        double total = 0;

        for (DiscoDuro discoDuro : HuecosDiscoDuro) {
            total = total + discoDuro.getCapacidad();
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
