package es.avalon.ManejoExcepciones.EjemploExcepciones;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {


        try {
            GestorFichero gestor = new GestorFichero();
            gestor.crearFichero("j:/prueba.txt");
        }catch (IOException e){
            e.printStackTrace();
        }finally{
            System.out.println("El programa termina");
        }

    }
}
