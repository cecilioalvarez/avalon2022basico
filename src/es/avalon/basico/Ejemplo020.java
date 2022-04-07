package es.avalon.basico;

public class Ejemplo020 {
    public static void main(String[] args) {
        int[] numeros = new int[]{78, 57, 8, 98, 100, 8, 112};
        int[] numeros2 = new int[]{22, 4, 74, 9, 10, 88, 277};

        System.out.println(maspequeño(numeros, numeros2));

    }

    static int maspequeño(int[] a, int[] b) {
        int num1 = a[1];
        for (int i = 0; i < a.length; i++) {

            if (num1 > a[i]) {
                num1 = a[i];
            }
        }
        int num2 = b[1];
        for (int i = 0; i < b.length; i++) {

            if (num2 > a[i]) {
                num2 = a[i];
            }
        }
        if (num1 >= num2) {
            num1 = num2;
        }
        return num1;
    }



}
