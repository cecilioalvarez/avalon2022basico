package es.avalon.testing2;

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
    public void leerLineasTest(){
        //Arrange preparar el codigo
        LectorFichero lector = new LectorFichero(new File("gastos.txt"));

        //Actuar ACT
        try {
            List<String> lineas = lector.leerLineas();
            //Verificar Assert
            assertTrue(lineas.size()>=1);
            assertTrue(lineas.get(0).contains("empresa"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
