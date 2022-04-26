package es.avalon.Objetos.EjemploHerencia;

public class SuperDeportista extends Deportista{
    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    private int nivel;

    public SuperDeportista(String nombre, int edad, String deporte, int nivel) {
        super(nombre, edad, deporte);
        this.nivel=nivel;
    }
    @Override
    public void andar(){
        System.out.println(getNombre() + " anda a 10Km/H");
    }
}
