package es.avalon.lambdas;

import java.util.Objects;

/*Implementamos Comparable que es un interfaz generico que nos permite utilizar un metodo como compareTo (Para comparar por propiedad)*/
public class Persona implements Comparable<Persona>{

    private String nombre;
    private int edad;

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

    //Este metodo nos devuelve 1 si la persona es mayor, 0 si es igual, -1 si es menor
    @Override
    public int compareTo(Persona otraPersona) {
        //Definimos la propiedad que deseamos comparar para la devolucion de -1, 0 , 1 (ES ASI SIEMPRE POR CONVENCION)
        if(this.getEdad()>otraPersona.getEdad()) {
            return 1;
        }else if (this.getEdad() < otraPersona.getEdad()){
            return -1;
        }
        return 0;
    }
}
