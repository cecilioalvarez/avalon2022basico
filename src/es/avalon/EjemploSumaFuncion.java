package es.avalon;

public class EjemploSumaFuncion {
    public static void main(String[] args) {

        System.out.println(sumarNumeros(5));

    }

    static double sumarNumeros (int tope){
        int total =0;
        for (int i=0; i<tope;i++){
            total+=i;
        }
        return total;
    }
}
