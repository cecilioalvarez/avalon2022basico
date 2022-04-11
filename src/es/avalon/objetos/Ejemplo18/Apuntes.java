package es.avalon.objetos.Ejemplo18;

public class Apuntes extends Documento {

    private String asignatura;

    public Apuntes(String asignatura) {
        this.asignatura = asignatura;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }
}
