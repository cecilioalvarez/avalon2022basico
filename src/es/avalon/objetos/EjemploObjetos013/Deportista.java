package es.avalon.objetos.EjemploObjetos013;

public class Deportista extends Persona {
    private String deporte;

    public Deportista(String nombre, int edad, String deporte) {
        //Invoca al constructor de la clase superior
        super(nombre, edad);

        //Asigna el deporte
        this.deporte = deporte;
    }

    //Getters and Setters
    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    @Override
    public void andar() {
        System.out.println(getNombre() + " Anda a 10kmh ");
    }
}
