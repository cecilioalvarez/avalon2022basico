package es.avalon.excepciones.ejemplo1;

import java.io.File;
import java.io.IOException;

public class GestorFichero {

    // en vez de capturar la excepcion la relanza
    public void crearFichero(String nombre) throws IOException {
        try {

        File fichero = new File(nombre);
        fichero.createNewFile();
        } catch (IOException e) {
           System.out.println("ha ocurrido un erro:");
           System.out.println("el error es"+e.getMessage());
           //operar y decidir que hacer
            System.out.println("enviar un correo a sistema");
            throw e;
        }finally {
            //cerrar algunos recursos que queden pendiente
            System.out.println("el fichero se cierra");
        }


    }
}