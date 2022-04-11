package es.avalon.objetos.Ejemplo18;

public class Libro extends Documento {
    private String autor;
    private int capitulos;

    public Libro(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(int capitulos) {
        this.capitulos = capitulos;
    }
}
