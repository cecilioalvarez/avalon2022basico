package es.avalon;

public class Ejemplo025ArraysAnidados {
    public static void main(String[] args) {
        int[] lista1 = new int[]{1,2,3};
        int[] lista2 = new int[]{4,5,6};

        int[][] listaArrays= new int[][] {lista1,lista2};
        int suma=0;

        for (int i =0;i<listaArrays.length;i++){
            for(int j = 0;j< listaArrays[i].length;j++){
                suma= suma + listaArrays[i][j];
                System.out.print(listaArrays[i][j]);
            }
        }
        System.out.println();
        System.out.println(suma);

    }
}
