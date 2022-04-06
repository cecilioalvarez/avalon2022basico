package es.avalon;

public class Ejemplo025ArraysAnidados {
    public static void main(String[] args) {
        int[] lista1 = new int[]{1, 2, 3};
        int[] lista2 = new int[]{4, 5, 6};

        int[][] listaArrays = new int[][]{lista1, lista2};  //fila 0--> 1,2,3
        //fila 1--> 4,5,6
//        System.out.println("Coordenada 0,0 = "+listaArrays[0][0]);
//        System.out.println("Coordenada 0,1 = "+listaArrays[0][1]);
//        System.out.println("Coordenada 0,2 = "+listaArrays[0][2]);
//        System.out.println("Coordenada 1,0 = "+listaArrays[1][0]);
//        System.out.println("Coordenada 1,1 = "+listaArrays[1][1]);
//        System.out.println("Coordenada 1,2 = "+listaArrays[1][2]);

        System.out.println("...............");
        for (int i = 0; i < listaArrays.length; i++) {
            for (int j = 0; j < listaArrays[i].length; j++) {
                System.out.println(listaArrays[i][j]);
            }
        }

        System.out.println("...............");
        int suma = 0;
        for (int i = 0; i < listaArrays.length; i++) {
            for (int j = 0; j < listaArrays[i].length; j++) {
                suma = suma + listaArrays[i][j];

            }
        }
        System.out.println(suma);
        for (int i = 0; i < listaArrays.length; i++) {
            for (int j = 0; j < listaArrays[i].length; j++) {
                System.out.println("la coordenada [" + i + "],[" + j + "]=[" + listaArrays[i][j] + "]");

            }
        }


    }
}
