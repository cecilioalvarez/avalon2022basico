package es.avalon.excepciones.ejemplo1;

import java.io.File;
import java.io.IOException;

public class Principal {
    public static void main(String[] args) {
        try {

        File fichero = new File("j:/prueba.txt");

            fichero.createNewFile();
        } catch (IOException e) {

            System.out.println("ha ocurrido un error");
            System.out.println("el error es"+e.getMessage());
            System.out.println("enviando un correo a sistema");
            //operar y decidir que mas hacer

        }finally {
            //cerrar algunos recursos que queden pendientes
            System.out.println("el programa termina la oficina apaga las luces a la 8");

        }
    }
}
