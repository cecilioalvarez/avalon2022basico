package es.avalon.objetos.ejemplo08;

public class LamparaTecho {

    private int [] bombillas= new int[4];

    public int[] getBombillas() {
        return bombillas;
    }

    public void setBombillas(int[] bombillas) {
        this.bombillas = bombillas;
    }
    public void setBombillas(int posicion, int potencia){
        this.bombillas[posicion]=potencia;
    }

    public LamparaTecho(int numeroBombillas, int potenciaBombillas) {
        bombillas = new int[numeroBombillas];
        for (int i = 0;i < bombillas.length; i++){
            bombillas[i]= potenciaBombillas;
        }
    }

    public int potenciaTotal(){
        int total=0;
        for (int i = 0; i < bombillas.length; i++){
            total += bombillas[i];
        }
        return total;
    }
}

