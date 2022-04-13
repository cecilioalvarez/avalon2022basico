package Colecciones.Ejemplo003;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Principal2 {
    public static void main(String[] args) {

        try {
            ArrayList<Factura> ls = new ArrayList<>();
            Scanner sc= new Scanner(new File("facturas.txt"));
            while (sc.hasNextLine()){
                String texto =sc.nextLine();
                String[] valores = texto.split(",");
                ls.add(new Factura(Integer.parseInt(valores[0]),valores[1],Integer.parseInt(valores[2])));
            }

            int total =0;

            for (int i = 0; i < ls.size(); i++) {
                System.out.println(ls.get(i).getNumero()+" "+ls.get(i).getConcepto()+" "+ls.get(i).getValor());
                total= total+ls.get(i).getValor();
            }

            Iterator <Factura> it = ls.iterator();
            System.out.println("Iterator");
            while (it.hasNext()){

                Factura f = it.next();
                System.out.println(f.getValor());
            }

            System.out.println("total ventas: " + total);
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
