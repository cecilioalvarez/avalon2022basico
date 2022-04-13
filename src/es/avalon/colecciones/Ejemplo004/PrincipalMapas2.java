package es.avalon.colecciones.Ejemplo004;

import java.util.HashMap;
import java.util.Map;

public class PrincipalMapas2 {
    public static void main(String[] args) {
        Persona p1=new Persona("Ana","Sanchez","1");
        Persona p2=new Persona("Jose","Sanz","2");
        Persona p3=new Persona("Juan","Gomez","3");
        Persona p4=new Persona("Victor","Herranz","4");
        Persona p5=new Persona("Hector","Calatayud","5");

        Map<String,Persona> mapaComplejo=new HashMap<String,Persona>();
        mapaComplejo.put(p1.getDni(),p1);
        mapaComplejo.put(p2.getDni(),p2);
        mapaComplejo.put(p3.getDni(),p3);
        mapaComplejo.put(p4.getDni(),p4);
        mapaComplejo.put(p5.getDni(),p5);

        System.out.println(mapaComplejo.get("1").getNombre());
        System.out.println(mapaComplejo.get("2").getApellidos());
        System.out.println(mapaComplejo.get("3").getNombre());
        System.out.println(mapaComplejo.get("4").getApellidos());
        System.out.println(mapaComplejo.get("5").getNombre());


    }
}
