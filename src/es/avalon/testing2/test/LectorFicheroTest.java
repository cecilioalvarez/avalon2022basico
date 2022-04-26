package es.avalon.testing2.test;

import es.avalon.testing2.LectorFichero;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LectorFicheroTest {

    @Test
    @DisplayName("leer lineas de fichero")
    public void leerLineasTest() {
        //arrange preprar el codigo
        LectorFichero lector= new LectorFichero(new File("gastos.txt"));
        //actuar ACT
        try {
            List<String> lineas=lector.leerLineas();
            //verificar Assert
            assertTrue(lineas.size()>=1);
            assertTrue(lineas.get(0).contains("empresa"));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

    @Test
    @DisplayName("leer lineas de fichero vacio")
    public void leerLineasFicheroLineasVaciasTest() {
        //arrange preprar el codigo
        LectorFichero lector= new LectorFichero(new File("gastosvacio.txt"));
        //actuar ACT
        try {
            List<String> lineas=lector.leerLineas();
            //verificar Assert
            assertTrue(lineas.size()==0);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

    @Test
    @DisplayName("excepcion al no existir el fichero")
    public void noExisteFicheroTest() {
        //arrange preprar el codigo
        LectorFichero lector= new LectorFichero(new File("noexiste.txt"));

        Assertions.assertThrows(FileNotFoundException.class, () -> {
            lector.leerLineas();
        });


    }


}
