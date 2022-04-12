package es.avalon.objeto.ejemplo22;

public class Pelicula implements Reproducible{

  private String nombre;

    public String getNombre() {

        return nombre;
   }

   public void setNombre(String nombre) {

       this.nombre = nombre;
    }

    public Pelicula(String nombre) {

        this.nombre = nombre;
   }

    @Override
    public void play() {
     System.out.println("La Pelicula se esta Reproduciendo");
    }

  @Override
     public void stop() {
      System.out.println("La Pelicula esta Pausada");
   }

    @Override
   public void siguiente() {
        System.out.println("Siguiente Pelicula");
   }

    @Override
    public void atras() {
        System.out.println("Devolver ");
    }
}
