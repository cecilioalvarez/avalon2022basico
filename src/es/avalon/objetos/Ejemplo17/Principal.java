package es.avalon.objetos.Ejemplo17;

public class Principal {
    public static void main(String[] args) {
        Matematicas m=new Matematicas();
        System.out.println(m.sumar(2,2));

        System.out.println(Matematicas.sumar(2,2));

        System.out.println(Matematicas.division(8,2));

        double resultado=Matematicas.resta(7,6);
        System.out.println(resultado);

        Persona p=new Persona("Juan");
        System.out.println(Persona.getContador());
        System.out.println(p.getContador2());

        Persona p1=new Persona("Jose");
        System.out.println(Persona.getContador());
        System.out.println(p1.getContador2());
        }
    }

