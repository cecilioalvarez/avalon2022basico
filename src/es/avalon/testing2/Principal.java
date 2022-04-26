package es.avalon.testing2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("filename"));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}

