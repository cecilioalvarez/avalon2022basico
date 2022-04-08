package es.avalon.objetos.ejemplo11;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<Telefono> lista = new ArrayList<Telefono>();
        lista.add(new Telefono("apple", 321654987));
        lista.add(new Telefono("Samsung", 327774987));
        lista.add(new Telefono("Xiaomi", 321333987));
        lista.add(new Telefono("Oppo", 321655557));
        for (int i=0;i<lista.size();i++){
            System.out.println(lista.get(i).getMarca());
            System.out.println(lista.get(i).getNumero());
        }
        lista.remove(2);
        System.out.println ("**********************");
        for (int i=0;i<lista.size();i++){
            System.out.println(lista.get(i).getMarca());
            System.out.println(lista.get(i).getNumero());
        }
    }
}
