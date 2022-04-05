package es.avalon;

public class EjemploNotaMedia {
    public static void main(String[] args) {
        int[] notas = new int[] {7,3,5,3,6,8,4,3,5,7,9,7,4,6,5,8,3};
        int suma=0;
        double media=0;


        for (int i=0; i< notas.length; i++){
            suma=suma+notas[i];
            media=suma/notas.length;


        }
        System.out.println(media);
    }
}
