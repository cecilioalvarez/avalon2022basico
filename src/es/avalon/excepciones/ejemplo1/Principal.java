package es.avalon.excepciones.ejemplo1;

import java.io.File;
import java.io.IOException;

public class Principal {
    public static void main(String[] args){

        try {
        File fichero=new File("j:/prueba.txt");
            fichero.createNewFile();
        } catch (IOException e) {

            System.out.println("Hay un error");
            System.out.println(e.getMessage());

            //operar y decidir que mas hacer
            System.out.println("Enviando un correo a sistemas");

        }finally {
            //cerrar algunos recursos que queden pendientes
            System.out.println("El programa termina, la oficina apaga las luces a las 8");

        }



    }
}
