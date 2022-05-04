package es.avalon.testing3.test;


import es.avalon.testing3.Alumno;
import es.avalon.testing3.Nota;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AlumnoTest {

    @Test
    @DisplayName("Nota media del Alumno")
    public void notaMediaTest() {
        //arrange
        Alumno alumno= new Alumno("pedro");
        //act actuar ,ejecutar
        alumno.addNota(new Nota("matetaticas",7));
        alumno.addNota(new Nota("matetaticas",3));
        alumno.addNota(new Nota("matetaticas",5));
        //assert o confirmacion
        assertEquals(5,alumno.notaMedia(),0.01);

    }

    @Test
    @DisplayName("Nota mayor del alumno")
    public void notaMayorTest() {
        //arrange
        Alumno alumno= new Alumno("pedro");
        //act actuar ,ejecutar
        alumno.addNota(new Nota("matematicas",7));
        alumno.addNota(new Nota("matematicas",3));
        alumno.addNota(new Nota("matematicas",5));
        System.out.println(alumno.mayorNota().getAsignatura());
        assertEquals(new Nota("matematicas",7),alumno.mayorNota());

    }



    @Test
    @DisplayName("Añadir nota a Alumno test")
    public void addNotaTest() {
        //arrange
        Alumno alumno= new Alumno("pedro");
        //act actuar ,ejecutar
        alumno.addNota(new Nota("matetaticas",7));
        //assert o confirmacion
        assertEquals(1,alumno.getNotas().size());

    }

    @Test
    @DisplayName("Numero de Aprobados test")
    public void numeroAprobadosTest() {
        //arrange
        Alumno alumno= new Alumno("pedro");
        List<Nota> notas= new ArrayList<Nota>();
        Nota nota1=mock(Nota.class);
        when(nota1.esAprobado()).thenReturn(true);
        Nota nota2=mock(Nota.class);
        when(nota2.esAprobado()).thenReturn(true);
        Nota nota3=mock(Nota.class);
        when(nota3.esAprobado()).thenReturn(false);
        notas.add(nota1);
        notas.add(nota2);
        notas.add(nota3);
        alumno.setNotas(notas);


        //act actuar ,ejecutar



        //assert o confirmacion
        assertEquals(2,alumno.notasAprobadas());

    }

}
