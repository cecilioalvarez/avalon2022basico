package Objetos.Ejemplo014;

import java.util.ArrayList;

public class Ordenador{
    private Disco disco;
    private NAS nas;

    public Ordenador() {
    }

    public Ordenador(Disco disco) {
        this.disco = disco;
    }

    public Ordenador(Disco disco, NAS nas) {
        this.disco = disco;
        this.nas = nas;
    }
    public void conectarNas(NAS nas){
        this.nas=nas;
    }
    public  void add_disco_nas(Disco d){
        this.nas.add(d);
    }
    public double capacidadDisco(){
        double total=0;
        total=total+disco.getCapacidad();
        ArrayList<Disco> d = nas.getDiscos();
        for (int i = 0; i < d.size(); i++) {
             total= total+d.get(i).getCapacidad();
        }

        return  total;

    }
    public Disco getDisco() {
        return disco;
    }

    public void setDisco(Disco disco) {
        this.disco = disco;
    }

    public NAS getNas() {
        return nas;
    }

    public void setNas(NAS nas) {
        this.nas = nas;
    }
}
