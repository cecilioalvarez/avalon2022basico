package Objetos.Ejemplo015;

public class Deportista extends  Persona{
    private String Deporte;

    public Deportista(String nombre, int edad, String deporte) {
        super(nombre, edad);//invoca contructor de la clase superior
        Deporte = deporte;//inicializa el deporte
    }

    public Deportista(String deporte) {
        Deporte = deporte;
    }

    public String getDeporte() {
        return Deporte;
    }

    public void setDeporte(String deporte) {
        Deporte = deporte;
    }
//metodo sobre escrito
    //en la clase hija se cambia el comportamiento
    @Override
    public void anda() {
        System.out.println(getNombre()+" anda 7 km");
    }
}
