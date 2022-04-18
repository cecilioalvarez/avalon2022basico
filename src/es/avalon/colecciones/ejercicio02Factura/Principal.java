package es.avalon.colecciones.ejercicio02Factura;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        //ArrayList que almacenara las facturas
        ArrayList<Factura> facturas = new ArrayList<>();

        //Creamos objeto Scanner
        Scanner scanner = null;
        try {
            //Accedemos al archivo
            scanner = new Scanner(new File("facturas.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (scanner.hasNextLine()) {
            //Partimos la linea con los datos
            String[] datosFactura = scanner.nextLine().split(",");

            //Creamos facturas con los datos sabiendo que [0] = id (int) // [1] = articulo (String) // [2] = precio (Double)
            facturas.add(new Factura(Integer.parseInt(datosFactura[0]), datosFactura[1],Double.parseDouble(datosFactura[2])));
        }
        //Cerramos Scanner
        scanner.close();

        int total = 0;
        System.out.println("Facturas de 2022");
        System.out.println("Id - Articulo - Importe");

        //Por ultimo, recorremos array de facturas y sumamos importes
        for(Factura factura:facturas){
            System.out.println(factura.getId() + " - " + factura.getArticulo() + " - " + factura.getImporte());
            total+= factura.getImporte();
        }

        System.out.println("\n\nEl importe completo de las facturas es: " + total + " €");


    }

}
