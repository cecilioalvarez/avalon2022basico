package es.avalon.basico;

public class Ejemplo027ImprimirLista {
    public static void main(String[] args) {

        int[] numeros = new int[]{2, 5, 7, 9, 8, 1, 2};
        int[] numeros2 = new int[]{3, 8, 0, 1, 1, 1, 0};
        //Bloque 1: Impresion de nuestro arreglo.
        System.out.println("Indice\tValor");
        for(int contador=0; contador<numeros.length; contador++)
            System.out.println(contador+"\t"+numeros[contador]);

        //Bloque 2: Impresión invertida del arreglo.
        System.out.println();
        System.out.println("Indice\tValor");
        for(int contador=0; contador<numeros2.length;  contador++)
            System.out.println(contador+"\t"+numeros2[contador]);
    }
}
