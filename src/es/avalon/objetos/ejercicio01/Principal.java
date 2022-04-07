package es.avalon.objetos.ejercicio01;

public class Principal {

    public static void main(String[] args) {

        Rectangulo rectangulo = new Rectangulo(23, 10);

        System.out.println("El area del rectangulo solicitado es: " + rectangulo.calculoArea());
        System.out.println("El perimetro del rectangulo solicitado es: " + rectangulo.calculoPerimetro());
    }
}
