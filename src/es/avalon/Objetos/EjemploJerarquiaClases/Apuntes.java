package es.avalon.Objetos.EjemploJerarquiaClases;

public class Apuntes extends Documento{

    private String titulo;
    private String asignatura;

    public Apuntes(String titulo, String paginas, String autor, String tapa, String capitulos, String editorial, String color, String asignatura) {
        super(titulo, paginas, autor, tapa, capitulos, editorial, color, asignatura);
    }
}
