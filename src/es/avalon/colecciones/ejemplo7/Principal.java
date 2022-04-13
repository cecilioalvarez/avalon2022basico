package es.avalon.colecciones.ejemplo7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        List<Factura> facturas= new ArrayList<>();

        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("facturas.txt"));
            while (scanner.hasNextLine()) {
                String linea=scanner.nextLine();
                String[] items= linea.split(",");
                Factura f= new Factura(items[0],items[1], Integer.parseInt(items[2]));
                facturas.add(f);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        for (Factura f : facturas) {

            System.out.println(f.getImporte());
        }
    }
}
