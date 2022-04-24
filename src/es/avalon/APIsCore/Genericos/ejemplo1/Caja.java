package es.avalon.APIsCore.Genericos.ejemplo1;

import java.util.ArrayList;
import java.util.List;

public class Caja<T> {
    private List<T> lista = new ArrayList();
    private int tope;

    public Caja(int tope) {
        super();
        this.tope = tope;
    }

    public void add(T elemento) {
        if (lista.size() < tope) {

            lista.add(elemento);
        }
    }

    public void borrar(T elemento) {
        lista.remove(elemento);
    }

    public List<T> getLista() {
        return lista;
    }

    public void setLista(List<T> lista) {
        this.lista = lista;
    }
}
