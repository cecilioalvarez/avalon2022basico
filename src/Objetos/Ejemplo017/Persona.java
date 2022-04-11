package Objetos.Ejemplo017;

public class Persona {
    private String nombre;
    private static int contador;

    public Persona(String nombre) {
        this.nombre = nombre;
        Persona.contador++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Persona.contador = contador;
    }
}
