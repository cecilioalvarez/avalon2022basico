package es.avalon.objetos.ejemplo08ArrayListObjetos;

import es.avalon.objetos.ejemplo07ObjetosAnidados.Telefono;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        ArrayList<Telefono> lista = new ArrayList<Telefono>();

        lista.add(new Telefono("Apple", 123456789));
        lista.add(new Telefono("Samsung", 789456123));
        lista.add(new Telefono("Lenovo", 987654321));
        lista.add(new Telefono("Xiaomi", 456789123));


        for (int i=0; i<lista.size(); i++){
            System.out.println(lista.get(i).getMarca());
            System.out.println(lista.get(i).getNumero());
        }

        lista.remove(2);

        System.out.println("*********");

        for (int i=0; i<lista.size(); i++){
            System.out.println(lista.get(i).getMarca());
            System.out.println(lista.get(i).getNumero());
        }
    }
}
