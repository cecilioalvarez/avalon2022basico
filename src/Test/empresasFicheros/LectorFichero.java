package Test.empresasFicheros;

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

            if (scanner.hasNextLine() ) {
                if (!scanner.nextLine().contains("empresa")) return lineas;
            }

            while (scanner.hasNextLine()) {
                lineas.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw e;
        }

        return lineas;
    }
}

