package es.avalon.objeto.ejemplo18;

public class Documento {

    private String titulo;
    private int pagina;

    public String getTitulo() {

        return titulo;
    }

    public void setTitulo(String titulo) {

        this.titulo = titulo;
    }

    public int getPagina() {

        return pagina;
    }

    public void setPagina(int pagina) {

        this.pagina = pagina;
    }

    public Documento(String titulo, int pagina) {
        this.titulo = titulo;
        this.pagina = pagina;
    }
    public Documento() {
    }
}
