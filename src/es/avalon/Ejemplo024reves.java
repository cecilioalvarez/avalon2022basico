package es.avalon;

public class Ejemplo024reves {
    public static void main(String[] args) {

        int[] numeros = new int[]{2, 5, 7, 9, 8, 1, 2};
        //Bloque 1: Impresion de nuestro arreglo.
        System.out.println("Indice\tValor");
        for(int contador=0; contador<numeros.length; contador++)
            System.out.println(contador+"\t"+numeros[contador]);

        //Bloque 2: Impresión invertida del arreglo.
        System.out.println();
        System.out.println("Indice\tValor");
        for(int contador=numeros.length-1; contador>=0; contador--)
            System.out.println(contador+"\t"+numeros[contador]);
    }
    }

