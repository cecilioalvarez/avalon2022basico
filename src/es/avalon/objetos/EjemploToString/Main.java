package es.avalon.objetos.EjemploToString;

public class Main {
    public static void main(String[] args) {

        Persona p=new Persona("David","72015912X");
        System.out.println(p);

        Persona p1=new Persona("David","72015912X");
        System.out.println(p.equals(p1));

    }
}
