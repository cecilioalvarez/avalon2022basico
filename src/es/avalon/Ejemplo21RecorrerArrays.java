package es.avalon;

public class Ejemplo21RecorrerArrays {
    public static void main(String[]args){
        int[] numeros = {2,5,7,9,8,11,22};


        for (int i = numeros.length-1;i>0;i-- ){
            System.out.println(numeros[i]);
        }
    }

}
