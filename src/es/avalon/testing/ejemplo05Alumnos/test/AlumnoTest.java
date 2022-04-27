package es.avalon.testing.ejemplo05Alumnos.test;

import es.avalon.testing.ejemplo05Alumnos.Alumno;
import es.avalon.testing.ejemplo05Alumnos.Nota;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Not;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class AlumnoTest {

    @Test
    @DisplayName("Añadir nota a Alumno Test")
    public void addNotaTest() {

        //Arrange
        Alumno alumno = new Alumno("Pedro");

        //Act
        alumno.addNota(new Nota("Matematicas", 7));


        //Assert
        assertEquals(1, alumno.getNotas().size());

    }

    @Test
    @DisplayName("Numero de aprobados test")
    public void numeroAprobadosTest() {

        //////ARRANGE//////
        Alumno alumno = new Alumno("Pedro");
        List<Nota> notas = new ArrayList<>();

        //////ACT//////

        //Creamos varios objetos mock donde controlamos el resultado
        Nota nota1 = mock(Nota.class);
        when(nota1.esAprobado()).thenReturn(true);

        Nota nota2 = mock(Nota.class);
        when(nota2.esAprobado()).thenReturn(true);

        Nota nota3 = mock(Nota.class);
        when(nota3.esAprobado()).thenReturn(false);

        notas.add(nota1);
        notas.add(nota2);
        notas.add(nota3);
        alumno.setNotas(notas);


        //////ASSERT//////
        assertEquals(2, alumno.notasAprobadas());

    }

    @Test
    @DisplayName("Nota media alumno")
    public void notaMediaTest() {

        //////ARRANGE//////
        Alumno alumno = new Alumno("Pedro");
        List<Nota> notas = new ArrayList<>();

        //////ACT//////

        notas.add(new Nota("Matematicas", 7));
        notas.add(new Nota("Matematicas", 8));
        notas.add(new Nota("Matematicas", 2));
        notas.add(new Nota("Matematicas", 7));

        alumno.setNotas(notas);


        //////ASSERT//////
        assertEquals(6, alumno.notaMedia());

    }
}
