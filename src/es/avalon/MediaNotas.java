package es.avalon;

public class MediaNotas {
    public static void main(String []args){
        int [] notas = {7,10,2,5,3,0};
        float suma = 0;
        double resultado = 0;
        for (int i =0;i<notas.length;i++){
            suma = suma+notas[i];
        }
        resultado = suma/ notas.length;
        System.out.println(resultado);
    }
}
