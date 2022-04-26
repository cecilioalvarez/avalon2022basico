package es.avalon.Objetos.ejemplo08;

public class LamparaTecho {

    private int[] bombillas;

    public int[] getBombillas() {
        return bombillas;
    }

    public void setBombillas(int[] bombillas) {
        this.bombillas = bombillas;
    }
    public void setBombilla(int posicion, int potencia) {
        if (posicion>=0 && posicion< bombillas.length)
        this.bombillas[posicion]=potencia;
    }

    public LamparaTecho(int numeroBombillas, int potenciaBombilla) {
        bombillas = new int[numeroBombillas];
        for (int i = 0; i < bombillas.length; i++) {
            bombillas[i] = potenciaBombilla;
        }

    }
    public int potenciaTotal() {
        int total = 0;
        for (int i = 0; i < bombillas.length; i++) {
            total += bombillas[i];
        }
    return total;
    }
}
