package es.avalon.APIsCore.LambdaYStreams.ejemplo1;

public class Libro {
    private String titulo;
    private int paginas;
    private String categoria;
    private int precio;

    public Libro(String titulo, int paginas, String categoria, int precio) {
        this.titulo = titulo;
        this.paginas = paginas;
        this.categoria = categoria;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
