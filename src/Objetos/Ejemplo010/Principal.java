package Objetos.Ejemplo010;


public class Principal {
    public static void main(String[] args) {
        Persona p =new Persona();
        Persona p1 =new Persona("Andres",26);
        Persona p2 =new Persona("yesid");
        Persona p3 =new Persona("Andres",26,"1099213890");
        Telefono t = new Telefono("SAMSUNG",313825903);
        p.setTelefono(t);
        System.out.println(p.getTelefono().getNumero());
    }
}
