package es.avalon.objetos.ejemplo13ToStringEqualsYHashCode;

public class Principal {

    public static void main(String[] args) {


        Persona p = new Persona("123123123a", "Pedro");

        System.out.println(p);

        Persona p2 = new Persona("987987987R", "Juan");
        System.out.println(p.equals(p2));
    }
}
