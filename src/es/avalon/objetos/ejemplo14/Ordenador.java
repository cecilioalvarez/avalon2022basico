package es.avalon.objetos.ejemplo14;
import java.util.ArrayList;

public class Ordenador {

        private DiscoDuro disco;
        private Nas Nas;

    public DiscoDuro getDisco() {

        return disco;
    }

    public void setDisco(DiscoDuro disco) {

        this.disco = disco;
    }

    public Nas getNas() {

        return Nas;
    }

    public void setNas(Nas nas) {

        Nas = nas;
    }

    public Ordenador(DiscoDuro disco) {
        this.disco = disco;
    }
    public void conectarNas(Nas nas) {

        this.Nas = nas;
    }

    public void addDiscoAlNas(DiscoDuro disco) {

        this.Nas.addDisco(disco);
    }

    public double capacidadDisco() {

        double total = 0;
        total += disco.getCapacidad();
        ArrayList<DiscoDuro> discos = Nas.getDiscos();
        for (int i = 0; i < discos.size(); i++) {

            total += discos.get(i).getCapacidad();
        }
        return total;
    }
}
