package es.avalon.objetos.Ejemplo15;

public class Deportista extends Persona{
    private String deporte;

    public Deportista(String nombre, int edad, String deporte) {
        //Invoca al contructor de la clase superior y asigna el deporte
        super(nombre, edad);
        //Asigna el deporte
        this.deporte = deporte;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public Deportista(String deporte) {
        this.deporte = deporte;
    }
}
