package es.avalon;

public class Ejemplo014Media {

    public static void main(String[] args) {

        int [] notas = new int[] { 7, 10, 2, 5, 3, 0 };
        float sumaNotas = 0;

        for(int i = 0; i<notas.length; i++){
            sumaNotas = notas[i] + sumaNotas;
        }

        float notaMedia = sumaNotas / notas.length;
        System.out.println(notaMedia);

    }
}
