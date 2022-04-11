package es.avalon.Basico;

public class Ejemplo026ArraysAnidadosPosicion {
    public static void main(String[] args) {

        int[] lista1= new int[]{1,2,3};
        int[] lista2= new int[]{4,5,6};
        int total=0;

        int [][] listaArrays= new int[][] {lista1,lista2};

        System.out.println(listaArrays[0][0]);

        System.out.println("*******************");

        for (int i=0;i<listaArrays.length;i++) {
            // me recorre la 0 y la 1 en dos vueltas
            for (int j=0;j<listaArrays[i].length;j++) {

                System.out.println("[" +i +","+j+"]=" +listaArrays[i][j]);
                total+= listaArrays[i][j];
            }
        }
        // [0,0]=1
        // [0,1]=2
        //  [ [1,2,3] ,[4,5,6] ]
        // listaArrays[0][1]=[2]

        System.out.println(total);
    }

}

