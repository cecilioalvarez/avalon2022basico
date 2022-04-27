package es.avalon.testing3.test;

import es.avalon.testing3.Nota;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class NotaTest {

    @Test
    @DisplayName("comprobar que una nota esta  aprobada")
    public void notaAprobadaTest() {
        //arrange de preparar el codigo para el test
        Nota nota= new Nota("matematicas",7);

        // la parte de Act

        boolean aprobada= nota.esAprobado();

        // confirmacion

        assertTrue(aprobada);

    }

}
