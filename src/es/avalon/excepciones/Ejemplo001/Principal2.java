package es.avalon.excepciones.Ejemplo001;

import java.io.IOException;

public class Principal2 {
    public static void main(String[] args) {

        try {
            GestorFichero gestor=new GestorFichero();
            gestor.crearFichero("fichero.txt");
            imprimirEstado(true);

        } catch (IOException e) {
            imprimirEstado(false);

        }finally {
            System.out.println("el fichero se cierra");
        }


    }
    public static void imprimirEstado (boolean resultado){
        if (resultado){
            System.out.println("Todo ha ido bien");
        }else{
            System.out.println("Todo ha ido mal");
        }
    }
}
