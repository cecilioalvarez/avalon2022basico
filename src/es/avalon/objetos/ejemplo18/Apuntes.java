package es.avalon.objetos.ejemplo18;

public class Apuntes extends Documento{
    private String Asignatura;

    public String getAsignatura() {
        return Asignatura;
    }

    public void setAsignatura(String asignatura) {
        Asignatura = asignatura;
    }

    @Override
    public void setTitulo(String titulo) {
        super.setTitulo(titulo);
    }

    @Override
    public void setPaginas(int paginas) {
        super.setPaginas(paginas);
    }
}
