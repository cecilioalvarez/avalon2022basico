package es.avalon.objetos.EjemploObjetos0016;

public class Documento {
    private String titulo;
    private int paginas;

    //Constructor
    public Documento(String titulo, int paginas) {
        this.titulo = titulo;
        this.paginas = paginas;
    }

    //Getters and Setters
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


}
