package es.avalon.objetos.Ejemplo15;

public class SuperDeportista extends Deportista{
    private int nivel;

    public SuperDeportista(String nombre, int edad, String deporte, int nivel) {
        super(nombre, edad, deporte);
        this.nivel = nivel;
    }

    @Override
    public void andar() {
        System.out.println(getNombre()+" anda a 15km/h");
    }
}
