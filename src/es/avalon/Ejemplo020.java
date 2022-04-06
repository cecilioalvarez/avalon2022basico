package es.avalon;

public class Ejemplo020 {
    public static void main(String []args){
        int[] numeros = {2,5,7,9,8,11,22};
        int[] numeros2 = {7,5,7,9,10,12,2};

        System.out.println(numMenor(numeros,numeros2));
    }

    static int numMenor(int[] num1,int[] num2){
        int numeroMenor = num1[0];
        int numeroMenor2 = num2[0];

        for (int i =0; i < num1.length;i++){
            if (num1[i] < numeroMenor) {
                numeroMenor = num1[i];
            }
        }
        for (int i =0; i < num2.length;i++){
            if (num2[i] < numeroMenor2) {
                numeroMenor = num2[i];
            }
        }
        if (numeroMenor<numeroMenor2){
            return numeroMenor;
        }else{
            return numeroMenor2;
        }

    }

}
