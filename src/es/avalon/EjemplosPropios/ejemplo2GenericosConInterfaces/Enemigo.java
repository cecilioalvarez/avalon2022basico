package es.avalon.EjemplosPropios.ejemplo2GenericosConInterfaces;

public class Enemigo implements Unit{

    private int vida= 100;
    private int fuerza;
    private String nombre;
    private boolean muerto = false;

    public Enemigo(String nombre, int fuerza) {
        this.nombre = nombre;
        this.fuerza = fuerza;
    }

    public int getVida() {
        return vida;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void quitarVida(int damage){
        vida -= damage;
        if (vida <= 0) {
            muerto = true;
        }
    }

    public boolean estaMuerto() {
        return muerto;
    }

}

