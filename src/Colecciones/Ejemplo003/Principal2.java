package Colecciones.Ejemplo003;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal2 {
    public static void main(String[] args) {
        ArrayList<Factura> ls = new ArrayList<>();
        try {
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
            System.out.println("total ventas: "+total);
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
