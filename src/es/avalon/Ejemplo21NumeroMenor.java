package es.avalon;

public class Ejemplo21NumeroMenor {

    public static void main(String[] args) {

        int[] numeros= new int[] {2,5,7,9,8,1,2};
        int[] numeros2= new int[] {7,5,7,9,10,1,2};

        int menor=numeros[0];

        for (int i=0;i<numeros.length;i++) {

            if (menor>numeros[i]) {
                menor=numeros[i];
            }
        }

        for (int i=0;i<numeros2.length;i++) {

            if (menor>numeros2[i]) {
                menor=numeros2[i];
            }
        }
        System.out.println(menor);

    }
}
