package es.avalon.testing3.test;

import es.avalon.testing3.Alumno;
import es.avalon.testing3.Nota;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlumnoTest {

    @Test
    @DisplayName("Añadir nota a Alumno test")
    public void addNotaTest() {
        //arrange
        Alumno alumno= new Alumno("pedro");
        //act actuar ,ejecutar
        alumno.addNota(new Nota("matetaticas",7));
        //assert o confirmacion
        assertEquals(1,alumno.getNotas().size());

    }
}
