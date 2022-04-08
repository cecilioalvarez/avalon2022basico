package es.avalon.objetos.EjemploPersona;

public class Persona {

    private String dni;
    private int edad;
    private String nombre;
    private Telefono telefono;


    public Telefono getTelefono() {
        return telefono;
    }

    public void setTelefono(Telefono telefono) {
        this.telefono = telefono;
    }


    public Persona(String nombre) {
        this.nombre = getNombre();
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Persona(String nombre, int edad, String dni){
        this.nombre = getNombre();
        this.edad = getEdad();
        this.dni = getDni();

    }

    public Persona (){

    }
}
