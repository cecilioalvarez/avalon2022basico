package es.avalon.testing3.test;

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
    @DisplayName("añadir nota a alumo Test")
    public  void addNotaTest(){
        Alumno alumno =new Alumno("pedro");

        alumno.addNota(new Nota("matematicas", 7));

        assertEquals(1,alumno.getNotas().size());
    }

    @Test
    @DisplayName("nota media del alumno")
    public  void notaMediaTest(){

        Alumno alumno =new Alumno("pedro");

        alumno.addNota(new Nota("matematicas", 7));
        alumno.addNota(new Nota("matematicas", 3));
        alumno.addNota(new Nota("matematicas", 5));

        assertEquals(5,alumno.notaMedia(),0.1);

    }


    @Test
    @DisplayName("nota mayor del alumno")
    public  void notaMayorTest(){

        Alumno alumno =new Alumno("pedro");

        alumno.addNota(new Nota("matematicas", 7));
        alumno.addNota(new Nota("matematicas", 3));
        alumno.addNota(new Nota("matematicas", 5));

        assertEquals(new Nota("matematicas", 7),alumno.mayorNota());
    }

    @Test
    @DisplayName("Numero de aprobados test")
    public  void numeroAprobadosTest(){
        Alumno alumno =new Alumno("pedro");
        List<Nota> notas= new ArrayList<>();

        Nota nota1 = mock(Nota.class);
        when(nota1.esAporbado()).thenReturn(true);

        Nota nota2 = mock(Nota.class);
        when(nota2.esAporbado()).thenReturn(true);

        Nota nota3 = mock(Nota.class);
        when(nota3.esAporbado()).thenReturn(false);

        notas.add(nota1);
        notas.add(nota2);
        notas.add(nota3);

        alumno.setNotas(notas);


        assertEquals(2,alumno.notasAprobadas());
    }
}
