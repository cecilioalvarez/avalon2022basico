package es.avalon.objetos.ejemplo17;

public class Principal {

    public static void main(String[] args) {

//        double resultado=Matematicas.sumar(2,2);
//
//        System.out.println(resultado);

        Persona p= new Persona("juan");
        System.out.println(Persona.getContador());
        Persona p1= new Persona("juan");
        System.out.println(Persona.getContador());


    }
}
