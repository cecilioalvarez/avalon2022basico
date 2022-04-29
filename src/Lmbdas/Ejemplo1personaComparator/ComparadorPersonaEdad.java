package Lmbdas.Ejemplo1personaComparator;

import java.util.Comparator;

public class ComparadorPersonaEdad implements Comparator<Persona> {
    @Override
    public int compare(Persona persona,Persona otraPersona) {
        //nos devuelve uno si la persona es mayor 0 si es igual -1 si es menor
        if (persona.getEdad()>otraPersona.getEdad()) {

            return 1;
        }else if (persona.getEdad()< otraPersona.getEdad()) {
            return -1;
        }else {
            return 0;
        }
    }


}
