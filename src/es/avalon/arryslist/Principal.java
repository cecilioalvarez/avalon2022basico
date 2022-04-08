package es.avalon.arryslist;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        ArrayList<Telefono> lista = new ArrayList<Telefono>();
        lista.add(new Telefono("Note9",123));
        lista.add(new Telefono("Note10",1234));
        lista.add(new Telefono("Note11",1235));
        lista.add(new Telefono("Note12",1236));
        lista.add(new Telefono("Note13",1237));

        for (int i =0 ; i<lista.size();i++){

            System.out.println(lista.get(i).getMarca());
            System.out.println(lista.get(i).getNumero());

        }

        lista.remove(2);

        System.out.println("**************");

        for (int i =0 ; i<lista.size();i++){

            System.out.println(lista.get(i).getMarca());
            System.out.println(lista.get(i).getNumero());

        }

    }

}
