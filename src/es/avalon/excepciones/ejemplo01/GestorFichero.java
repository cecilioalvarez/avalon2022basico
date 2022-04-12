package es.avalon.excepciones.ejemplo01;

import java.io.File;
import java.io.IOException;

public class GestorFichero {

    //En vez de capturar la excepcion, la relanza para que fluya y la capture el que la declare
    //Esto se produce mediante la clausula throws
    public void crearFichero(String nombre) throws IOException {
        File fichero = new File(nombre);
        fichero.createNewFile();
    }

    /*Tambien se podria hacer lo siguiente
    * Donde le hacemos la excepcion en el metodo, y si falla, */
    public void crearFicheroConExcepcion(String nombre) throws IOException {
        try {
            File fichero = new File(nombre);
            fichero.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Excepcion del fichero");
            //Si falla le mandamos igualmente la excepcion
            throw e;
        } finally {
            System.out.println("Cerrando");
        }
    }
}
