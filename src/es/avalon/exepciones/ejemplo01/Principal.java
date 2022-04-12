package es.avalon.exepciones.ejemplo01;

import java.io.File;
import java.io.IOException;

public class Principal {
    public static void main(String[] args) {
        File fichero=new File("j:/prueba txt");
        try {
            fichero.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("hay un error");
            System.out.println(e.getMessage());
        }finally {
            System.out.println("el programa termina");
        }

    }
    }

