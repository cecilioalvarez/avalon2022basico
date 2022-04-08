package es.avalon.objetos.ejemplo09ArrayListObjetosAnidados;

import es.avalon.objetos.ejemplo07ObjetosAnidados.Telefono;

import java.util.ArrayList;

public class Persona {

    private String dni;
    private String nombre;
    private int edad;

    //Añadimos otro objeto como variable
    private Telefono telefono;

    private ArrayList<Chaqueta> chaquetas = new ArrayList<Chaqueta>();





    //SOBRECARGA DE CONSTRUCTORES

    //Constructor por defecto
    public Persona(){
    }

    //Constructor con solo un atributo
    public Persona(String nombre){
        setNombre(nombre);
    }


    public Persona(String nombre, int edad) {
        setNombre(nombre);
        setEdad(edad);
    }

    public Persona(String dni, String nombre, int edad) {
        setDni(dni);
        setNombre(nombre);
        setEdad(edad);
    }

    public void addChaqueta(Chaqueta chaqueta){
        chaquetas.add(chaqueta);
    }

    public ArrayList<Chaqueta> getChaquetas() {
        return chaquetas;
    }

    public void setChaquetas(ArrayList<Chaqueta> chaquetas) {
        this.chaquetas = chaquetas;
    }

    public Telefono getTelefono() {
        return telefono;
    }

    public void setTelefono(Telefono telefono) {
        this.telefono = telefono;
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
}
