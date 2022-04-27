package es.avalon.testing3.test;

import es.avalon.testing3.Alumno;
import es.avalon.testing3.Aula;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AulaTest {
    @Test
    @DisplayName("media de notas del aula")
    public  void notaMediaAulaAlumnos(){
        Aula aula= new Aula(1);
        Alumno a1= mock(Alumno.class);
        when(a1.notaMedia()).thenReturn(5.1);

        Alumno a2= mock(Alumno.class);
        when(a1.notaMedia()).thenReturn(7.3);

        Alumno a3= mock(Alumno.class);
        when(a1.notaMedia()).thenReturn(6.2);

        aula.addAlumno(a1);
        aula.addAlumno(a2);
        aula.addAlumno(a3);

        assertEquals(6.2,aula.notaMedia());

    }

    @Test
    @DisplayName("añadir alumno al aula")
    public  void addAlumnoAlAula(){
        Aula aula= new Aula(1);
        Alumno a1= mock(Alumno.class);


        aula.addAlumno(a1);

    }
}
