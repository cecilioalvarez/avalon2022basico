package es.avalon.objetos.Ejemplo22;

public class Cancion implements Controles{
    private String Titulo;

    public Cancion(String titulo) {
        Titulo = titulo;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    @Override
    public void play() {
        System.out.println("Reproduce la cancion");

    }

    @Override
    public void stop() {

        System.out.println("La cancion se para");
    }

    @Override
    public void next() {

        System.out.println("Siguiente cancion");
    }

    @Override
    public void back() {

        System.out.println("Cancion anterior");
    }
}
