package es.avalon.objetos.ejemplo11;


import java.util.ArrayList;

public class Persona {

    private String dni;
    private String nombre;
    private int edad;
    private Telefono telefono;

    private ArrayList<Chaqueta> chaquetas= new ArrayList<Chaqueta>();

    public ArrayList<Chaqueta> getChaquetas() {
        return chaquetas;
    }

    public void addChaqueta(Chaqueta chaqueta) {

        chaquetas.add(chaqueta);
    }

    public void setChaquetas(ArrayList<Chaqueta> chaquetas) {
        this.chaquetas = chaquetas;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
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

    public Telefono getTelefono() {
        return telefono;
    }

    public void setTelefono(Telefono telefono) {
        this.telefono = telefono;
    }

    public Persona(String dni, String nombre, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String dni) {
        this.dni = dni;
    }
}
