package es.avalon.testing3.test;

import es.avalon.testing3.Alumno;
import es.avalon.testing3.Nota;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestNota {

    @Test
    @DisplayName("comprobar que una nota esta aprobada")
    public void notaAprobadaTest(){
        //Arrange de preparar el codigo para el test
        Nota nota=new Nota("matematicas",7);
        Nota nota2=new Nota("matematicas",5);
        //la parte de act

        boolean aprobada= nota.esAprobado();
        boolean aprobada2= nota.esAprobado();

        //confirmacion

        assertTrue(aprobada);
        assertTrue(aprobada2);
    }

    @Test
    @DisplayName("Calculo de Media")
    public void notaMediaTest(){
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

}
