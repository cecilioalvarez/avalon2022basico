package es.avalon.testing;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
    private String dni;
    private String nombre;
    private LocalDate fechanacimiento;

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

    public LocalDate getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(LocalDate fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public Persona(String dni, String nombre, LocalDate edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechanacimiento = edad;
    }
    public boolean esMayorDeEdad (){
        Period periodo= Period.between(fechanacimiento,LocalDate.now());
        return periodo.getYears()>=18;

    }
}
