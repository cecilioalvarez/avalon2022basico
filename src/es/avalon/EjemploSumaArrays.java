package es.avalon;

public class EjemploSumaArrays {
    public static void main(String[] args){
        int [] lista = {20,30,50};

        int suma = 0;

        for (int i =0; i<lista.length;i++){
            suma = suma+lista[i];
        }
        System.out.println(suma);
    }
}
