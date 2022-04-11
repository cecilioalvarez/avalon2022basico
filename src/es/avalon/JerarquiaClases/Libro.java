package es.avalon.JerarquiaClases;

public class Libro extends Documento{

    private String titulo;
    private String autor;
    private String tapa;
    private String capitulos;
    private String editorial;


    public Libro(String titulo, String paginas, String autor, String tapa, String capitulos, String editorial, String color, String asignatura) {
        super(titulo, paginas, autor, tapa, capitulos, editorial, color, asignatura);
    }
}
