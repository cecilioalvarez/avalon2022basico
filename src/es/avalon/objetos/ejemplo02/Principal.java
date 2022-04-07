package es.avalon.objetos.ejemplo02;

public class Principal {

    public static void main(String[] args) {

        Nota n1 = new Nota();
        n1.setAsignatura("Matematicas");
        n1.setNota(8);

        System.out.println(n1.getAsignatura());
        System.out.println(n1.getNota());
        System.out.println(n1.estaAprobada());
        n1.Resultado();
    }
}
