package es.avalon.basico;

public class Ejemplo020EjercicioArrays {

    public static void main(String[] args) {

        int[] numeros = new int[] {2, 5, 7, 9, 8, 1, 2};
        int[] numeros2 = new int[] {7, 5, 7, 9, 10, 1, 2};

        System.out.println(devuelveMenorNumero(numeros, numeros2));

    }

    static int devuelveMenorNumero(int[] numeros, int[] numeros2){

        int menorNumero = numeros[0];

        for(int i = 0; i<numeros.length; i++){
            if(menorNumero > numeros[i]){
                menorNumero = numeros[i];
            }
        }

        for(int i = 0; i<numeros2.length; i++){
            if(menorNumero > numeros2[i]){
                menorNumero = numeros2[i];
            }
        }

        return menorNumero;
    }


}


