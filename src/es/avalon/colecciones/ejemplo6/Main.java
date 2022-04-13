package es.avalon.colecciones.ejemplo6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = null;
        String rutaArchivo = "C:\\Users\\crist\\IdeaProjects\\avalon2022basico\\src\\es\\avalon\\Factura.txt";
        try {
            scanner = new Scanner(new File(rutaArchivo));
            int suma = 0;

            while (scanner.hasNextLine()) {

                String cadenas = scanner.nextLine();
                String[] lista = cadenas.split(",");
                String strnNUM = lista[lista.length - 1];
                int numero = Integer.parseInt(strnNUM.strip());
                suma = suma + numero;
            }
            System.out.println(suma);
            scanner.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


}
