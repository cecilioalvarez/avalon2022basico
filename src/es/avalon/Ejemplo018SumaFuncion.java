package es.avalon;

public class Ejemplo018SumaFuncion {
    public static void main(String[] args){
        System.out.println(sumarNumeros(3));
    }
    static double sumarNumeros(int tope){
        int total =0;
        for (int i =0;i<tope;i++){
            total+=i;
        }
        return total;
    }
}
