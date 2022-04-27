package es.avalon.testing3;

import es.avalon.testing4.Aula;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AulaTest {

    @Test
    @DisplayName("Media de notas del aula")

    public void notaMediaAulaAlumnos() {

        Aula aula = new Aula(2);

        Alumno a1 = mock (Alumno.class);
        when(a1.notaMedia()).thenReturn(5.1);
        Alumno a2 = mock (Alumno.class);
        when(a2.notaMedia()).thenReturn(7.3);
        Alumno a3 = mock (Alumno.class);
        when(a3.notaMedia()).thenReturn(6.2);

        aula.addAlumno(a1);
        aula.addAlumno(a2);
        aula.addAlumno(a3);
    }
}
