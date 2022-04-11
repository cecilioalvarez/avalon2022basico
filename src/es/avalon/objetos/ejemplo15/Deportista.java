package es.avalon.objetos.ejemplo15;

public class Deportista  extends Persona {
    private String  deporte;

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
    // sobreescrito es decir
    //en la clase hija se cambia su comportamiento por defecto

    @Override
    public void andar() {

        System.out.println(getNombre() + " anda a 7km hora");
    }
}