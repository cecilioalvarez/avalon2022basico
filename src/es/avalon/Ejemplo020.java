package es.avalon;

public class Ejemplo020 {
    public static void main(String[] args) {
        int[] numeros = new int[]{78, 57, 7, 98, 100, 8, 112};
        int[] numeros2 = new int[]{22, 5, 74, 9, 10, 88, 277};
        if (maspequeño(numeros) <= maspequeño(numeros2)) {
            System.out.println(maspequeño(numeros));
        } else {
            System.out.println(maspequeño(numeros2));
        }


    }

    static int maspequeño(int[] a) {
        int num1 = a[1];
        for (int i = 0; i < a.length; i++) {

            if (num1 > a[i]) {
                num1 = a[i];
            }
        }
        return num1;
    }
}
