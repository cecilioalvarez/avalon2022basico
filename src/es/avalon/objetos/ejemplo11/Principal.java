package es.avalon.objetos.ejemplo11;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

            ArrayList<Telefono> lista= new ArrayList<Telefono>();
            lista.add(new Telefono("apple",123456789));
            lista.add(new Telefono("oppo",905150629));
            lista.add(new Telefono("samsung",496466663));
            lista.add(new Telefono("xiaomi",987654321));

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
