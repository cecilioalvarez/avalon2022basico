package es.avalon.objetos.ejemplo03;

public class Principal {
    public static void main(String[] args) {
        Nota nota1 = new Nota();
        nota1.setNota( 7);
        nota1.setAsignatura("matematicas");
        System.out.println(nota1.getNota());
        System.out.println(nota1.getAsignatura());
        System.out.println(nota1.estaAprobada());

    }
}
