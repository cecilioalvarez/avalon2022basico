package es.avalon.objetos.Lampara_2;

public class LamparaTecho {

    private int [] bombillas;




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
