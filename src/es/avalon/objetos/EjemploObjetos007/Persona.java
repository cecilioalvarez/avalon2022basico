package es.avalon.objetos.EjemploObjetos007;

public class Persona {
    private int id;
    private String nombre;
    private int edad;
    private Telefono telefono;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Telefono getTelefono(){
        return telefono;
    }

    public void setTelefono(){
        this.telefono = telefono;
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(){

    }
    public Persona(String nombre){
        this.nombre = nombre;
    }
}
