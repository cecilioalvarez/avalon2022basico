package es.avalon.APIsCore.Genericos.ejemplo4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Caja <T> implements Iterable<T>{

    protected List<T> lista = new ArrayList();
    protected int tope;

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

    //Se consigue una mayor naturalidad
    @Override
    public Iterator<T> iterator(){
        return lista.iterator();
    }
}
