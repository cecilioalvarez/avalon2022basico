package es.avalon.basico;

public class Ejemplo014Media {

    public static void main(String[] args) {

        int [] notas = new int[] { 7, 10, 2, 5, 3, 0 };
        double sumaNotas = 0;

        for(int i = 0; i<notas.length; i++){
            sumaNotas = notas[i] + sumaNotas;
        }

        System.out.println(sumaNotas / notas.length);

    }
}
