package es.avalon.objetos.ejemplo20;

public class Principal {
    public static void main(String[] args) {

        Persona p= new Persona("12345678a","pedro");
        System.out.println(p);

        Persona p2= new Persona("12345678a","pedro");
        System.out.println(p.equals(p2));


    }
}
