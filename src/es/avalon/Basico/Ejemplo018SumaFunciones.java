package es.avalon.Basico;

public class Ejemplo018SumaFunciones {
    public static void main(String[] args) {

        System.out.println(sumarNNumeros(5));

    }

    static double sumarNNumeros( int tope) {

        int total=0;
        for (int i=0;i<tope;i++) {

            total+=i;
        }
        return total;
    }
}
