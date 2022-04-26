package es.avalon.testing2.test;

import es.avalon.testing2.LectorFichero;
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
    public void leerLineasTest(){
        LectorFichero lector = new LectorFichero(new File("gastos.txt"));
        List<String> lineas=lector.leerLineas();
        assertTrue(lineas.size()>=3);
        assertTrue(lineas.get(0).contains("empresa"));

    }

}
