package es.avalon.basico;

public class Ejemplo021SumaElementosArray {

    public static void main(String[] args) {

        int[] numeros = new int[] {2, 5, 7, 9, 8, 1, 2};
        int[] numeros2 = new int[] {7, 5, 7, 9, 10, 1, 2};
        int[] sumaElementos = sumaArrays(numeros, numeros2);


        for(int i=0; i<sumaElementos.length; i++){
            System.out.println(sumaElementos[i]);
        }

    }

    static int[] sumaArrays(int[] array, int[] array2){
        int[] arraySumado = new int[7];
        for (int i=0; i<array.length; i++){
            arraySumado[i] = array[i] + array2[i];
        }
        return arraySumado;
    }
}
