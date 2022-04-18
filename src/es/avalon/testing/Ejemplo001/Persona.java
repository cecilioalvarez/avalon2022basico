package es.avalon.testing.Ejemplo001;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;
import java.util.SplittableRandom;

public class Persona {

    private String dni;
    private String nombre;
    private LocalDate fechadenacimiento;

    public Persona(String dni, String nombre, LocalDate edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechadenacimiento = edad;
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

    public LocalDate getFechadenacimiento() {
        return fechadenacimiento;
    }

    public void setFechadenacimiento(LocalDate edad) {
        this.fechadenacimiento = edad;
    }
    public boolean esMayorDeEdad(){
        Period periodo= Period.between(fechadenacimiento,LocalDate.now());
        return periodo.getYears()>=18;
    }
    public static Persona esMayor(Persona persona1,Persona persona2){

        if (persona1.getFechadenacimiento().isBefore(persona2.getFechadenacimiento())){
            return persona1;
        }else{
        return persona2;}

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persona)) return false;
        Persona persona = (Persona) o;
        return Objects.equals(dni, persona.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }
}

