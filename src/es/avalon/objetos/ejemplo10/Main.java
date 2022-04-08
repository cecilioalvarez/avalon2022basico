package es.avalon.objetos.ejemplo10;

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        Persona p2= new Persona(23, "Rosa");
        Persona p3= new Persona(25);
        Telefono t1= new Telefono ("Xiaomi", 1234562341);
        p2.setTelefono(t1);
        System.out.println(p2.getTelefono().getNumero());
    }
}
