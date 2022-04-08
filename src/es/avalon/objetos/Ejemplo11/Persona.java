package es.avalon.objetos.Ejemplo11;

import es.avalon.objetos.Ejemplo10.Telefono;

import java.util.ArrayList;

public class Persona {
    private String nombre;
    private int edad;
    private String dni;
    Telefono telefono;
    private ArrayList<Chaqueta>chaquetas=new ArrayList<Chaqueta>();

    public Persona(String dni) {
        this.dni = dni;
    }

    public ArrayList<Chaqueta> getChaquetas() {
        return chaquetas;
    }

    public void setChaquetas(ArrayList<Chaqueta> chaquetas) {
        this.chaquetas = chaquetas;
    }

    public Persona(String nombre, int edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Telefono getTelefono() {
        return telefono;
    }

    public void setTelefono(Telefono telefono) {
        this.telefono = telefono;
    }
    public void addChaqueta(Chaqueta chaqueta){
        chaquetas.add(chaqueta);
    }
}
