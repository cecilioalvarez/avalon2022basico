package excepciones;

import java.io.File;
import java.io.IOException;

public class Principal {

    public static void main(String[] args) {
        try {
            File fichero = new File("prueba.txt");
            fichero.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //cerrar algunos recursos que queden pendientes
            System.out.println("el Programa termina");
        }
    }
}
