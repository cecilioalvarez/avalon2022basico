package es.avalon.exepciones.ejemplo01;

import java.io.IOException;

public class Principal2 {
    public static void main(String[] args) {
        GestorFichero gestor=new GestorFichero();
        try {

            gestor.crearFichero("prueeba.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            System.out.println("todo termino");
        }
    }
}
