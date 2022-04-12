package Excepciones.Ejemplo002;

import java.io.File;
import java.io.IOException;

public class Principal {
    public static void main(String[] args) {//
        // throws IOException {
       GestorFichero gf = new GestorFichero();
       gf.CrearFichero("prueba.txt");


    }

}
