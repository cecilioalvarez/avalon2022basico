package es.avalon.Basico;

public class Ejemplo012Arraysuma {

    public static void main(String[] args) {

        int [] lista= new int [3];
        lista[0]= 20;
        lista[1]= 30;
        lista[2]= 50;

        int suma=0;
        for (int i=0;i<lista.length;i++) {

            suma=suma+lista[i];
        }
        System.out.println(suma);
    }

}


