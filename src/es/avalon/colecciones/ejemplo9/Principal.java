package es.avalon.colecciones.ejemplo9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {

        List<Factura> factura= new ArrayList<>();

        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("factura.txt"));
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                String[] items = linea.split(",");
                Factura f = new Factura(items[0], items[1], Integer.parseInt(items[2]));
                factura.add(f);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        double total=0;
        for (Factura f : factura) {
            total=total+ f.getPrecio();

        }
        System.out.println(total);

    }

}
