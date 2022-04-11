package es.avalon.basico;

public class Ejemplo25ArrayAnidados {
    public static void main(String[] args){

        int[] lista1=new int[]{1,2,3};
        int[] lista2=new int[]{4,5,6};
        int suma=0;
        int coord=0;

        int[][]listaArrays=new int[][]{lista1,lista2};

        System.out.println(listaArrays[0][0]);
        System.out.println("*****************");



        for (int i=0;i<listaArrays.length;i++){
            for (int j=0;j<listaArrays[i].length;j++){

                System.out.println(listaArrays[i][j]);

                suma+=listaArrays[i][j];





            }
            System.out.println(suma);

        }




    }
}
