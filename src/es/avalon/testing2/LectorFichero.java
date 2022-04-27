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

    public List<String> leerLineas() throws FileNotFoundException {
        List<String> lineas = new ArrayList<>();

        try ( Scanner scanner = new Scanner(fichero)){
            while (scanner.hasNextLine()) {
                String linea=scanner.nextLine();
                if(linea.contains("empresa")) {
                    lineas.add(linea);
                }

            }
        } catch (FileNotFoundException e) {
            throw e;
        }

        return lineas;
    }
}
