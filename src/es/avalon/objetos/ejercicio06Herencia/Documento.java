package es.avalon.objetos.ejercicio06Herencia;

public class Documento {

    private String titulo;
    private int paginas;

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

    public Documento(String titulo, int paginas) {
        this.titulo = titulo;
        this.paginas = paginas;
    }
}
