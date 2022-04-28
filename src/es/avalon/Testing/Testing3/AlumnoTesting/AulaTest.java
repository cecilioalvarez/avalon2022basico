package es.avalon.Testing.Testing3.AlumnoTesting;

import es.avalon.Testing.Testing3.Alumno;
import es.avalon.Testing.Testing3.Aula;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AulaTest {

    @Test
    @DisplayName("media de notas del aula")
    public void notaMediaAulaAlumnos() {

        //arrange
        Aula aula= new Aula(1);
        Alumno alum= mock(Alumno.class);
        when(alum.notaMedia()).thenReturn(5.1);
        Alumno alum2= mock(Alumno.class);
        when(alum2.notaMedia()).thenReturn(7.3);
        Alumno alum3= mock(Alumno.class);
        when(alum3.notaMedia()).thenReturn(6.2);

        aula.addAlumno(alum);
        aula.addAlumno(alum2);
        aula.addAlumno(alum3);
        assertEquals(6.2,aula.notaMedia(),0.1);

    }

    @Test
    @DisplayName("añadir un alumno al aula")
    public void addAlumnoAlAula() {

        //arrange
        Aula aula= new Aula(1);
        Alumno alum= new Alumno("pedro");
        aula.addAlumno(alum);
        assertEquals (1,aula.getAlumnos().size());


    }


}
