package Objetos.Ejemplo018;

public class Documento {
    private String Titulo;
    private int Paginas;


    public Documento(String titulo, int paginas) {
        Titulo = titulo;
        Paginas = paginas;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public int getPaginas() {
        return Paginas;
    }

    public void setPaginas(int paginas) {
        Paginas = paginas;
    }
}
