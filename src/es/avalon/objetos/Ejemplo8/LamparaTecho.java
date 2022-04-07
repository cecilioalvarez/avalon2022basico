package es.avalon.objetos.Ejemplo8;

public class LamparaTecho {
    private int[] bombillas;

    public LamparaTecho(int numeroBombillas, int potenciabombilla) {
        bombillas=new int[numeroBombillas];
        for(int i=0;i<bombillas.length;i++){
            bombillas[i]=potenciabombilla;
        }


    }
    public void setBombilla(int posicion,int potencia){
        this.bombillas[posicion-1]=potencia;
    }

    public int[] getBombillas() {
        return bombillas;
    }

    public void setBombillas(int[] bombillas) {
        this.bombillas = bombillas;
    }

    public int potenciaTotal(){
        int total=0;
        for (int i=0;i< bombillas.length;i++){
            total+=bombillas[i];
        }
        return total;
    }

}

