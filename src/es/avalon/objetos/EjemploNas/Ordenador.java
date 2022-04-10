package es.avalon.objetos.EjemploNas;

import java.util.Random;

import static es.avalon.objetos.Constant.UNO;

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
        System.out.println("\n El Ordenador: " + getId() + " Está conectado al Nas");
    }

    public void desconectado(){
        tieneNas=false;
        System.out.println("\n El Ordenador: " + getId() + " No está conectado al Nas ");
    }

    public int getId() {
        return idOrdenador;
    }
}
