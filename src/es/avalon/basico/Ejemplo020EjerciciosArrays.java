package es.avalon.basico;

public class Ejemplo020EjerciciosArrays {
    public static void main(String[] args) {
        int numeros1 [] = new int[]{8,5,7,9,10,9,7};
        int numeros2 [] = new int[]{2,5,7,9,10,1,2};
        if (numeroMasBajo(numeros1)>numeroMasBajo(numeros2)){
            System.out.println(numeroMasBajo(numeros2));
        }else {
            System.out.println(numeroMasBajo(numeros1));
        }

    }
    static int numeroMasBajo (int[] lista){
        int numerobajo=5;
        for (int i=0;i<lista.length;i++) {
            if (numerobajo>lista[i]){
                numerobajo=lista[i];
            }
        }
        return numerobajo;
    }
}
