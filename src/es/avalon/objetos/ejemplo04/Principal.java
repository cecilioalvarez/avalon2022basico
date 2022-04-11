package es.avalon.objetos.ejemplo04;

public class Principal {
    public static void main(String[] args) {

        Nota nota1 = new Nota("matematicas",7);

        System.out.println(nota1.getnota());
        System.out.println(nota1.getAsignatura());
        System.out.println(nota1.estaAprobada());
    }
}
