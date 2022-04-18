package es.avalon.testing.ejemplo02Persona;

import java.time.LocalDate;
import java.time.Period;

public class Persona {

    private String dni;
    private String nombre;
    private LocalDate fechaNacimiento;

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

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Persona(String dni, String nombre, LocalDate edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = edad;
    }

    public boolean esMayorEdad(){

        //Sacamos una variable de tipo Period que calcula entre la fecha de nacimiento y la fecha actual n
        Period periodo = Period.between(fechaNacimiento, LocalDate.now());
        return periodo.getYears()>18;
    }
}
