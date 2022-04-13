package es.avalon.ManejoExcepciones.Excepciones2;

import java.io.File;
import java.io.IOException;

public class GestorFichero {

    // en vez de capturar la excepcion la relanza
    public void crearFichero(String nombre) throws IOException {

        try {
            File fichero = new File(nombre);
            fichero.createNewFile();
        } catch (IOException e) {

            System.out.println("ha ocurrido un error:");
            System.out.println("el error es "+e.getMessage());

            // operar y decidir que mas hacer
            System.out.println("enviando un correo  a sistemas ");
            throw e;

        }finally {
            //cerrar algunos recursos que queden pendientes
            System.out.println("el fichero se cierra");
        }


    }
}
