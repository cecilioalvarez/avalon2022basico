package es.avalon;

public class Nota {

    public static void main(String[] args) {

        int[] notasF = new int[]{1, 2};

        System.out.println(notas(notasF));

    }

    static Integer notas(int[] notas) {
        int NotaMasAlta = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > NotaMasAlta) {

                NotaMasAlta = notas[i];
            }


        }
        return NotaMasAlta;
    }
}
