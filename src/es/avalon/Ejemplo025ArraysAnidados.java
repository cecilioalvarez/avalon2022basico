package es.avalon;

public class Ejemplo025ArraysAnidados {

    public static void main(String[] args) {

        int[] lista1 = new int[]{1,2,3};
        int[] lista2 = new int[]{4,5,6};

        //Array Anidado
        int[][] listaArrays = new int[][] {lista1, lista2};

        //Acceso a este
        System.out.println(listaArrays[0][0]); //Accedemos al primer array guardado [0] y la primera posicion de este [0]

        System.out.println("Acceso a array anidado");

        for(int i=0; i<listaArrays.length; i++){
            for (int j=0; j<listaArrays[i].length; j++){
                System.out.println(listaArrays[i][j]);
            }
        }

        //Sumar todos los items del array
        int sumaNumero = 0;
        for(int i=0; i<listaArrays.length; i++){
            for (int j=0; j<listaArrays[i].length; j++){
                sumaNumero+= listaArrays[i][j];
            }
        }
        System.out.println("Sumar todos los items del array");
        System.out.println(sumaNumero);

        System.out.println("Sacar por consola posicion item y dato de cada posicion");

        //Sacar por consola posicion item y dato de cada posicion
        for(int i=0; i<listaArrays.length; i++){
            for (int j=0; j<listaArrays[i].length; j++){
                System.out.println("[" + i + "," + j + "]" + "=" + listaArrays[i][j]);
            }
        }

    }
}
