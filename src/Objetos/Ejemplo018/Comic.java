package Objetos.Ejemplo018;

public class Comic extends Documento{
    private String Autor;
    private String Editorial;
    private String Color;

    public Comic(String titulo, int paginas, String autor, String editorial, String color) {
        super(titulo, paginas);
        Autor = autor;
        Editorial = editorial;
        Color = color;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String editorial) {
        Editorial = editorial;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }
}
