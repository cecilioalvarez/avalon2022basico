package Objetos.Ejemplo018;

public class Libro extends Documento{
    private String Autor;
    private String Editorial;
    private String Tapa;
    private int Capitulo;

    public Libro(String titulo, int paginas, String autor, String editorial, String tapa, int capitulo) {
        super(titulo, paginas);
        Autor = autor;
        Editorial = editorial;
        Tapa = tapa;
        Capitulo = capitulo;
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

    public String getTapa() {
        return Tapa;
    }

    public void setTapa(String tapa) {
        Tapa = tapa;
    }

    public int getCapitulo() {
        return Capitulo;
    }

    public void setCapitulo(int capitulo) {
        Capitulo = capitulo;
    }
}
