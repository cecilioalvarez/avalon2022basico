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
    @DisplayName("Añadir nota a Alumno Test")
    public void removeNotaTest() {

        //Arrange
        Alumno alumno = new Alumno("Pedro");

        //Act
        alumno.addNota(new Nota("Matematicas", 7));
        alumno.removeNota(new Nota("Matematicas", 7));


        //Assert
        assertEquals(0, alumno.getNotas().size());

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


        //////ACT//////

        alumno.addNota(new Nota("Matematicas", 7));
        alumno.addNota(new Nota("Matematicas", 8));
        alumno.addNota(new Nota("Matematicas", 2));
        alumno.addNota(new Nota("Matematicas", 7));


        //////ASSERT//////
        assertEquals(6, alumno.notaMedia());

    }


    @Test
    @DisplayName("Nota mayor del alumno")
    public void notaMayorTest() {

        //////ARRANGE//////
        Alumno alumno = new Alumno("Pedro");


        //////ACT//////

        alumno.addNota(new Nota("Ingles", 7));
        alumno.addNota(new Nota("Matematicas", 9));
        alumno.addNota(new Nota("Lengua", 2));
        alumno.addNota(new Nota("Fisica", 7));


        //////ASSERT//////
        assertEquals(new Nota("Matematicas", 9), alumno.mayorNota());
    }

}
