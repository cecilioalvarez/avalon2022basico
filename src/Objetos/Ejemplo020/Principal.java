package Objetos.Ejemplo020;

public class Principal {
    public static void main(String[] args) {
        Persona p = new Persona("1099213890","Andres");
        System.out.println(p.toString());
        System.out.println(p.hashCode());
        Persona p1 = new Persona("1099213890","Yesid");
        System.out.println(p1.toString());
        System.out.println(p1.hashCode());

        System.out.println(p.equals(p1));
    }
}
