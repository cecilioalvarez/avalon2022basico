package es.avalon.objetos.ejemplo11;

import es.avalon.objetos.ejemplo09.telefono;

import java.util.ArrayList;

public class persona {
    private String dni;
    private String nombre;

    private int edad;
    private telefono tele;
    private ArrayList<chaqueta> chaquetas = new ArrayList<chaqueta>();
    public ArrayList<chaqueta> getChaquetas() {
        return chaquetas;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setChaquetas(ArrayList<chaqueta> chaquetas) {
        this.chaquetas = chaquetas;
    }

    public void addChaqueta(chaqueta chaqueta) {

        chaquetas.add(chaqueta);
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

    public telefono getTele() {
        return tele;
    }

    public void setTele(telefono tele) {
        this.tele = tele;
    }

    public persona(String nombre, int edad, telefono tele) {
        this.nombre = nombre;
        this.edad = edad;
        this.tele = tele;
    }

    public persona(String dni) {
        this.dni = dni;
    }
}
