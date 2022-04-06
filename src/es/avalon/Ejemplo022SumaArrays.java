package es.avalon;

public class Ejemplo022SumaArrays {
    public static void main(String[] args) {
        int [] lista = new int []{2,2,6,8,1,2,3,6};
        int [] lista2 = new int []{5,8,9,4,9,7,5,8};
        int [] sumaElementos = new int[8];

        for (int i = 0; i< lista.length;i++){

            sumaElementos[i] = lista[i]+lista2[i];
        }

        for (int i = 0; i< lista.length;i++){
        System.out.println(sumaElementos[i]);

        }
    }
}
