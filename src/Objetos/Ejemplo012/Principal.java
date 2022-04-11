package Objetos.Ejemplo012;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Productos p = new Productos("leche",122);
        Productos p1 = new Productos("pan",222);
        Productos p2 = new Productos("queso",189);

        Bolsa bols = new Bolsa("verde",156);
        bols.add(p);
        bols.add(p1);
        bols.add(p2);

        ArrayList<Productos> lista = bols.getPro();
        System.out.println("Bolsa "+bols.getColor()+":  "+bols.getPeso());
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Producto:");
            System.out.println(lista.get(i).getNombre());
            System.out.println(lista.get(i).getPrecio());

        }
        System.out.println(bols.total());
    }
}
