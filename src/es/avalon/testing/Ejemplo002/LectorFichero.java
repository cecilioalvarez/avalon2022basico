package es.avalon.testing.Ejemplo002;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LectorFichero {
    public LectorFichero(File fichero) {
        this.fichero = fichero;
    }

    private File fichero;

    public List<String> leerLineas() throws FileNotFoundException {
        List<String> lineas = new ArrayList<>();
        //Metodo para leer linea a linea un fichero.
        //Intenta leer un fichero. Si puede lo lee linea a lineay añade cada linea a la lista lineas.
        //Sino puede atrapa la excepcion y la lanza
        try (Scanner scanner = new Scanner(fichero)) {
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                if (linea.contains("empresa")) {
                    lineas.add(linea);

                }
            }
        } catch (FileNotFoundException e) {
            throw e;


        }
        return lineas;


    }
}