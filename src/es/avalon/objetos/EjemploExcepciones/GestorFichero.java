package es.avalon.objetos.EjemploExcepciones;

import java.io.File;
import java.io.IOException;

public class GestorFichero {


    public void crearFichero(String nombre) throws IOException{

        File fichero = new File(nombre);
        fichero.createNewFile();

    }
}
