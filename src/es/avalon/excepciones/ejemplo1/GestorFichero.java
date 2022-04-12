package es.avalon.excepciones.ejemplo1;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;

public class GestorFichero {

    public void crearFichero(String Nombre) throws IOException {

        try {
            File fichero=new File(Nombre);
            fichero.createNewFile();
        } catch (IOException e) {

            System.out.println("Hay un error");
            System.out.println(e.getMessage());

            //operar y decidir que mas hacer
            System.out.println("Enviando un correo a sistemas");
            throw e;

        }finally {
            //cerrar algunos recursos que queden pendientes
            System.out.println("El fichero se cierra");

        }
    }

}
