package es.avalon.objetos.ejemplo20;

public class Principal {
    public static void main(String[] args){
        Persona p=new Persona("pedro","12345678a");
        System.out.println(p);

        Persona p2=new Persona("pedro","12345678a");
        System.out.println(p.equals(p2));


    }
}
