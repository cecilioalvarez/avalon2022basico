package es.avalon.excepciones.ejemplo1;

import java.io.IOException;

public class Principal2 {
    public static void main(String[] args) {

        GestorFichero gestor= new GestorFichero();
        try {
            gestor.crearFichero("j:/fichero.txt");
            imprimirResultadoPrograma(true);
        } catch (IOException e) {
           imprimirResultadoPrograma(false);
        }





    }
    // es como si tengo una ventana
    public static void imprimirResultadoPrograma(boolean ejecutado) {

            if (ejecutado) System.out.println("todo fue muy bien");
            else System.out.println("todo fue muy mal");
    }


}
