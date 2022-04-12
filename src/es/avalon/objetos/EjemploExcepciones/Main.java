package es.avalon.objetos.EjemploExcepciones;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        File fichero = new File("prueba.txt");
        try {
            fichero.createNewFile();
        } catch (IOException e) {

            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }finally{
            System.out.println("El programa termina");
        }

    }
}
