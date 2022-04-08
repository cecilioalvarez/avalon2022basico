package Objetos.Ejemplo008;

public class LamparaTecho {
    private int[] Bombillas;


    public LamparaTecho(int cantidad, int potencia) {
    Bombillas = new int[cantidad];
        for (int i = 0; i < Bombillas.length; i++) {
           Bombillas[i]=potencia;
        }
    }

    public void change(int pos, int value){
        if(pos>=0 && pos< Bombillas.length){
            Bombillas[pos]=value;
        }else{
            System.out.println("posición invalida");
        }

    }
    public int potenciaTotal(){
        int total=0;
        for (int i = 0; i < Bombillas.length; i++) {
            total=total+Bombillas[i];
        }

        return total;


    }
}
