package es.avalon.objetos.Ejemplo9;

public class Principal {
    public static void main(String[] args) {
        int numero=7;
        numero++;
        System.out.println(numero);
        numero++;
        System.out.println(numero);

        numero=4;
        for (int i=0;i<10;i++){
            System.out.println(numero*i);
        }
    }
}
