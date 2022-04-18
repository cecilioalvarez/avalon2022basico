package es.avalon.Testing;

import java.time.LocalDate;

public class Persona {

    private String dni;
    private String nombre;
    private LocalDate edad;

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

    public LocalDate getEdad() {
        return edad;
    }

    public void setEdad(LocalDate edad) {
        this.edad = edad;
    }

    public Persona(String dni, String nombre, LocalDate edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
    }


}
