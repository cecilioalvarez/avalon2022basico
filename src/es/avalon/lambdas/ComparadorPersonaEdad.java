package es.avalon.lambdas;

import java.util.Comparator;

//unicamente una funcion   con dos parametros (Persona1,Persona2)->numero
public class ComparadorPersonaEdad  implements Comparator<Persona> {
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
