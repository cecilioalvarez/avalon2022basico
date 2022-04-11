package es.avalon.objetos.ejemplo19;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args){
        ArrayList<Compra> compras=new ArrayList<>();
        compras.add(new CompraConIva(1,"Ordenador",100));
        compras.add(new CompraSinIva(1,"Ordenador",100));
        compras.add(new CompraConIvaReducido(1,"Ordenador",100));

        double total=0;
        for (int i=0;i< compras.size();i++){
            total=total+compras.get(i).getImporteConIVA();
        }
        System.out.println(total);

    }
}
