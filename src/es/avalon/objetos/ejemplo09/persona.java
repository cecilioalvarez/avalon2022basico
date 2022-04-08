package es.avalon.objetos.ejemplo09;

public class persona {
    private String nombre;
    private int edad;
    private telefono tele;

    public telefono getTele() {
        return tele;
    }

    public void setTele(telefono tele) {
        this.tele = tele;
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

    public persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}
