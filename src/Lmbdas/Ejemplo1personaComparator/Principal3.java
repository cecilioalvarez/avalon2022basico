package Lmbdas.Ejemplo1personaComparator;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Principal3 {
    public static void main(String[] args) {
      // imprimirordenado(new ComparadorPersonaEdad());
       imprimirordenado((p1,p2)->p1.getNombre().compareTo(p2.getNombre()));
/************************************************************************************/
        imprimirordenado((p1,p2)->{
            return p1.getEdad()>p2.getEdad()?1:-1;//operadpr ternario
            //condicional comprimido
        });

    }

    public static void imprimirordenado(Comparator<Persona> comparador){
        Persona p1 = new Persona("Andres",20);
        Persona p2 = new Persona("Ana",30);
        Persona p3 =new Persona("miguel",80);
        Persona p4 = new Persona("maria",60);


        Set<Persona> conjunto = new TreeSet<Persona>(comparador);

        conjunto.add(p4);
        conjunto.add(p1);
        conjunto.add(p3);
        conjunto.add(p2);

        for (Persona p: conjunto){
            System.out.println(p.getNombre());
            System.out.println(p.getEdad());
        }
    }
}
