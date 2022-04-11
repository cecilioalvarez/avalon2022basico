package es.avalon.objetos.EjemploObjetos0016;

public class Libro {
    private String autor;
    private String editorial;
    private String tapa;
    private int capitulos;

    //Constructores


    public Libro(String autor, String editorial, String tapa, int capitulos) {
        this.autor = autor;
        this.editorial = editorial;
        this.tapa = tapa;
        this.capitulos = capitulos;

    }

    //Getters and Setters
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

    public String getTapa() {
        return tapa;
    }

    public void setTapa(String tapa) {
        this.tapa = tapa;
    }

    public int getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(int capitulos) {
        this.capitulos = capitulos;
    }
}
