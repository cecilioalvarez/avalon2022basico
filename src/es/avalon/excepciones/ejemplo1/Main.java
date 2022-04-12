package es.avalon.excepciones.ejemplo1;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File fichero = new File ("prueba.txt");
        try {
            fichero.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("todo ok");
            System.out.println(e.getMessage());

        }
        //la clausula "finally" ejecuta tanto si funciona como si salta el error
        finally {
            //Se usa para cerrar algunos recursos que queden pendientes

            System.out.println("El programa termina");
        }
    }
}
