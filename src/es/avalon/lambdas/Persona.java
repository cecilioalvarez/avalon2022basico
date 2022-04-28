package es.avalon.lambdas;

import java.util.Objects;

public class Persona implements  Comparable<Persona>{
    private  String nombre;
    private  int edad;

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

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persona)) return false;
        Persona persona = (Persona) o;
        return Objects.equals(nombre, persona.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    @Override
    public int compareTo(Persona otraPersona) {
        //nos devuelve uno si la persona es mayor 0 si es igual -1 si es menor
        if (this.getEdad()>otraPersona.getEdad()) {

            return 1;
        }else if (this.getEdad()< otraPersona.getEdad()) {
            return -1;
        }else {
            return 0;
        }
}}
