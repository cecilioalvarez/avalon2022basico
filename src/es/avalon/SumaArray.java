package es.avalon;

public class SumaArray {
    public static void main(String[] args){

        int[]lista1=new int[]{2,5,7,9,8,1,2};
        int[]lista2=new int[]{7,5,7,9,10,1,2};
        sumaArray(lista1,lista2);
    }

    static int[] sumaArray(int[] lista1, int[] lista2){
        int[] array = new int[7];

        for (int i=0; i<lista1.length;i++){
            array[i] = lista1[i]+lista2[i];
            System.out.println(array[i]);
        }
        return array;
    }
}
