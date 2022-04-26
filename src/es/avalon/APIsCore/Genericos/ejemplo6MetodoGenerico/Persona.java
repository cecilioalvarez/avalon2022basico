package es.avalon.APIsCore.Genericos.ejemplo6MetodoGenerico;

public class Persona {
    private String nombre;
    private String apellidos;
    private int edad;

public static void andar(){
    System.out.println("La persona esta andando");
}
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
