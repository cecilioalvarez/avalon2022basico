package es.avalon.basico;

public class Ejemplo013ArraysAprobados {

    public static void main(String[] args) {

        int [] lista = new int[]{ 7, 10, 2, 1, 3, 2};
        int contador = 0;

        //Hay que recorrer array y tener una variable contador que cuente los aprobados
        for (int i=0; i<lista.length; i++){
            if(lista[i] >= 5){
                contador++;
            }
        }

        System.out.println(contador);
    }
}
