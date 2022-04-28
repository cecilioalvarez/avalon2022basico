package es.avalon.testing.ejemplo05Alumnos.test;

import es.avalon.testing.ejemplo05Alumnos.Alumno;
import es.avalon.testing.ejemplo05Alumnos.Aula;
import es.avalon.testing.ejemplo05Alumnos.Nota;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AulaTest {


    @Test
    @DisplayName("Nota media del aula")
    public void notaMediaAula(){

        //////ARRANGE//////
        Aula aula = new Aula(1);

        Alumno alumno1 = mock(Alumno.class);
        when(alumno1.notaMedia()).thenReturn(5.0);
        Alumno alumno2 = mock(Alumno.class);
        when(alumno2.notaMedia()).thenReturn(4.5);
        Alumno alumno3 = mock(Alumno.class);
        when(alumno3.notaMedia()).thenReturn(3.5);


        //////ACT//////
        aula.addAlumno(alumno1);
        aula.addAlumno(alumno2);
        aula.addAlumno(alumno3);



        //////ASSERT//////
        assertEquals(4.3, aula.notaMediaAlumnos(), 0.1);

    }


    @Test
    @DisplayName("añadir un alumno al aula")
    public void addAlumnoAlAula() {
        //////ARRANGE//////
        Aula aula= new Aula(1);
        Alumno a1= new Alumno("pedro");
        Alumno a2 = new Alumno ("Antonio");

        //////ACT//////
        aula.addAlumno(a1);
        aula.addAlumno(a2);

        //////ASSERT//////
        assertEquals (2,aula.getAlumnoList().size());
    }


}
