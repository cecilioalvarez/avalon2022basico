package es.avalon.Testing;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class Persona {
    private String dni;
    private String nombre;
    private LocalDate fechaNacimiento;

    public Persona(String dni, String nombre, LocalDate fechaNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
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

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate edad) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public boolean esMayorEdad (){
        Period periodo = Period.between(fechaNacimiento, LocalDate.now());
        return periodo.getYears()>=18;
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

    public static Persona esMayor(Persona persona1, Persona persona2){
        if (persona1.getFechaNacimiento().isBefore(persona2.getFechaNacimiento())){
            return persona1;
        }else{
            return persona2;
        }
    }


}
