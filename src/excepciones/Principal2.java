package excepciones;

import java.io.IOException;

public class Principal2 {
    public static void main(String[] args) {
        try {
            GestorFichero gestorFichero = new GestorFichero();
            gestorFichero.CrearFichero("j:/prueba.txt");
        } catch (IOException e) {
            System.out.println("Error al crear el fichero");
        } finally {
            System.out.println("finalizar programa");
        }
    }
}
