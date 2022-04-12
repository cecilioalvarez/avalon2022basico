package es.avalon.excepciones.ejemplo1;

import java.io.File;
import java.io.IOException;

public class Principal {

    public static void main(String[] args) {

        try {
            File fichero = new File("j:/prueba.txt");
            fichero.createNewFile();
        } catch (IOException e) {

            System.out.println("ha ocurrido un error:");
            System.out.println("el error es "+e.getMessage());

            // operar y decidir que mas hacer
            System.out.println("enviando un corroe a sistemas ");

        }
        finally {
            //cerrar algunos recursos que queden pendientes
            System.out.println("el programa termina la oficiona apaga las luces a las 8");
        }

    }
}
