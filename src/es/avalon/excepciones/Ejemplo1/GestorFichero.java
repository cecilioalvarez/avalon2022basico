package es.avalon.excepciones.Ejemplo1;

import java.io.File;
import java.io.IOException;

public class GestorFichero {

    public void crearFichero(String nombre) throws IOException {
        File fichero = null;
        fichero = new File(nombre);
        try {
            fichero.createNewFile();
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error");
            System.out.println("El error es: " + e.getMessage());
            throw e;
        } finally {
            System.out.println("El fichero se ha cerrado");
        }
    }
}
