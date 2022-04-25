package es.avalon.EjemplosPropios.ejemplo1;

public class Casa extends DBObject implements Imprimible{
    private int NumeroHabitaciones;
    private int NumeroPuertas;
    private String Ubicacion;
    private boolean Habitable;

    public Casa(int numeroHabitaciones, int numeroPuertas, String ubicacion, boolean habitable, int id) {
        super(id);
        NumeroHabitaciones = numeroHabitaciones;
        NumeroPuertas = numeroPuertas;
        Ubicacion = ubicacion;
        Habitable = habitable;
    }

    public int getNumeroHabitaciones() {
        return NumeroHabitaciones;
    }

    public void setNumeroHabitaciones(int numeroHabitaciones) {
        NumeroHabitaciones = numeroHabitaciones;
    }

    public int getNumeroPuertas() {
        return NumeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        NumeroPuertas = numeroPuertas;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        Ubicacion = ubicacion;
    }

    public boolean isHabitable() {
        return Habitable;
    }

    public void setHabitable(boolean habitable) {
        Habitable = habitable;
    }

    @Override
    public String getTexto() {
        return "ID: " + this.getId() + ", Ubicacion: "+ this.getUbicacion() + ", Puertas: "+ this.getNumeroPuertas()+ ", habitaciones: "+ this.getNumeroHabitaciones();
    }

    @Override
    public String getSerializedText() {
        return getTexto();
    }
}
