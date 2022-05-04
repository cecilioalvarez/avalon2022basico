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

public class TestAlumno {

    @Test
    @DisplayName("Añadir nota a Alumno Test")
    public void addNotaTest(){
        //arrange
        Alumno alumno=new Alumno("valeria");
        //act actuar,ejecutar
        alumno.addNota(new Nota("matematicas",7));
        //assert o confirmacion
        assertEquals(1,alumno.getNotas().size());
    }

    @Test
    @DisplayName("Numero de Aprobados Test")
    public void numeroAprobadosTest(){
        //arrange
        Alumno alumno=new Alumno("valeria");
        List<Nota> notas=new ArrayList<Nota>();
        //act actuar,ejecutar

        Nota nota1=(mock(Nota.class));
        when(nota1.esAprobado()).thenReturn(true);

        Nota nota2=(mock(Nota.class));
        when(nota2.esAprobado()).thenReturn(true);

        Nota nota3=(mock(Nota.class));
        when(nota3.esAprobado()).thenReturn(false);

        notas.add(nota1);
        notas.add(nota2);
        notas.add(nota3);
        alumno.setNotas(notas);



        //assert o confirmacion
        assertEquals(2,alumno.notasAprobadas());
    }

    @Test
    @DisplayName("Calculo de Media")
    public void notaMediaTest(){
        //arrange
        Alumno alumno=new Alumno("valeria");
        List<Nota> notas=new ArrayList<Nota>();
        //act actuar,ejecutar

        alumno.addNota(new Nota("fisica",7));
        alumno.addNota(new Nota("fisica",5));
        alumno.addNota(new Nota("fisica",3));


        //assert o confirmacion
        assertEquals(5,alumno.notaMedia(),0.1);
    }
    @Test
    @DisplayName("Calculo Nota mayor")
    public void notaMayorTest(){
        //arrange
        Alumno alumno=new Alumno("valeria");
        List<Nota> notas=new ArrayList<Nota>();
        //act actuar,ejecutar

        alumno.addNota(new Nota("fisica",7));
        alumno.addNota(new Nota("fisica",5));
        alumno.addNota(new Nota("fisica",3));


        //assert o confirmacion
        assertEquals(new Nota("fisica",7),alumno.notaMayor());
    }


}
