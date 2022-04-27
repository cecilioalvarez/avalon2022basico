package es.avalon.testing.ejemplo05Alumnos.test;

import es.avalon.testing.ejemplo05Alumnos.Nota;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NotaTest {

    @Test
    @DisplayName("Comprobar que una nota esta aprobada")
    public void notaAprobadaTest(){

        //Arrange (Preparar el codigo para el Test)
        Nota nota1 = new Nota("Matematicas", 8);
        Nota nota2 = new Nota("Matematicas", 5);
        Nota nota3 = new Nota("Matematicas", 2);

        //ACT (Gestionar la funcion)
        boolean aprobada1 = nota1.esAprobado();
        boolean aprobada2 = nota2.esAprobado();
        boolean aprobada3 = nota3.esAprobado();

        //Assert
        assertTrue(aprobada1);
        assertTrue(aprobada2);
        assertFalse(aprobada3);
    }
}
