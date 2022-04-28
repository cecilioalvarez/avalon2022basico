package es.avalon.Testing.Testing3.AlumnoTesting;

import es.avalon.Testing.Testing3.Nota;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class NotaTest {

    @Test
    @DisplayName("comprobar que una nota esta  aprobada")

    public void notaAprobadaTest() {

        //arrange de preparar el codigo para el test

        Nota nota= new Nota("matematicas",7.0);
        Nota nota1= new Nota("lengua",5.0);

        // la parte de Act

        boolean aprobada= nota.esAprobado();
        boolean aprobada1= nota1.esAprobado();

        // confirmacion

        assertTrue(aprobada);
        assertTrue(aprobada1);

    }


}
