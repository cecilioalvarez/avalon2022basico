package es.avalon.objetos.ejemplo14;

public class DiscoDuro {

    private String NombreHDD;
    private int Capacidad;

    public DiscoDuro(String nombre, int capacidad) {
        NombreHDD = nombre;
        Capacidad = capacidad;
    }

    public String getNombre() {
        return NombreHDD;
    }

    public void setNombre(String nombre) {
        NombreHDD = nombre;
    }

    public int getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(int capacidad) {
        Capacidad = capacidad;
    }
}
