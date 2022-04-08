package es.avalon.objetos.EjemploObjetos008;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        ArrayList<Telefono> lista = new ArrayList<Telefono>();
        lista.add(new Telefono("apple", 12365482));
        lista.add(new Telefono("xiaomi", 12365556));
        lista.add(new Telefono("samsung", 12364556));
        lista.add(new Telefono("apple", 12365892));

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getMarca());
            System.out.println(lista.get(i).getNumero());
        }

        lista.remove(2);
        System.out.println("**********");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getMarca());
            System.out.println(lista.get(i).getNumero());
        }


    }
}
