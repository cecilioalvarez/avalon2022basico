package es.avalon.objetos.EjemploIVA;

import java.util.ArrayList;

import static es.avalon.objetos.Constant.CERO;
import static es.avalon.objetos.Constant.UNO;

public class Main {
        public static void main(String[] args) {
            ArrayList<Compra> compra= new ArrayList<>();
            compra.add(new ivaGeneral(UNO,"ordenador",100)); //121
            compra.add(new ivaReducido(UNO,"ordenador",100));//110
            compra.add(new ivaExento(UNO,"ordenador",100)); //100


            double totalCompra=CERO;

            for (int x=CERO;x<compra.size();x++) {

                totalCompra=totalCompra+ compra.get(x).getImporteConIVA();
            }
            System.out.println(totalCompra);
        }
}
