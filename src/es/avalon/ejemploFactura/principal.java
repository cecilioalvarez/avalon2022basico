package es.avalon.ejemploFactura;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        List<Factura> facturas = new ArrayList<>();
        Scanner sc = null;

        try {
            sc = new Scanner(new File("facturas.txt"));
            while (sc.hasNextLine()){
                String lista = sc.nextLine();
                String[] lis   = lista.split(",");
                Factura f = new Factura (lis[0],lis[1],Integer.parseInt(lis[2]));
                facturas.add(f);
            }
            sc.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        double total = 0;
        for (Factura f: facturas) {
            total = total + f.getImporte();

        }
        System.out.println(total);
    }
}
