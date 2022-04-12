package es.avalon.objetos.EjemploObjetos019;

public class Principal {
    public static void main(String[] args) {
        Persona p = new Persona("pedro", 1019479755);
        System.out.println(p);

        Persona p2 = new Persona("Anderson", 1019479755);
        System.out.println(p.equals(p2));
    }
}
