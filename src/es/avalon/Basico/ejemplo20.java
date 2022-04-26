package es.avalon.Basico;

public class ejemplo20 {
    public static void main(String[] args) {

        int[] numero1 = new int[]{1, 2, 4, 5, 6, 4, 6, 8, 6, 8, 9, 6, 43,4};
        int[] numero2 = new int[]{7, 8, 6, 7, 0, 5, 4, 3, 57, 8, 4, 3, 3, 67};

        int npequeno = numero(numero1,numero2);
        System.out.println(npequeno);

    }

    public static int numero(int[] numero1, int[] numero2) {

        int npequeno= numero1[0];

        for (int i = 0; i < numero1.length; i++) {
            if (npequeno > numero1[i]) {
                npequeno = numero1[i];

            }
        }
        for (int i = 0; i < numero2.length; i++) {
            if (npequeno > numero2[i]) {
                npequeno = numero2[i];

            }
        }

        return npequeno;

    }
}

