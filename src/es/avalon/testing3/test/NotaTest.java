package es.avalon.testing3.test;


import es.avalon.testing3.Nota;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class NotaTest {
    @Test
    @DisplayName("comprobar que la nota esta aprobada")
    public void notaAprobadaTest(){
        Nota nota= new Nota("matematicas",8);

        boolean aprobada= nota.esAporbado();

        assertTrue(aprobada);
    }
}
