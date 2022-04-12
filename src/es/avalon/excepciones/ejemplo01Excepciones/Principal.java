package es.avalon.excepciones.ejemplo01Excepciones;

import java.io.File;
import java.io.IOException;

public class Principal {

    public static void main(String[] args) {

        File fichero = new File("Prueba.txt");
        try{
            fichero.createNewFile();
            System.out.println("Todo OK");
        }catch (IOException e){
            e.printStackTrace();
            System.out.println("Ha ocurrido un error: ");
            System.out.println("El error es " + e.getMessage());
            System.out.println("Enviando un correo a sistemas");
        }finally {
            //Esta clausula se ejecuta siempre, se produzca o no el error
            // Usarlo comunmente para cerrar algunos recursos que queden pendientes
            System.out.println("El programa termina");
        }

    }
}
