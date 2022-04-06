package es.avalon;

public class Ejemplo019AprobadoSuspenso {
    public static void main(String[] args) {

        int[] numeros = new int[] {2,3,4,5,2,4,6,7,8,6,6,8,9,7,7,10};

        System.out.println(aprobados(numeros));
        System.out.println(suspensos(numeros));
        System.out.println(notaAlta(numeros));


    }

    public static int aprobados(int[] numeros) {
        int numAprobados=0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]>=5){
                numAprobados++;
            }

        }
        return numAprobados;
    }

    public static int suspensos(int[] numeros) {
        int totalSuspensos=0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]<=5){
                totalSuspensos++;
            }

        }
        return totalSuspensos;
    }

    public static int notaAlta(int[] numeros) {
        int notaza=0;
        for (int i = 0; i < numeros.length; i++) {
            if (notaza<numeros[i]){
                notaza=numeros[i];

            }

        }
        return notaza;
    }
}
