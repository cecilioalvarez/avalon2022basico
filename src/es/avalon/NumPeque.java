package es.avalon;

public class NumPeque {

    public static void main (String[] args){

        int[] lista1 = new int[] {1,2,3,4,5};
        int[] lista2 = new int[] {6,7,8,9,0};
        System.out.println(numMenor(lista1,lista2));
    }

    static Integer numMenor (int [] lista1,int[] lista2){
        int Num1 = lista1[0];

        for (int i= 0; i<lista1.length; i++){

            if (lista1[i] <Num1 ){
                Num1 = lista1[i];
            }
        }

        for ( int i =0 ; i<lista2.length;i++){

            if (lista2[i]< Num1){
                Num1 = lista2[i];
            }
        }
        return Num1;
    }
}
