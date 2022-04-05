package es.avalon;

public class Ejemplo013ArraysAprobados {
    public static void main(String[] args) {
        int[] lista = new int[]{7,10,2,1,3,2};
        for(int i=0;i<lista.length;i++){
            if (lista[i]<5){
                System.out.print(lista[i]);
                System.out.println("->Esta suspendido");
            }
            else{
                System.out.print(lista[i]);
                System.out.println("->Esta Aprobado");
            }

        }
    }
}
