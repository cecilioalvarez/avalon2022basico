package es.avalon.objetos.Ejemplo20;

public class Principal {
    public static void main(String[] args) {

        Persona p=new Persona("12345698Ñ","Pedro");
        System.out.println(p);
        Persona p1=new Persona("12345698ñ","Pedro");

        System.out.println(p.equals(p1));
        System.out.println(p1.equals(p1));
        System.out.println(p.hashCode()==p1.hashCode());
        System.out.println(p.hashCode());
        System.out.println(p1.hashCode());

    }
}
