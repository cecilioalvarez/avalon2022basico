package es.avalon.objeto.ejemplo18;

public class Comic extends Libro {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Comic(String titulo, int pagina, String autor, String editorial, int tapa, String color) {
        super(titulo, pagina, autor, editorial, tapa);
        this.color = color;
    }
}
