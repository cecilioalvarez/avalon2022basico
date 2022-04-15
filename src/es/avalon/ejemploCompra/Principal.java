package es.avalon.ejemploCompra;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Compra> compras = new ArrayList<>();
        compras.add(new CompraConIva(1,"compra1",100));
        compras.add(new CompraSinIVA(2,"compra1",100));
        compras.add(new CompraIvaReducido(3,"compra1",100));

        double total = 0;

        for (int i = 0;i<compras.size();i++){
            total = total + compras.get(i).getImporteConIVA();

        }
        System.out.println(total);

    }
}
