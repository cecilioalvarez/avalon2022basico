package Objetos.Ejemplo011;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Telefono> lista = new ArrayList();
        lista.add(new Telefono("samsung", 3125260));
        lista.add(new Telefono("apple", 325335));
        lista.add(new Telefono("xiami", 953268));
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getMarca());
            System.out.println(lista.get(i).getNumero());
        }
        lista.remove(1);
        System.out.println("***************************");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getMarca());
            System.out.println(lista.get(i).getNumero());
        }
    }
}
