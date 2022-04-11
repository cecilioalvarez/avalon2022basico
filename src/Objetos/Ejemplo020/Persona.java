package Objetos.Ejemplo020;

import java.util.Objects;

public class Persona {
    private String dni;
    private String Nombre;

    public Persona(String dni, String nombre) {
        this.dni = dni;
        Nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "dni='" + dni + '\'' +
                ", Nombre='" + Nombre + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persona)) return false;
        Persona persona = (Persona) o;
        return getDni().equals(persona.getDni());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDni());
    }
}
