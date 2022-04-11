package es.avalon.objetos.ejemplo15;

public class Deportista extends Persona{
    private String deporte;

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public Deportista(String name, int edad, String deporte) {
        //Invoca al cosntructor de la clase superior
        super(name, edad);
        //Asigna el deporte
        this.deporte = deporte;
    }
    //Sobreescrito, es decir
    //en la clase hija se cambia su comportamiento por defecto
    @Override
    public void andar() {
        System.out.println(getName() + " Anda a 7km/h");
    }
}
