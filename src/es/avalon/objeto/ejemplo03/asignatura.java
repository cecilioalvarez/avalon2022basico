package es.avalon.objeto.ejemplo03;

public class asignatura {
    public static void main (String[] arg) {
        nota nota1= new nota();
        nota1.setnota(700);
        nota1.setAsignatura("matematica");
        System.out.println(nota1.getNota());
        System.out.println(nota1.getAsignatura());
        System.out.println(nota1.estaAprobado());
    }
}
