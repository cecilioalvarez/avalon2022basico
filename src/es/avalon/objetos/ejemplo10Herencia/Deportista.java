package es.avalon.objetos.ejemplo10Herencia;

public class Deportista extends Persona{

    private String deporte;

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public Deportista(String nombre, int edad, String deporte) {
        //Invoca al constructor de la clase superior
        super(nombre, edad);

        //Asigna el deporte
        this.deporte = deporte;
    }

    //Sobreescribimos el metodo del padre "andar"
    //En la clase hija le cambiamos su comportamiento por defecto (si lo deseamos)
    @Override
    public void andar() {
        System.out.println(getNombre() + " anda a 7km hora");

    }
}
