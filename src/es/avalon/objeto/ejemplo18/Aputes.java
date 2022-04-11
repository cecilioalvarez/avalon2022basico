package es.avalon.objeto.ejemplo18;

public class Aputes extends Documento {

    private String asignatura;

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public Aputes(String titulo, int pagina, String asignatura) {
        super(titulo, pagina);
        this.asignatura = asignatura;
    }
}
