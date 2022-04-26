package es.avalon.APIsCore.Genericos.ejemplo6MetodoGenerico;

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

    List<Persona> lista = new ArrayList<>();
    lista.add(p);
    lista.add(i);
    lista.add(d);

    andarTodos(lista);

    List<Ingeniero> lista2 = new ArrayList<>();

    lista2.add(i);
    List<Persona> otraLista = clonarLista(lista);

    for (Persona persona: otraLista){
        System.out.println(persona.getNombre());
    }

    }
    public static void andar(Persona persona){
        Persona.andar();

    }
    public static void andarTodos(List<? extends Persona> milista){
        for (Persona p: milista){
            p.andar();
        }
    }

    public static <T> List<T> clonarLista(List<T> milista){
        List<T> milistaNueva = new ArrayList<T>();

        milistaNueva.addAll(milista);
        return milistaNueva;

    }
}
