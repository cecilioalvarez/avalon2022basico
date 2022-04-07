package es.avalon.basico;

public class Ejemplo011Arrays {

    public static void main(String[] args) {

        //Declaracion de Array o lista
        int[] lista = new int[3];

        lista[0] = 20;
        lista[1] = 30;
        lista[2] = 50;

        System.out.println(lista[0]);
        System.out.println(lista[1]);
        System.out.println(lista[2]);


        for (int i=0; i<lista.length; i++) {
            System.out.println(lista[i]);
        }

    }
}
