package es.avalon.objetos.ejemplo20;

public class Main {
    public static void main(String[] args) {
        Persona p= new Persona ("12345678a", "Pedro");
        System.out.println(p);

        Persona p2 = new Persona ("3216259J", "Juan");
        System.out.println(p.equals(p2));
    }
}
