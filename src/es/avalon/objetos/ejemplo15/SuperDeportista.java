package es.avalon.objetos.ejemplo15;

public class SuperDeportista extends Deportista{
    private int nivel;

    public SuperDeportista(String name, int edad, String deporte, int nivel) {
        super(name, edad, deporte);
        this.nivel = nivel;
    }

    @Override
    public void andar() {
        System.out.println(getName() + " Anda a 10km/h");
    }
}
