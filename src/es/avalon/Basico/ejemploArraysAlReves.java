package es.avalon.Basico;

public class ejemploArraysAlReves {
    public static void main(String[] args) {

        int[] numeros = new int[]{1, 2, 4, 5, 6, 4, 6, 8, 6, 8, 9, 6, 43, 4};

        for (int i=0; i<numeros.length-1; i++) {

            System.out.println(numeros[i]);
        }
    }
}
