package es.avalon.APIsCore.LambdaYStreams.ejemplo1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Libro l1 = new Libro ("El juego de ender",400,"Ciencia Ficcion",20);
        Libro l2 = new Libro ("Harry Potter y el caliz de fuego",600,"Fantasia",25);
        Libro l3 = new Libro ("Las hijas del frio",300,"Novela Negra",15);
        Libro l4 = new Libro ("Los pilares de la Tierra",1000,"Historica",30);

        List<Libro> milista = Arrays.asList(l1,l2,l3,l4);
        List<Libro> listaFiltro = new ArrayList<>();


        filtroPaginas(milista, listaFiltro);
        mostrarLibros(listaFiltro);
        mostrarLibros(milista);

        filtroPrecio(milista, listaFiltro);


    }

    private static void filtroPrecio(List<Libro> milista, List<Libro> listaFiltro) {
        System.out.println("***********************");
        System.out.println("Filtrado de libros por Precio");
        for (Libro l: milista){
            if (l.getPrecio()>15){
                listaFiltro.add(l);
            }
        }
    }

    private static void filtroPaginas(List<Libro> milista, List<Libro> listaFiltro) {
        System.out.println("***********************");
        System.out.println("Filtrado de libros por Pagina");
        for (Libro l: milista){
            if (l.getPaginas()>400){
                listaFiltro.add(l);
            }
        }
    }

    private static void mostrarLibros(List<Libro> milista) {
        System.out.println("***********************");
        System.out.println("Listado de libros actuales");
        for (Libro l: milista){
            System.out.println(l.getTitulo());
        }
    }
}
