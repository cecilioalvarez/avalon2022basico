package es.avalon.objetos.ejercicio06Herencia;

public class Libro extends Documento{

    private String autor;
    private String editorial;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public Libro(String titulo, int paginas, String autor, String editorial) {
        super(titulo, paginas);
        this.autor = autor;
        this.editorial = editorial;
    }
}
