package es.avalon.testing2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LectorFichero {
    private File fichero;

    public LectorFichero(File fichero) {
        this.fichero = fichero;
    }

    public List<String> leerLineas() {
        List<String> lineas = new ArrayList<>();
        Scanner scanner = null;
        try {
            scanner = new Scanner(fichero);
            while (scanner.hasNextLine()) {
                lineas.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return lineas;
    }
}
