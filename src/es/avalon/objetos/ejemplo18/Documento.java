package es.avalon.objetos.ejemplo18;

public class Documento {
    private String Titulo;
    private  int Paginas;

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

    public Documento(String titulo, int paginas) {
        Titulo = titulo;
        Paginas = paginas;
    }

    public void Documento() {
    }
    public void coleccion(){

        System.out.println(" Coleccion Autoayuda: "+getTitulo());
    }


}
