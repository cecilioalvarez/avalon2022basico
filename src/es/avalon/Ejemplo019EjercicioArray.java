package es.avalon;

public class Ejemplo019EjercicioArray {

    public static void main(String[] args) {
        int numeros [] = new int[]{2,5,7,9,10,1,2};
                System.out.println(Aprobados(numeros));
                System.out.println(Suspendidos(numeros));

                System.out.println(NotaAlta(numeros));

    }

    static int Aprobados (int[] lista){
        int aprobados=0;
        for (int i=0;i<lista.length;i++) {

            if (lista[i]>5) {
                // System.out.println(lista[i]);
                aprobados++;
            }

        }
        return aprobados;
    }
    static int Suspendidos (int[] lista){
        int suspensos=0;
        for (int i=0;i<lista.length;i++) {

            if (lista[i]<=5) {
                // System.out.println(lista[i]);
                suspensos++;
            }
        }
        return suspensos;
    }

    //ejercicio para averiguar la nota mas alta
    static int NotaAlta (int[] lista){
        int notaMasAlta = 0;
        for (int i=0;i<lista.length;i++) {
            if (notaMasAlta<lista[i]){
                notaMasAlta=lista[i];
            }
        }
        return notaMasAlta;
    }

}

