package es.avalon.colecciones.ejemplo7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {


        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("facturas.txt"));
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
