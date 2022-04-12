package es.avalon.excepciones.Ejemplo1;

import java.io.File;
import java.io.IOException;

public class Principal {
    public static void main(String[] args) {

        try {
            File fichero=new File("j:/prueba.txt");
            fichero.createNewFile();
        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("hay un error");
            System.out.println(e.getMessage());
        }finally {
            System.out.println("El programa termina");
        }

    }
}
