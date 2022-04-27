package es.avalon.APIsCore.LambdaYStreams.ejemplo2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Libro l1 = new Libro("El juego de ender",400,"Ciencia Ficcion",20);
        Libro l2 = new Libro("Harry Potter y el caliz de fuego",600,"Fantasia",25);
        Libro l3 = new Libro("Las hijas del frio",300,"Novela Negra",15);
        Libro l4 = new Libro("Los pilares de la Tierra",1000,"Historica",30);

        List<Libro> milista = Arrays.asList(l1,l2,l3,l4);
        List<Libro> listaFiltro = new ArrayList<>();



        listaFiltro = filtro(milista, new FiltroPaginas(650, 350));
        listaFiltro = filtro(milista, new FiltroPrecio());
        //filtro(milista,listaFiltro,new FiltroPrecio());
        mostrarLibros(listaFiltro);




        //filtroPaginas(milista, listaFiltro);
        //filtroPrecio(milista, listaFiltro);

        //mostrarLibros(milista);
    }


    private static List<Libro> filtroPalabras(List<Libro> libros, String nombre ){
        List<Libro> librosFiltrados = new ArrayList<>();

        for (Libro libro: libros){
            if (libro.getTitulo().contains(nombre)) {
                librosFiltrados.add(libro);
            }
        }
        return librosFiltrados;
    }
    private static List<Libro> filtroPalabras2(List<Libro> libros, String nombre ) {
        return libros.stream().filter(libro -> libro.getTitulo().contains(nombre))
                .limit(5)
                .collect(Collectors.toList());
    }

    private static boolean contieneNombre(Libro libro) {
        return libro.getTitulo().contains("hola k ase");
    }



    private static List<Libro> filtro(List<Libro> milista, Filtro f) {
        System.out.println("***********************");
        System.out.println("Filtrado de libros");

        List<Libro> librosFiltrados = new ArrayList<>();
        for (Libro l: milista){
            if (f.test(l)){
                librosFiltrados.add(l);
            }
        }
        return librosFiltrados;
    }

//    private static void filtroPrecio(List<Libro> milista, List<Libro> listaFiltro) {
//        System.out.println("***********************");
//        System.out.println("Filtrado de libros por Precio");
//        for (Libro l: milista){
//            if (l.getPrecio()>15){
//                listaFiltro.add(l);
//            }
//        }
//    }
//
//   private static void filtroPaginas(List<Libro> milista, List<Libro> listaFiltro) {
//        System.out.println("***********************");
//        System.out.println("Filtrado de libros por Pagina");
//        for (Libro l: milista){
//            if (l.getPaginas()>400){
//                listaFiltro.add(l);
//            }
//        }
//    }

    private static void mostrarLibros(List<Libro> milista) {
        System.out.println("***********************");
        System.out.println("Listado de libros actuales");
        for (Libro l: milista){
            System.out.println(l.getTitulo());
        }
    }
}
