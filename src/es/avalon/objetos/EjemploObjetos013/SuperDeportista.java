package es.avalon.objetos.EjemploObjetos013;

public class SuperDeportista extends Deportista{
    private int nivel;

    public SuperDeportista(String nombre, int edad, String deporte) {
        super(nombre, edad, deporte);
    }

    @Override
    public void andar() {
        System.out.println(getNombre() + " Anda a 15kmh ");
    }
}
