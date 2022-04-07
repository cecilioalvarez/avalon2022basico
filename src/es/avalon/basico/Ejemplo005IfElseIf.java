package es.avalon.basico;

public class Ejemplo005IfElseIf {
    public static void main(String[] args) {

        int nota = 8;

        if (nota >= 0 && nota <= 3) {
            System.out.println("lo has hecho muy mal");
        } else if (nota > 3 && nota < 5) {
            System.out.println("has suspendido");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("has aprobado");

        } else {
            System.out.println("buen examen");
        }

    }
}
