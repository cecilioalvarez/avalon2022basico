package es.avalon.jdbc2;

public class Persona {
    private String dni;
    private String nombre;
    private String apellidoas;

    public Persona(String dni, String nombre, String apellidoas) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidoas = apellidoas;
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

    public String getApellidoas() {
        return apellidoas;
    }

    public void setApellidoas(String apellidoas) {
        this.apellidoas = apellidoas;
    }
}
