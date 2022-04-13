package es.avalon.colecciones.ejemplo9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;

public class Principal2 {
    public static <Iterador> void main(String[] args) {

        List<Factura> factura= new ArrayList<>();

        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("facturas.txt"));
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
//es un patro diseño como recorrer una lista que no tengo claro su tamaño
        Iterator<Factura> it = factura.iterator();
        while (it.hasNext()) {
            Factura f = it.next();
            System.out.println(f.getPrecio());
        }
//sistaxis sugar sobre iteradorse
//bucle for bucle foreach
        for (Factura f: factura) {
            System.out.println(f.getPrecio());
        }
    }

}