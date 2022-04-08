package es.avalon.objetos.ejemplo10;

public class Persona {
    private int edad;
    private String nombre;


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Persona(){

    }

    public Persona(int edad) {
        this.edad = edad;
    }

    public Persona(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }
}

