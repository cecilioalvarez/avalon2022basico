package es.avalon.objetos.ejemplo18;

public class Libro extends Documento {
    private String Autor;
    private String Editorial;
    private int Tapa;
    private int Capitulos;

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

    public int getTapa() {
        return Tapa;
    }

    public void setTapa(int tapa) {
        Tapa = tapa;
    }

    public int getCapitulos() {
        return Capitulos;
    }

    public void setCapitulos(int capitulos) {
        Capitulos = capitulos;
    }

    public Libro(String titulo, int paginas, String autor, String editorial, int tapa, int capitulos) {
        super(titulo, paginas);
        Autor = autor;
        Editorial = editorial;
        Tapa = tapa;
        Capitulos = capitulos;
    }

    @Override
    public void coleccion() {

        System.out.println(" Coleccion Autoayuda: "+getTitulo());
    }
}
