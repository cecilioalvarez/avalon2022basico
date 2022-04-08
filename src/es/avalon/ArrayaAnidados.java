package es.avalon;

public class ArrayaAnidados {

    public static void main(String[] args){

        int[] lista1 = new int[] {1,2,3};
        int[] lista2 = new int[] {4,5,6};

        int[][] listafinal  = new int[][]{lista1,lista2};
        System.out.println(listafinal[0][1]);

        for (int i = 0;i<listafinal.length;i++){

            for (int j = 0;j<listafinal[i].length;j++ ){
                System.out.println("la coordenada [" + i+ "] ["+j+ "] tiene la poscición: " + listafinal[i][j]);
            }

        }
    }
}
