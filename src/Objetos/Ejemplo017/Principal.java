package Objetos.Ejemplo017;

public class Principal {


    public static void main(String[] args) {

        System.out.println(Matematicas.sumar(2,2));
        System.out.println(Matematicas.restar(2,3));
        System.out.println(Matematicas.producto(2,3));
        System.out.println(Matematicas.division(2,3));

        Persona P = new Persona("andres");
        Persona P1 = new Persona("yesid");
        System.out.println(Persona.getContador());

    }

}
