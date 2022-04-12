package es.avalon.excepciones.ejemplo1;

import java.io.IOException;

public class Principal2 {
    public static void main(String[] args){

        GestorFichero gestor=new GestorFichero();
        try {
            gestor.crearFichero("fichero.txt");
            ImprimirResultadoPrograma(true);
        } catch (IOException e) {
           ImprimirResultadoPrograma(false);
        }


    }
    //es como si tengo una ventana
    public static void ImprimirResultadoPrograma(boolean ejecutado){
        if(ejecutado) System.out.println("todo fue muy bien");
        else System.out.println("Todo fue muy mal");
    }


}
