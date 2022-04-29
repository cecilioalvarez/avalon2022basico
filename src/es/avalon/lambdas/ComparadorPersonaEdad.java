package es.avalon.lambdas;

import java.util.Comparator;


//Esta clase se podria entender unicamente como una funcion con 2 parametros -> Devuelve un numero
public class ComparadorPersonaEdad implements Comparator<Persona> {


    @Override
    public int compare(Persona p1, Persona p2) {

        if(p1.getEdad()>p2.getEdad()) {
            return 1;
        }else if (p1.getEdad() < p2.getEdad()){
            return -1;
        }
        return 0;
    }
}
