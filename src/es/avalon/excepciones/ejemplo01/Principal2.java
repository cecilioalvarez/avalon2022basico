package es.avalon.excepciones.ejemplo01;

import java.io.IOException;

public class Principal2 {

    public static void main(String[] args) {

        GestorFichero gestor = new GestorFichero();

        //Este metodo nos devuelve la excepcion directamente
        /*try {
            gestor.crearFichero("prueba.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }*/


        //Usamos metodo que contiene excepcion pero que a su vez lo encapsulamos por que nos la devuelve
        /*try {
            gestor.crearFicheroConExcepcion("prueba.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        try {
            gestor.crearFichero("prueba.txt");
            imprimirResultadoPrograma(true);
        } catch (IOException e) {
            imprimirResultadoPrograma(false);
        }
    }


    public static void imprimirResultadoPrograma(boolean ejecutado){
        if(ejecutado) System.out.println("todo fue muy bien");
        else System.out.println("Todo fue muy mal");
    }
}
