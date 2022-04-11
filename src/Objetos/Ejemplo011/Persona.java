package Objetos.Ejemplo011;


import java.util.ArrayList;

public class Persona {
    private String nombre;
    private int edad;
    private String dni;
    private Telefono telefono;
    private ArrayList<Chaqueta> chaquetas = new ArrayList<Chaqueta>();

    public ArrayList<Chaqueta> getChaquetas() {
        return chaquetas;
    }

    public void setChaquetas(ArrayList<Chaqueta> chaquetas) {
        this.chaquetas = chaquetas;
    }
    public void addchaqueta (Chaqueta ch){
        this.getChaquetas().add(ch);

    }
    public String getNombre() {
        return nombre;
    }

    public Telefono getTelefono() {
        return telefono;
    }

    public void setTelefono(Telefono telefono) {
        this.telefono = telefono;
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

    public Persona() {
    }

    public Persona(String nombre, int edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }
}
