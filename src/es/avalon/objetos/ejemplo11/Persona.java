package es.avalon.objetos.ejemplo11;


import java.util.ArrayList;

public class Persona {
    private int edad;
    private String nombre;
    private int dni;
    private Telefono telefono;

    private ArrayList<Chaqueta> chaquetas = new ArrayList<Chaqueta>();

    public ArrayList<Chaqueta> getChaquetas() {
        return chaquetas;
    }

    public void addChaqueta(Chaqueta chaqueta) {

        chaquetas.add(chaqueta);
    }


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

    public Persona( int dni, int edad, String nombre,  Telefono telefono) {
        this.edad = edad;
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
    }
}

