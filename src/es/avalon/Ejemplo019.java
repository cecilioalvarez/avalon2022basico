package es.avalon;

public class Ejemplo019 {
    public static void main(String[]arg){
        int [] numeros = {2,5,7,9,10,1,2};

        System.out.println(notaMayor(numeros));
    }
    static double aprobado(int[] numeros){
        int total=0;
        for (int i = 0; i < numeros.length;i++){
            if (numeros[i]>=5){
                total++;
            }
        }
        return total;
    }

    static double reprobado(int[] numeros){
        int total=0;
        for (int i = 0; i < numeros.length ;i++){
            if (numeros[i]<=5){
                total++;
            }
        }
        return total;
    }

    //Funcion nota mas alta
    static int notaMayor(int[]numeros){
        int notaAlta=0;
        for(int i =0; i< numeros.length;i++ ) {
            if (notaAlta < numeros[i]) {
                notaAlta = numeros[i];
            }
        }
        return notaAlta;

    }
}
