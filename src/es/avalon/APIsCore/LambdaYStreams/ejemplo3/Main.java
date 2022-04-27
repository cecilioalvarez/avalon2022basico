package es.avalon.APIsCore.LambdaYStreams.ejemplo3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Libro l1 = new Libro("El juego de ender", 400, "Ciencia Ficcion", 20);
        Libro l2 = new Libro("Harry Potter y el caliz de fuego", 600, "Fantasia", 25);
        Libro l3 = new Libro("Las hijas del frio", 300, "Novela Negra", 15);
        Libro l4 = new Libro("Los pilares de la Tierra", 1000, "Historica", 30);

        List<Libro> milista = Arrays.asList(l1, l2, l3, l4);
        List<Libro> listaFiltro = new ArrayList<>();


        //listaFiltro = filtro(milista, new FiltroPaginas(650, 350));
        //listaFiltro = filtro(milista, new FiltroPrecio());

        //Aqui estamos usando las expresiones lambda ("->")
        filtro(milista,listaFiltro,(Libro l)->l.getTitulo().contains("juego"));
        mostrarLibros(listaFiltro);


        //mostrarLibros(milista);
    }


    private static List<Libro> filtroPalabras2(List<Libro> libros, String nombre) {
        return libros.stream().filter(libro -> libro.getTitulo().contains(nombre))
                .limit(5)
                .collect(Collectors.toList());
    }

    //Hemos podido usar un interfaz predefinido por java, por lo que hemos borrado
    //la interfaz creada por nosotros llamada "Filtro" y nuestro codigo sigue funcionando
    private static List<Libro> filtro(List<Libro> milista, List<Libro> listaNueva, Predicate<Libro> f) {
        System.out.println("***********************");
        System.out.println("Filtrado de libros");
        for (Libro l : milista) {
            if (f.test(l)) {
                listaNueva.add(l);
            }
        }
        return listaNueva;
    }


    private static void mostrarLibros(List<Libro> milista) {
        System.out.println("***********************");
        System.out.println("Listado de libros actuales");
        for (Libro l : milista) {
            System.out.println(l.getTitulo());
        }
    }
}
