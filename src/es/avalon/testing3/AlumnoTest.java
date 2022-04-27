package es.avalon.testing3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.xml.crypto.AlgorithmMethod;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AlumnoTest {

    @Test
    @DisplayName("Vamos a añadir notas a Alumno test")

    public void addNotaText() {

        //arrange
        Alumno alumno = new Alumno("Pedro");
        List<Nota> notas = new ArrayList<>();
        //act
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
        //assert
        assertEquals(1, alumno.getNotas().size());
    }
    @Test
    @DisplayName("Vamos a calcular la media de notas")

    public void addNotaMediaText() {

        //arrange
        Alumno alumno = new Alumno("Pedro");

        //act

        alumno.addNota(new Nota("Matematicas", 7));
        alumno.addNota(new Nota("Lengua", 5));
        alumno.addNota(new Nota("Historia", 3));

        //assert
        assertEquals(5, alumno.notaMedia(), 0.1);
    }
}
