package es.avalon.Basico;

public class EjemploSumaElementosArray {
    public static void main(String[] args) {


        int[] numeros= new int[] {2,5,7,9,8,1,2};
        int[] numeros2= new int[] {7,5,7,9,10,1,2};
        int [] sumaElementos= new int[7];
        //el elemento ya esta reservado

        for (int i=0;i<numeros.length;i++) {

            sumaElementos[i]=numeros[i]+numeros2[i];
        }

        for (int i=0;i<numeros.length;i++) {

            System.out.println(sumaElementos[i]);
        }


    }
}
