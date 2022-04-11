package es.avalon.objetos.Ejemplo17;

public class Persona {
    private String nombre;
    private static int contador;
    private int contador2;

    public Persona(String nombre) {
        this.nombre = nombre;
        contador++;
        contador2++;
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

    public int getContador2() {
        return contador2;
    }

    public void setContador2(int contador2) {
        this.contador2 = contador2;
    }
}
