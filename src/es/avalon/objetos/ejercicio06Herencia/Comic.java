package es.avalon.objetos.ejercicio06Herencia;

public class Comic extends Documento{

    private String autor;
    private String editorial;
    private String color;

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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Comic(String titulo, int paginas) {
        super(titulo, paginas);
    }
}
