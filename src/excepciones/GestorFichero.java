package excepciones;

import java.io.File;
import java.io.IOException;

public class GestorFichero {

    public void CrearFichero(String nombre) throws IOException {

        try {
            File fichero = new File(nombre);
            fichero.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        } finally {
            System.out.println("Cerrando el programa");
        }

    }
}
