package es.avalon.objetos.EjemploObjetos003;

public class Principal {
    public static void main(String[] args) {
        Nota estudiante = new Nota("Matematicas",7);



        System.out.println(estudiante.getAsignatura());
        System.out.println(estudiante.getValor());

    }
}
