package es.avalon.objetos.ejemplo002;

public class PrincipalNota {
    public static void main(String[] args) {
        Nota nota= new Nota();
        nota.setAsignatura("Programacion");
        nota.setValor(200);

        System.out.println(nota.getAsignatura());
        System.out.println(nota.getValor());
        System.out.println(nota.estaAprobada());

    }
}
