package es.avalon;

public class EjemploSumaElementosArray {
    public static void main(String[] args) {


        int[] numeros= new int[] {2,5,7,9,8,1,2};
        int[] numeros2= new int[] {7,5,7,9,10,1,2};
        int [] sumaElementos= new int[7];
        //el elemento ya esta reservado

        sumar(numeros, numeros2, sumaElementos);

        recorrer(numeros, sumaElementos);


    }

    private static void recorrer(int[] numeros, int[] sumaElementos) {
        for (int i = 0; i< numeros.length; i++) {

            System.out.println(sumaElementos[i]);
        }
    }

    private static void sumar(int[] numeros, int[] numeros2, int[] sumaElementos) {
        for (int i = 0; i< numeros.length; i++) {

            sumaElementos[i]= numeros[i]+ numeros2[i];
        }
    }
}
