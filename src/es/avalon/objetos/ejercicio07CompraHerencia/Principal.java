package es.avalon.objetos.ejercicio07CompraHerencia;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        ArrayList<Compra> compras = new ArrayList<>();

        compras.add(new CompraConIVA(1, "Ordenador", 100));
        compras.add(new CompraSinIVA(1, "Ordenador", 100));
        compras.add(new CompraIVAReducido(1, "Ordenador", 100));


        double total = 0;
        for(int i=0; i<compras.size(); i++){
            total+= compras.get(i).getImporteConIVA();
        }

        System.out.println(total);

    }
}
