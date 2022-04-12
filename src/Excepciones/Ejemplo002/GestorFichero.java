package Excepciones.Ejemplo002;

import java.io.File;
import java.io.IOException;

public class GestorFichero {
    public void CrearFichero(String ruta) throws IOException {

        try {
            File fichero = new File(ruta);
            fichero.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }finally {
            System.out.println("el fichero se cierra");
        }
    }
}
