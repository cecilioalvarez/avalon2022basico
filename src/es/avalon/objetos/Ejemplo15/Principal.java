package es.avalon.objetos.Ejemplo15;

public class Principal {
    public static void main(String[] args) {
        Persona p=new Persona("jose",42);
        Persona p1=new Persona("pedro", 34);
        Deportista d1=new Deportista("Juan",36,"Atletismo");
        Deportista d2=new Deportista("Baloncesto");

        System.out.println(d1.getNombre());
        System.out.println(d1.getDeporte());


    }
}
