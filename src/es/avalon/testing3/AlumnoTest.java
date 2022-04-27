package es.avalon.testing3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.xml.crypto.AlgorithmMethod;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlumnoTest {

    @Test
    @DisplayName("Vamos a añadir notas a Alumno test")

    public void addNotaText() {

        //arrange
        Alumno alumno = new Alumno( "Pedro");

        //act

        alumno.addNota(new Nota("matematica", 5));

        //assert

        assertEquals(1, alumno.getNotas().size());

    }
}
