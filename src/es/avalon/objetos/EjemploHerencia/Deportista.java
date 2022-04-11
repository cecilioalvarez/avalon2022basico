package es.avalon.objetos.EjemploHerencia;

public class Deportista extends Persona{
    private String deporte;

    public Deportista(String nombre, int edad) {
        super(nombre, edad);
    }

    public String getDeporte() {
        return deporte;
    }

    public Deportista(String nombre, int edad, String deporte) {
        super(nombre, edad);
        this.deporte = deporte;
    }
    @Override
    public void andar(){
        System.out.println(getNombre() + " Anda a 7Km/H");
    }
}
