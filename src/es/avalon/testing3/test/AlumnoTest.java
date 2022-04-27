package es.avalon.testing3.test;

import es.avalon.testing3.Alumno;
import es.avalon.testing3.Nota;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlumnoTest {
    @Test
    @DisplayName("añadir nota a alumo Test")
    public  void addNotaTest(){
        Alumno alumno =new Alumno("pedro");

        alumno.addNota(new Nota("matematicas", 8));

        assertEquals(1,alumno.getNotas().size());
    }
}
