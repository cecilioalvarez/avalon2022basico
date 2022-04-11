package es.avalon.objeto.ejemplo18;

public class Libro extends Documento {
    private String autor;
    private String editorial;
    private int tapa;

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

    public int getTapa() {
        return tapa;
    }

    public void setTapa(int tapa) {
        this.tapa = tapa;
    }

    public Libro(String titulo, int pagina, String autor, String editorial, int tapa) {
        super(titulo, pagina);
        this.autor = autor;
        this.editorial = editorial;
        this.tapa = tapa;
    }
}
