package es.avalon.objetos.ejemplo004;

public class PrincipalNota {
    public static void main(String[] args) {

        Nota nota= new Nota("Programacion",200);

        System.out.println(nota.getAsignatura());
        System.out.println(nota.getValor());
        System.out.println(nota.estaAprobada());

    }
}
