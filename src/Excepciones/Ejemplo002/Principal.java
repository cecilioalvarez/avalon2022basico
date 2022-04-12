package Excepciones.Ejemplo002;

import java.io.File;
import java.io.IOException;

public class Principal {
    public static void main(String[] args) {//
        // throws IOException {

        try {
            GestorFichero gf = new GestorFichero();
            gf.CrearFichero("y:/prueba.txt");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("todo mal");
        }
        System.out.println("todo ok");


    }

}
