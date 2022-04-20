package es.avalon.testing.ejemplo1;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class Persona {
    private String dni;
    private String nombre;
    private LocalDate fechaDeNacimiento;

    public Persona(String dni, String nombre, LocalDate fechaDeNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
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

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    public boolean esMayorDeEdad () {
        Period periodo = Period.between(fechaDeNacimiento, LocalDate.now());
        return periodo.getYears()>=18;
    }
    public static Persona esMayor(Persona p1, Persona p2){
        if (p1.getFechaDeNacimiento().isBefore(p2.getFechaDeNacimiento())){
            return p1;
        }
        else {
            return p2;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persona)) return false;
        Persona persona = (Persona) o;
        return Objects.equals(dni, persona.dni) && Objects.equals(nombre, persona.nombre) && Objects.equals(fechaDeNacimiento, persona.fechaDeNacimiento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni, nombre, fechaDeNacimiento);
    }
}
