package es.avalon.objetos.ejemplo10;

public class Persona {
    private int edad;
    private String nombre;
    private int dni;
    private Telefono telefono;

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Telefono getTelefono() {
        return telefono;
    }

    public void setTelefono(Telefono telefono) {
        this.telefono = telefono;
    }

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

    public Persona(int edad, String nombre, int dni, Telefono telefono) {
        this.edad = edad;
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
    }
}

