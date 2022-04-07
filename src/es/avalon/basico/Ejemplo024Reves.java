package es.avalon.basico;

public class Ejemplo024Reves {
    public static void main(String[] args) {
        int [] lista = new int []{2,2,6,8,1,2,3,6};

        for (int i=lista.length-1;i>=0;i--){

            System.out.print(lista[i]);
        }
    }
}
