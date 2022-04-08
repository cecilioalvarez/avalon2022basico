package es.avalon.objetos.Ejemplo10;

public class Principal {
    public static void main(String[] args) {
        Persona p=new Persona();
        p.setNombre("Jose");
        p.setEdad(42);
        //Persona p1=new Persona("David");
        //Persona p2=new Persona("Gema",34);
        Persona p3=new Persona("72121212A","Pepe",54);
        Telefono t=new Telefono("Samsung",555);
        p3.setTelefono(t);
        System.out.println(p3.getTelefono().getNumero());
        System.out.println(p3.getTelefono().getMarca());

        //System.out.println(p.getNombre());
    }
}
