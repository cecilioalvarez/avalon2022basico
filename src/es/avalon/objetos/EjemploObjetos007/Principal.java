package es.avalon.objetos.EjemploObjetos007;

public class Principal {
    public static void main(String[] args) {

        Persona p= new Persona();
        Persona p1= new Persona("david");
        Persona p2= new Persona("andres");

        p2.setTelefono();
        System.out.println(p2.getTelefono().getNumero());
    }
}
