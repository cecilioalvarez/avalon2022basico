package es.avalon.objeto.ejemplo15;

public class SupeDeportista extends Deportista{

    private int nivel;

    public SupeDeportista(String nombre, int edad, String deporte, int nivel) {
        super(nombre, edad, deporte);
        this.nivel = nivel;
    }

    @Override
    public void andar() {

        System.out.println(getNombre() + " anda a 10km hora");
    }
}
