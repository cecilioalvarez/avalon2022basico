package es.avalon.basico;

public class Ejemplo021SumaElementosArray {
    public static void main(String[] args) {
        int[] numeros = new int[]{78, 57, 8, 98, 100, 8, 112};
        int[] numeros2 = new int[]{22, 4, 74, 9, 10, 88, 277};
        int[] sumaElementos=new int [7];
        sumadearrays(numeros, numeros2, sumaElementos);
    }

    private static void sumadearrays(int[] numeros, int[] numeros2, int[] sumaElementos) {
        for (int i=0;i<7;i++){
            sumaElementos[i]= numeros[i]+ numeros2[i];
        }
        for (int i = 0; i< sumaElementos.length; i++){
            System.out.println(sumaElementos[i]);
        }
    }
}
