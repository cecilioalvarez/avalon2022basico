package es.avalon.objetos.EjemploObjetos012;

import java.util.ArrayList;

public class Ordenador {
    private DiscoDuro disco;
    private NAS nas;

    public DiscoDuro getDisco() {
        return disco;
    }

    public void setDisco(DiscoDuro disco) {
        this.disco = disco;
    }

    public NAS getNas() {
        return nas;
    }

    public void setNas(NAS nas) {
        nas = nas;
    }

    public Ordenador(DiscoDuro disco) {
        this.disco = disco;

    }

    public void conectarNas(NAS nas) {

        this.nas = nas;
    }

    public void addDiscoAlNas(DiscoDuro disco) {

        this.nas.addDisco(disco);
    }

    public double capacidadDisco() {

        double total = 0;
        total += disco.getCapacidad();
        ArrayList<DiscoDuro> discos = nas.getDiscos();
        for (int i = 0; i < discos.size(); i++) {

            total += discos.get(i).getCapacidad();
        }
        return total;
    }
}
