package es.avalon.testing2.test;

import es.avalon.testing2.LectorFichero;
import org.junit.jupiter.api.Test;

import java.io.File;

public class LectorFicheroTest {

    @Test
    public void leerLineasTest() {

        LectorFichero lector= new LectorFichero(new File("gastos.text"));



    }
}
