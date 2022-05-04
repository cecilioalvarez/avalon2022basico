package es.avalon.testing3.test;

import es.avalon.testing3.Alumno;
import es.avalon.testing3.Aula;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestAula {

    @Test
    @DisplayName("media de notas del aula")
    public void notaMediaAulaAlumnos() {

        //arrange
        Aula aula= new Aula(1);
        Alumno alumno1= mock(Alumno.class);
        when(alumno1.notaMedia()).thenReturn(5.1);
        Alumno alumno2= mock(Alumno.class);
        when(alumno2.notaMedia()).thenReturn(7.3);
        Alumno alumno3= mock(Alumno.class);
        when(alumno3.notaMedia()).thenReturn(6.2);

        aula.addAlumno(alumno1);
        aula.addAlumno(alumno2);
        aula.addAlumno(alumno3);
        assertEquals(6.2,aula.notaMedia(),0.1);

    }

    @Test
    @DisplayName("añadir un alumno al aula")
    public void addAlumnoAlAula() {

        //arrange
        Aula aula= new Aula(1);
        Alumno a1= new Alumno("pedro");
        aula.addAlumno(a1);
        assertEquals (1,aula.getAlumnos().size());


    }

}
