package es.avalon;

public class sumaElementosArraysMetodo {

    public static void main(String[] args) {

        int[] numero1 = new int[]{1, 2, 4, 5, 6, 4, 6, 8, 6, 8, 9, 6, 43,4};
        int[] numero2 = new int[]{7, 8, 6, 7, 0, 5, 4, 3, 57, 8, 4, 3, 3, 67};
        int[] sumaElementos = new int[14];

        sumar(numero1, numero2, sumaElementos);

        recorrer(numero1, sumaElementos);

    }

    private static void recorrer(int[] numero1, int[] sumaElementos) {
        for (int i = 0; i< numero1.length; i++) {

            System.out.println(sumaElementos[i]);
        }
    }

    private static void sumar(int[] numero1, int[] numero2, int[] sumaElementos) {
        for (int i = 0; i< numero1.length; i++) {

            sumaElementos[i]= numero1[i]+ numero2[i];
        }
    }
}
