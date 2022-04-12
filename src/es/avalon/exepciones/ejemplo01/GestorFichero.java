package es.avalon.exepciones.ejemplo01;

import java.io.File;
import java.io.IOException;

public class GestorFichero {

    public void crearFichero(String nombre) throws IOException{
        try {
            File fichero=new File(nombre);
            fichero.createNewFile();

        } catch (IOException e) {
            System.out.println("exepcion de fichero");
            throw e;
        }finally {
            System.out.println("cerrando el fichero");
        }

    }

}
