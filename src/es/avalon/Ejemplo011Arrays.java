package es.avalon;

import java.sql.SQLOutput;

public class Ejemplo011Arrays {
    public static void main(String[] args) {
        System.out.println("Buenas tardes!!");
        int []lista= new int[6];
        lista[0]= 0;
        lista[1]= 10;
        lista[2]= 20;
        lista[3]= 30;
        lista[4]= 40;
        lista[5]= 50;

        for (int i=0; i<lista.length; i++){
            System.out.println(lista[i]);
        }
    }
}
