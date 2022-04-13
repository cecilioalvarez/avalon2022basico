package es.avalon.colecciones.Ejemplo006;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = null;
        List<Factura>facturas=new ArrayList<>();


        try {
            scanner = new Scanner(new File("facturas"));


            while (scanner.hasNextLine()) {
                String linea=(scanner.nextLine());
                System.out.println(linea);

                String[] items=linea.split(",");//Convierte una cadena de texto en segmentos.En este caso separados por coma
                System.out.println("............");
                System.out.println(items[0]+" "+items[1]+" "+items[2]);
                Factura f=new Factura(items[0],items[1],Integer.parseInt(items[2]) );
                facturas.add(f);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int total=0;
        for (Factura f: facturas){
            total+=f.getImporte();
        }
        System.out.println(total);


    }




}
