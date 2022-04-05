package es.avalon;

import javax.sound.midi.Soundbank;

public class Ejemplo014Media {
    public static void main(String[] args) {
        int[] lista = new int[]{7, 10, 2, 5, 3, 0};
        double suma = 0;
        for (int i = 0; i < lista.length; i++) {
            suma = suma + lista[i];

        }
        System.out.println("La nota media es: " + suma / lista.length);

    }
}
