package es.avalon.objeto.ejemplo04;

public class principal {
    public static void main(String[] args) {

        nota nota1 = new nota("matematicas",7);

        System.out.println(nota1.getNota());
        System.out.println(nota1.getAsignatura());
        System.out.println(nota1.estaAprobada());



    }
}
