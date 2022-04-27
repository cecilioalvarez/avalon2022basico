package es.avalon.testing3.Test;

import es.avalon.testing3.Alumno;
import es.avalon.testing3.Nota;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AlumnoTest {


    @Test
    @DisplayName("Añadir nota a alumno test")

    public void notaMediaTest(){
        //Arrange
        Alumno alumno = new Alumno("Pedro");
        //Act ejecutar
        alumno.addNota(new Nota("matematicas",9));
        alumno.addNota(new Nota("matematicas",2));
        alumno.addNota(new Nota("matematicas",4));

        //Asssert Confirmacion
        assertEquals(1, alumno.notaMedia(),0.1);
        assertEquals(1, alumno.notaMedia(),0.1);
    }


    @Test
    @DisplayName("Añadir nota a alumno test")

    public void notaMayorTest(){
        //Arrange
        Alumno alumno = new Alumno("Pedro");
        //Act ejecutar
        alumno.addNota(new Nota("matematicas",9));
        alumno.addNota(new Nota("matematicas",2));
        alumno.addNota(new Nota("matematicas",4));

        //Asssert Confirmacion
        assertEquals(new Nota("matematicas",7),alumno.notaMayor());

    }


    @Test
    @DisplayName("Añadir nota a alumno test")

    public void addNotaTest(){
        Alumno alumno = new Alumno("Pedro");
        //Act ejecutar
        alumno.addNota(new Nota("matematicas",9));
        alumno.addNota(new Nota("matematicas",2));
        alumno.addNota(new Nota("matematicas",4));

        //Asssert
        assertEquals(1, alumno.getNotas().size());
        assertEquals(1, alumno.getNotas().size());
    }

    public void numeroAprobadosTest(){
        Alumno alumno = new Alumno("pedro");
        List<Nota> notas = new ArrayList<Nota>();
        Nota nota1 = mock(Nota.class);
        when(nota1.esAprobado()).thenReturn(true);
        Nota nota2 = mock(Nota.class);
        when(nota2.esAprobado()).thenReturn(true);
        Nota nota3 = mock(Nota.class);
        when(nota3.esAprobado()).thenReturn(true);
        notas.add(nota1);
        notas.add(nota2);
        notas.add(nota3);
        alumno.setNotas(notas);
    }
}
