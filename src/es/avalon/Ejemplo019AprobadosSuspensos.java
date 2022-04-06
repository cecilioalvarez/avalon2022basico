package es.avalon;

public class Ejemplo019AprobadosSuspensos {
    public static void main(String[] args) {
        int[] numeros= new int[] {2,5,7,9,10,1,2};
        System.out.println(aprobados(numeros));
        System.out.println(suspensos(numeros));
    }

    static int aprobados(int[] numeros) {
        int totalAprobados=0;
        for (int i=0;i<numeros.length;i++) {

            if( numeros[i]>=5) {
                totalAprobados++;
            }
        }
        return totalAprobados;

    }

    static int suspensos(int[] numeros) {
        int totalSuspensos=0;
        for (int i=0;i<numeros.length;i++) {

            if( numeros[i]<5) {
                totalSuspensos++;
            }
        }
        return totalSuspensos;

    }
}
