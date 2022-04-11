package es.avalon.objetos.EjemploObjetos0016;

public class Apuntes {
    private String titulo;
    private String asignatura;

    //Constructor
    public Apuntes(String titulo, String asignatura) {
        this.titulo = titulo;
        this.asignatura = asignatura;
    }

    //Getters and Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }
}
