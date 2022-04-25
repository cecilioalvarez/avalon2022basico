package es.avalon.EjemplosPropios.ejemplo2GenericosConInterfaces;

public class Jugador implements Unit {
    private int vida= 100;
    private int puntuacion = 0;

    public int getVida() {
        return vida;
    }

    @Override
    public String getNombre() {
        return "Jugador";
    }

    public void quitarVida(int damage){
        vida -= damage;
    }

    @Override
    public boolean estaMuerto() {
        return vida <= 0;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }
}
