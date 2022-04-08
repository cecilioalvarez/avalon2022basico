package es.avalon.arryslist.uno_muchos;

import es.avalon.arryslist.Telefono;

import java.util.ArrayList;

public class Principal1 {
    public static void main(String[] args) {


        ArrayList<Telefono> lista= new ArrayList<Telefono>();
        lista.add(new Telefono("apple",123456789));
        lista.add(new Telefono("oppo",123489789));
        lista.add(new Telefono("samsung",44442223));
        lista.add(new Telefono("xiaomi",544545433));

        for (int i=0;i<lista.size();i++) {

            System.out.println(lista.get(i).getMarca());
            System.out.println(lista.get(i).getNumero());
        }

        lista.remove(2);
        System.out.println("***************************");
        for (int i=0;i<lista.size();i++) {

            System.out.println(lista.get(i).getMarca());
            System.out.println(lista.get(i).getNumero());
        }


    }
}
