package es.avalon.objetos.ejemplo22;

public class Cancion implements Reproducible {
    private String Nombre;

    public String getNombre() {

        return Nombre;
    }

    public void setNombre(String nombre) {

        Nombre = nombre;
    }

    public Cancion(String nombre)
    {
        Nombre = nombre;
    }


    @Override
    public void Play() {
        System.out.println("La cancion" + getNombre() + "se reproduce");

    }

    @Override
    public void Stop() {
        System.out.println("La cancion" + getNombre() + "se pausa");
    }

    @Override
    public void Siguiente() {
        System.out.println("Siguiente Cancion");

    }

    @Override
    public void Atras() {
        System.out.println("Anterior");

    }
}
