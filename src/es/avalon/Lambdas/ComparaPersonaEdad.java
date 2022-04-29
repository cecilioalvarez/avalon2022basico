package es.avalon.Lambdas;

import java.util.Comparator;

public class ComparaPersonaEdad implements Comparator<Persona> {
    @Override
    public int compare(Persona o1, Persona o2) {
        //nos devuelve uno si la persona es mayor 0 si es igual -1 si es menor
        if (o1.getEdad()>o2.getEdad()) {

            return 1;
        }else if (o1.getEdad()< o2.getEdad()) {
            return -1;
        }else {
            return 0;
        }
    }

}
