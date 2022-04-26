package es.avalon.Objetos.Lampara_Arrays;

public class LamparaTecho {



    private int [] bombillas;

    public int[] getBombillas() {
        return bombillas;
    }

    public void setBombillas(int[] bombillas) {
        this.bombillas = bombillas;
    }



    public void setBombilla(int posicion, int potencia){
        if (posicion>=0 && posicion< bombillas.length)
        this.bombillas[posicion]=potencia;
    }


    public LamparaTecho(int numeroBombillas, int potenciaBombilla){
        bombillas= new int[numeroBombillas];
        for (int x=0; x<bombillas.length;x++){
            bombillas[x]=potenciaBombilla;
        }
    }

    int pTotal(){
        int total=0;
        for (int x=0;x< bombillas.length;x++){
            total+=bombillas[x];
        }
        return total;
    }
}
