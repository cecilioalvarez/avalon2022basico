package es.avalon.objetos.ejemplo19;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Compra> compras = new ArrayList<>();
        compras.add(new ConIVA(100, 5, "Ordenador"));
        compras.add(new SinIVA(100, 5, "Ordenador"));
        compras.add(new ReducidoIVA(100, 5, "Ordenador"));

        double total=0;

        for(int i = 0; i<compras.size();i++){

            total=total +compras.get(i).getPrecio();
        }
        System.out.println(total);
    }
}
