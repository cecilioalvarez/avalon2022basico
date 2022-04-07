package es.avalon.basico;

public class Ejemplo018SumaFuncion {

    public static void main(String[] args) {

        System.out.println(sumaNNumeros(5));

    }
    static double sumaNNumeros (int tope){

        int total=0;
        for (int i=0;i<tope;i++){

            total+=1;
        }
        return total;
    }
}
