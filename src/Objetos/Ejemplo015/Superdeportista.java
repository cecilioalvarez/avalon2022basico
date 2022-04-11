package Objetos.Ejemplo015;

public class Superdeportista extends  Deportista{
    private  int nivel;

    public Superdeportista(String nombre, int edad, String deporte, int nivel) {
        super(nombre, edad, deporte);
        this.nivel = nivel;
    }

    @Override
    public void anda() {
        System.out.println(getNombre()+" anda 10 km");
    }
}
