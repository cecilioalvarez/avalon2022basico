package Objetos.Ejemplo018;

public class Apuntes extends  Documento{
    private String Titulo;
    private String Asignatura;

    public Apuntes(String titulo, int paginas, String titulo1, String asignatura) {
        super(titulo, paginas);
        Titulo = titulo1;
        Asignatura = asignatura;
    }

    @Override
    public String getTitulo() {
        return Titulo;
    }

    @Override
    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getAsignatura() {
        return Asignatura;
    }

    public void setAsignatura(String asignatura) {
        Asignatura = asignatura;
    }
}
