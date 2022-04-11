package es.avalon.objeto.ejemplo10;

public class persona {
    private String nombre;
    private int edad;
    private String dni;
    private telefono telefono;

    public telefono getTelefono() {
        return telefono;
    }

    public void setTelefono(telefono telefono) {
        this.telefono = telefono;
    }

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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public persona(String nombre, int edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    public persona() {
    }

    public persona(String dni) {
        this.dni = dni;
    }
}

