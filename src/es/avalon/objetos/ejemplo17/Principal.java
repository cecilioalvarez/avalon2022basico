
package es.avalon.objetos.ejemplo17;

public class Principal {
    public static void main(String[] args) {

        Persona p= new Persona("juan");
        System.out.println(Persona.getContador());
        Persona p1= new Persona("juan");
        System.out.println(Persona.getContador());


        //double resultado=Matematicas.sumar(2,2);
        //System.out.println(resultado);
        //Matematicas m = new Matematicas();
        //System.out.println(Matematicas.sumar(2, 2));
        //Persona p=new Persona("Juan");
        // System.out.println(p.getContador(2, 2));
    }
}