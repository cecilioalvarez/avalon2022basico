package es.avalon.basico;

public class EjemploMedia {
    public static void main(String[] args) {
        int[] lista = new int[]{7, 10, 2, 5, 3, 0};
        double suma = 0;
        double media=0;

        for (int i = 0; i < lista.length; i++) {

            suma = suma + lista[i];
            //System.out.println(suma);
            media=suma/6;
            System.out.println(media);

        }

    }

}