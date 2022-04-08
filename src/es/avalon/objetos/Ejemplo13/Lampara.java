package es.avalon.objetos.Ejemplo13;

import java.util.ArrayList;

public class Lampara {

    private ArrayList<Bombilla> bombillas = new ArrayList<Bombilla>();
    private Bombilla bombilla;

    public Lampara() {
    }

    public Lampara(Bombilla bombilla) {
        this.bombilla = bombilla;
    }

    public Bombilla getBombilla() {
        return bombilla;
    }

    public void setBombilla(Bombilla bombilla) {
        this.bombilla = bombilla;
    }

    public ArrayList<Bombilla> getBombillas() {
        return bombillas;
    }

    public void setBombillas(ArrayList<Bombilla> bombillas) {
        this.bombillas = bombillas;
    }

    public void bombillasencendidas() {
        int on = 0;
        int off = 0;
        for (int i = 0; i < bombillas.size(); i++) {


            if (getBombillas().get(i).isEncendida() == true) {
                on++;

            } else {
                off++;
            }
        }
        System.out.println("la lampara tiene " + on + " bombillas encendidas");
        System.out.println("la lampara tiene " + off + " bombillas apagadas");
    }

    public void addBombilla(Bombilla bombilla) {
        bombillas.add(bombilla);

    }

}
