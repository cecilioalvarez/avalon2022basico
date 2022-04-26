package es.avalon.Objetos.EjemploNas;

public class Ordenador {

    private int idOrdenador;
    private boolean tieneNas;


    public int getIdOrdenador() {
        return idOrdenador;
    }

    public void setIdOrdenador(int idOrdenador) {
        this.idOrdenador = idOrdenador;
    }


    public void conectado(){
        tieneNas= true;
        System.out.println("\n El Ordenador Nº" + getId() + " Está conectado al Nas");
    }

    public void desconectado(){
        tieneNas=false;
        System.out.println("\n El Ordenador Nº" + getId() + " No está conectado al Nas ");
    }

    public int getId() {
        return idOrdenador;
    }
}
