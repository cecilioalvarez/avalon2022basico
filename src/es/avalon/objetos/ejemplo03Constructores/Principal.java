package es.avalon.objetos.ejemplo03Constructores;

public class Principal {

    public static void main(String[] args) {

        Nota n1 = new Nota("Matematicas", 8);

        System.out.println(n1.getAsignatura());
        System.out.println(n1.getNota());
        System.out.println(n1.estaAprobada());
        n1.Resultado();
    }
}