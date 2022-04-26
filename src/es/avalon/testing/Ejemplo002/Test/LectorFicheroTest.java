package es.avalon.testing.Ejemplo002.Test;

import es.avalon.testing.Ejemplo002.LectorFichero;
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
    @DisplayName("Leer lineas de fichero")
    public void leerLineasTest() throws FileNotFoundException {
        //Esta es la parte de arrange "preparar el codigo"
        LectorFichero lector=new LectorFichero(new File("gastos.txt"));
        //actuar ACT

            List<String>lineas=lector.leerLineas();
            //verificar que es Assert
            //assertEquals(3,lineas.size());
            //assertTrue(lineas.size()>=3);
            assertTrue(lineas.get(0).contains("empresa"));


    }

    @Test
    @DisplayName("Leer lineas de fichero vacio")
    public void leerLineasVacioTest() throws FileNotFoundException {
        //Esta es la parte de arrange "preparar el cof¡digo"
        LectorFichero lector=new LectorFichero(new File("gastosvacio.txt"));
        //actuar ACT

            List<String>lineas=lector.leerLineas();
            //verificar que es Assert
            //assertEquals(3,lineas.size());
            System.out.println(lineas.size());
            assertTrue(lineas.size()==0);



    }
    @Test
    @DisplayName("Leer lineas de fichero que no existe")
    public void noExisteFicheroTest(){
        //Esta es la parte de arrange "preparar el cof¡digo"
        LectorFichero lector=new LectorFichero(new File("noexiste.txt"));
        //actuar ACT
        Assertions.assertThrows(FileNotFoundException.class,() ->{
            lector.leerLineas();
        });
    }

}
