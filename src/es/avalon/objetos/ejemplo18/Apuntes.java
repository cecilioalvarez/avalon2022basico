package es.avalon.objetos.ejemplo18;

public class Apuntes extends Documento {
    private String Asignatura;

    public String getAsignatura() {
        return Asignatura;
    }

    public void setAsignatura(String asignatura) {
        Asignatura = asignatura;
    }

    public Apuntes(String titulo, int paginas, String asignatura) {
        super(titulo, paginas);
        Asignatura = asignatura;
    }

    @Override
    public void coleccion() {

        System.out.println(" Coleccion Curso: "+getTitulo());
    }
}
