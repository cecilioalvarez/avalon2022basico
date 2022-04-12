package es.avalon.objetos.EjemploInterfaz2;

public class Musica  implements  Reproducible{

    private int pista;

    public int getPista() {
        return pista;
    }

    public void setPista(int pista) {
        this.pista = pista;
    }

    public Musica(int pista) {
        this.pista = pista;
    }

    @Override
    public void play() {
        System.out.println("Comienza la musica");
    }

    @Override
    public void stop() {
        System.out.println("Detenida la musica");
    }

    @Override
    public void siguiente() {
        System.out.println("Siguiente pista");
    }

    @Override
    public void atras() {
        System.out.println("Volver a la pista anterior");
    }

}
