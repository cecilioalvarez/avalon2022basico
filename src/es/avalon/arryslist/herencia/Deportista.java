package es.avalon.arryslist.herencia;

public class Deportista extends  Persona{
    private String deporte;

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public Deportista(String nombre, int edad, String deporte) {
        super(nombre, edad);
        this.deporte = deporte;
    }

    @Override
    public void andar() {
        System.out.println(getNombre() + " anda a 7km hora");
    }
}
