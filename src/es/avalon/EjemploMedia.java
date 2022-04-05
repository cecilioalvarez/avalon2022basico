package es.avalon;

public class EjemploMedia {
    public static void main(String[] args) {
        int[] lista = new int[]{7,10,5,1,3,2};
        double suma=0;
        double sumaCuadrados=0;
        for (int i=0;i<lista.length;i++) {

                suma=suma+lista[i];
        }

        for (int i=0;i<lista.length;i++) {

            sumaCuadrados=sumaCuadrados+(lista[i]*lista[i]);
        }

        System.out.println(suma/lista.length);
        System.out.println(sumaCuadrados);



    }
}
