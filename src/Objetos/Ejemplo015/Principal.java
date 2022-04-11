package Objetos.Ejemplo015;

public class Principal {
    public static void main(String[] args) {
        Persona p =new Persona("yesid",25);
        Persona D = new Deportista("andres",26,"natación");
        p.anda();
        System.out.println(D.getNombre()+" "+D.getEdad()+" ");
        D.anda();
        Persona s = new Superdeportista("tania",20,"Tennis",2);
        s.anda();

        //Persona p = new Deportista("andres",26,"natación");
    }
}
