package es.avalon.Basico;

public class ejemploArraysAnidados {
    public static void main(String[] args) {

        int[] lista1 = new int[]{1,2,3,4,5};
        int[] lista2 = new int[]{6,7,8,9,10};

        int[][] listaArrays= new int[][]{lista1,lista2};

        System.out.println(listaArrays[0][0]);

        extraer(listaArrays);
    }

    private static void extraer(int[][] listaArrays) {
        int suma=0;
        for (int i = 0; i< listaArrays.length; i++){

            for(int x = 0; x< listaArrays[i].length; x++){
                System.out.println(listaArrays[i][x]);
                suma+=listaArrays[i][x];
            }
            System.out.println(suma);
        }
    }

}
