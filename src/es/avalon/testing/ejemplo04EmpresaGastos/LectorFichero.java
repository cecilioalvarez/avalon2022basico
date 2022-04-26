package es.avalon.testing.ejemplo04EmpresaGastos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class LectorFichero {

    private File fichero;

    public LectorFichero(File fichero) {
        this.fichero = fichero;
    }


    //Funcion leerLineas de archivo
    public List<String> leerLineas() throws FileNotFoundException {

        List<String> lineas = new ArrayList<>();

        //Creamos un Scanner para el fichero
        try ( Scanner scanner = new Scanner(fichero)){

            //Mientras pueda hacer NextLine
            while (scanner.hasNextLine()) {

                //Copiamos la linea
                String linea = scanner.nextLine();

                //Si contiene el dato empresa
                if(linea.contains("empresa")){

                    //Añadimos la linea al array
                    lineas.add(linea);
                }
            }
        } catch (FileNotFoundException e) {
            throw e;
        }

        return lineas;
    }
}