package es.avalon.objetos.ejemplo11;

import java.util.ArrayList;

public class principal {
    public static void main(String[] args) {
        ArrayList <telefono>lista=new ArrayList<telefono>();
        lista.add(new telefono("aple",2121212));
        lista.add(new telefono("apoo",2332133));
        lista.add(new telefono("xiamo",231221));
        lista.add(new telefono("huamwe",82177272));

        for (int i=0;i<lista.size();i++){
            System.out.println(lista.get(i).getMarca());
            System.out.println(lista.get(i).getNumero());
        }
        lista.remove(2);
        System.out.println("+++++++++++++++++++++++++");
        for (int i=0;i<lista.size();i++){
            System.out.println(lista.get(i).getMarca());
            System.out.println(lista.get(i).getNumero());

    }
}}
