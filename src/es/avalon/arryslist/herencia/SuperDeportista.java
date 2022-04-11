package es.avalon.arryslist.herencia;

public class SuperDeportista extends Deportista{
    private int nivel;
    public SuperDeportista(String nombre, int edad, String deporte,int nivel) {
        super(nombre, edad, deporte);
        this.nivel=nivel;
    }

    @Override
    public void andar() {
        System.out.println(getNombre() + " Anda a 10km hora");
    }
}
