package es.avalon.Colecciones.LeerFichero;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Factura> listaFactura= new ArrayList<>();

        try {
            Scanner scanner = new Scanner((new File("factura.txt")));
            while(scanner.hasNextLine()){
                String linea=scanner.nextLine();
                String[] precio = linea.split(",");
                Factura factura= new Factura();
                factura.setPrecio(Integer.parseInt(precio[2]));
                listaFactura.add(factura);


            }
            float total=0;
            for (Factura factura:listaFactura){
                total+=factura.getPrecio();
            }
            System.out.println(total);


            scanner.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();

        }
    }
}
