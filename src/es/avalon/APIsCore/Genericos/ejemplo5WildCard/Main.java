package es.avalon.APIsCore.Genericos.ejemplo5WildCard;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    Persona p = new Persona();
    p.setNombre("Juan");
    Ingeniero i = new Ingeniero();
    i.setNombre("Ana");
    Deportista d = new Deportista();
    d.setNombre("Alberto");

    andar(p);
    d.correr();
    i.investigar();

    List<Persona> lista = new ArrayList<Persona>();
    lista.add(p);
    lista.add(i);
    lista.add(d);

    andarTodos(lista);

    List<Ingeniero> lista2 = new ArrayList<Ingeniero>();

    lista2.add(i);
    }

    public static void andar(Persona persona){
        persona.andar();

    }
    //Metodo generico apoyandonos en los wildcard para aportar flexibilidad
    public static void andarTodos(List<? extends Persona> milista){
        for (Persona p: milista){
            p.andar();
        }
    }
}
