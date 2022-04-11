package es.avalon.objetos.Ejemplo19;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Compra> compras=new ArrayList<>();
        compras.add(new CompraSinIva(100,"ordenador",1));
        compras.add(new CompraIVA(100,"avion",2));
        compras.add(new CompraIVA(100,"mesa",3));
        compras.add(new CompraSuperreducido(100,"medicamentos",1));

        double total=0;
        for (int i=0;i<compras.size();i++){
            total=total+compras.get(i).getImporte1();
            System.out.println(compras.get(i).getImporte1());
        }
        System.out.println(total);

    }
}
