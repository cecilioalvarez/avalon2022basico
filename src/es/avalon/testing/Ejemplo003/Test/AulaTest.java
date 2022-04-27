package es.avalon.testing.Ejemplo003.Test;

import es.avalon.testing.Ejemplo003.Alumno;
import es.avalon.testing.Ejemplo003.Aula;
import es.avalon.testing.Ejemplo003.Nota;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AulaTest {

    @DisplayName("Test nota media aula")
    @Test
    public void notaMediaAulaTest(){
        //Con ogjetos reales
        Aula a=new Aula(1);
        Alumno e=new Alumno("Jose");
        e.addNota(new Nota("Matematicas1",4));
        e.addNota(new Nota("Matematicas2",4));
        e.addNota(new Nota("Matematicas3",4));
        Alumno e1=new Alumno("Pepe");
        e1.addNota(new Nota("Matematicas4",4));
        e1.addNota(new Nota("Matematicas5",4));
        e1.addNota(new Nota("Matematicas6",4));
        Alumno e2=new Alumno("Ana");
        e2.addNota(new Nota("Matematicas7",4));
        e2.addNota(new Nota("Matematicas8",4));
        e2.addNota(new Nota("Matematicas9",4));
        a.addAlumno(e);
        a.addAlumno(e1);
        a.addAlumno(e2);
        System.out.println(a.getAlumnos().size());
        System.out.println(e.notaMedia());
        System.out.println(e1.notaMedia());
        System.out.println(e2.notaMedia());
        System.out.println(e.getNotas().get(1).getAsignatura());


        assertEquals(4,a.notaMediaAula());

        //Con objetos mock
        Aula a1=new Aula(2);
        Alumno n=mock (Alumno.class);
        Alumno n1=mock (Alumno.class);
        Alumno n2=mock (Alumno.class);
        when(n.notaMedia()).thenReturn(7.0);
        when(n1.notaMedia()).thenReturn(6.0);
        when(n2.notaMedia()).thenReturn(8.0);
        a1.addAlumno(n);
        a1.addAlumno(n1);
        a1.addAlumno(n2);
        assertEquals(7,a1.notaMediaAula());
    }
}
