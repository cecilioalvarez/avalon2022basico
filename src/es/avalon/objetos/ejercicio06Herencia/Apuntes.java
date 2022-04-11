package es.avalon.objetos.ejercicio06Herencia;

public class Apuntes extends Documento{

    private String Asignatura;

    public String getAsignatura() {
        return Asignatura;
    }

    public void setAsignatura(String asignatura) {
        Asignatura = asignatura;
    }

    public Apuntes(String titulo, int paginas) {
        super(titulo, paginas);
    }
}
