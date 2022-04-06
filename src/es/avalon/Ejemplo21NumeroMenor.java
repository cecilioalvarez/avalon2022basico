package es.avalon;

public class Ejemplo21NumeroMenor {

    public static void main(String[] args) {

        int[] numeros= new int[] {2,5,7,9,8,1,2};
        int[] numeros2= new int[] {7,5,7,9,10,1,2};

        int menor = getMenor(numeros, numeros2);
        System.out.println(menor);

    }

     static int getMenor(int[] numeros, int[] numeros2) {
        int menor1 = getMenor(numeros);
        int menor2 = getMenor(numeros2);

        return getMenor(new int[] {menor1, menor2});
     }

    static int getMenor(int[] numeros) {
        int menor = numeros[0];
        for (int i = 0; i< numeros.length; i++) {
            if (menor> numeros[i]) {
                menor= numeros[i];
            }
        }
        return menor;
    }
}
