package es.avalon.Testing2.Test;

import es.avalon.Testing2.LectorFichero;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LectorFicheroTest {


    @Test
    @DisplayName("Leer lineas de fichero")
    public void leerLineasTest() {
        //Arrange, preparar el codigo
        LectorFichero lector = new LectorFichero(new File("gastos.txt"));
        //ACT, actuacion del test
        try {
            List<String> lineas = lector.leerlineas();
            assertTrue(lineas.size()>=1);
            assertTrue(lineas.get(0).contains("empresa"));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    @DisplayName("Leer lineas de fichero vacio")
    public void leerLineasFicheroVacioTest() {
        //Arrange, preparar el codigo
        LectorFichero lector = new LectorFichero(new File("gastosVacio.txt"));
        //ACT, actuacion del test
        try {
            List<String> lineas = lector.leerlineas();
            assertTrue(lineas.size()==0);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    @Test
    @DisplayName("Leer lineas de fichero vacio")
    public void noExisteFicheroTest() {
        //Arrange, preparar el codigo
        LectorFichero lector = new LectorFichero(new File("noexiste.txt"));
        //ACT, actuacion del test
            Assertions.assertThrows(FileNotFoundException.class,() ->{
                lector.leerlineas();
        });

    }
}
