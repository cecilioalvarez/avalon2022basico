package es.avalon.lambdas.Ejemplo001;

public class Persona implements Comparable<Persona> {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public int compareTo(Persona otraPersona) {
        //Este metodo devuleve 1 si es mayor
        // 0 si es igual
        // -1 si es menor
        if (this.getEdad() > otraPersona.getEdad()) {
            return 1;
        } else if (this.getEdad() < otraPersona.getEdad()) {
            return -1;
        } else {
            return 0;
        }
    }
}
