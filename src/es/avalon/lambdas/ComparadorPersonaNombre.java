package es.avalon.lambdas;

import java.util.Comparator;

public class ComparadorPersonaNombre implements Comparator<Persona> {

    /*IMPORTANTE
    *
    * ESTO FUNCIONA PARA PODER DEFINIR UNA "INTERFAZ" PARA COMPARAR POR OTRA PROPIEDAD DISTINTA DE UN OBJETO A LA YA SOBREESCRITA EN EL METODO compareTo DE ESTE
    *
    * USO DE ESTO CON TreeSet
    * Set<Persona> conjuntoTreeSet = new TreeSet<>(new ComparadorPersonaNombre());
    *
    * */
    @Override
    public int compare(Persona p1, Persona p2) {
        return p1.getNombre().compareTo(p2.getNombre());
    }
}
