package es.avalon.objetos.ejemplo08;

public class LamparaTecho {
   private int[] bombillas;

    public int[] getBombillas() {
        return bombillas;
    }

    public void setBombillas(int[] bombillas) {
        this.bombillas = bombillas;
    }
    public void setBombilla(int posicion, int potencia){
        this.bombillas[posicion]=potencia;
    }

}
