package Test.Inicio;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class Persona {
    private String Dni;
    private String nombre;
    private LocalDate fechaNacimiento;

    public Persona(String dni, String nombre, LocalDate edad) {
        Dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = edad;
    }
    public boolean esMayorDeEdad(){
        Period  per = Period.between(fechaNacimiento,LocalDate.now());
        return per.getYears()>18;

    }
    public static Persona esMayor(Persona p1, Persona p2){
        if (p1.getFechaNacimiento().isBefore(p2.getFechaNacimiento())){
            return  p1;
        }else{
            return p2;
        }


    }
    public Persona() {
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String dni) {
        Dni = dni;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persona)) return false;
        Persona persona = (Persona) o;
        return Objects.equals(getDni(), persona.getDni());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDni());
    }
}
