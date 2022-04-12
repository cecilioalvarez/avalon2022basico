package es.avalon.excepciones.ejemplo1;

import java.io.File;
import java.io.IOException;

public class GestorFichero {
    public void crearFichero(String nombre) throws IOException {

        try {

            File fichero = new File(nombre);
            fichero.createNewFile();
        } catch (IOException e) {
            System.out.println("Problemas a la hora de crear fichero" + e.getMessage());
            throw e;
        }finally{
            System.out.println("El fichero se cierra");
        }
    }
}