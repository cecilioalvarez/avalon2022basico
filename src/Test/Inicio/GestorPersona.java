package Test.Inicio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GestorPersona {
    private static List<Persona> lista  = new ArrayList<Persona>();
    static {
        lista.add(new Persona("1","pedro", LocalDate.of(2010,10,10)));
        lista.add(new Persona("2","Juan", LocalDate.of(2018,10,10)));
        lista.add(new Persona("3","Luis", LocalDate.of(1996,10,10)));
        lista.add(new Persona("4","Andres", LocalDate.of(2000,8,10)));
        lista.add(new Persona("5","Andres", LocalDate.of(2003,9,10)));
    }
    public Persona buscarPersonaPorDni(String DNI){
        for (Persona p: lista){
            if (p.getDni().equals(DNI)){
                return p;
            }
        }
        return  null;
    }
}
