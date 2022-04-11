package es.avalon.objetos.ejemplo18;

public class Comic extends Libro{
    private String Color;


    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public Comic(String titulo, int paginas, String autor, String editorial, int tapa, int capitulos, String color) {
        super(titulo, paginas, autor, editorial, tapa, capitulos);
        Color = color;
    }

    @Override
    public void coleccion() {

        System.out.println(" Coleccion Comic: "+getTitulo());
    }
}
