package es.avalon;

public class EjemploArrayAprobado {
    public static void main(String[] args){
        int [] lista = {7,10,2,1,3,2,8};
        int contador = 0;
        for (int i =0; i< lista.length;i++){
            if (lista[i]>5){
                contador++;
            }
        }
        System.out.println("Aprobaron: " + contador + " notas");
    }
}
