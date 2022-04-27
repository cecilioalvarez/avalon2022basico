package es.avalon.testing.Ejemplo003.Test;

import es.avalon.testing.Ejemplo003.Alumno;
import es.avalon.testing.Ejemplo003.Nota;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AlumnoTest {

    @Test
    @DisplayName("comprobar que se añade nota")
    public void addNotaTest(){

        //arrange
        Alumno alumno=new Alumno("Jose");
        //act
        alumno.addNota(new Nota("Matematicas",7));
        //assert
        assertEquals(1,alumno.getNotas().size());
    }
    @DisplayName("Comprobacion de si suma los aprobados")
    @Test
    public void notasAprobadasTest(){

        //arrange
        Alumno alumno=new Alumno("Jose");
        List<Nota>notas=new ArrayList<>();
        Nota nota1=mock(Nota.class);
        when(nota1.esAprovado()).thenReturn(true);
        Nota nota2=mock(Nota.class);
        when(nota2.esAprovado()).thenReturn(true);
        Nota nota3=mock(Nota.class);
        when(nota3.esAprovado()).thenReturn(false);
        notas.add(nota1);
        notas.add(nota2);
        notas.add(nota3);
        alumno.setNotas(notas);

//        alumno.addNota(new Nota("Matematicas",7));
//        alumno.addNota(new Nota("Lengua",6));
//        alumno.addNota(new Nota("Ingles",4));

//        alumno.notasAprobadas();

        assertEquals(2,alumno.notasAprobadas());
    }
    @DisplayName("test nota media")
    @Test
    public void notaMediaTest(){
        Alumno alumno=new Alumno("Pedro");
        alumno.addNota(new Nota("Matematicas",7));
        alumno.addNota(new Nota("Lengua",6));
        alumno.addNota(new Nota("Ingles",4));

        assertEquals(5.66,alumno.notaMedia(),0.1);
    }

}
