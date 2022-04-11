package Objetos.Ejemplo019;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
//        IVA0 uno = new IVA0(100);
//        IVA10 dos = new IVA10(100);
//        IVA21 tres = new IVA21(100);
//
//        System.out.println(uno.valor()+" i: "+uno.getIvaImporte());
//        System.out.println(dos.valor()+" i: "+dos.getIvaImporte());
//        System.out.println(tres.valor()+" i: "+tres.getIvaImporte());

        ArrayList<Compra> compras = new ArrayList<>();
        compras.add(new IVA0(1,"pc",1000));
        compras.add(new IVA10(1,"pc",1000));
        compras.add(new IVA21(1,"pc",1000));
        double total=0;
        /*for(int i = 0; i < compras.size(); i++) {
            System.out.println("valor real: "+compras.get(i).valor()+" valor mas importe: "+compras.get(i).getIvaImporte());
            total+=compras.get(i).getIvaImporte();
        }*/
        System.out.println(total);

    }
}
