package es.avalon.Testing.Testing3.AlumnoTesting;

import es.avalon.Testing.Testing3.Alumno;
import es.avalon.Testing.Testing3.Nota;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AlumnoTest {

    @Test
    @DisplayName("Añadir nota a Alumno test")
    public void addNotaTest() {
        Alumno alumno= new Alumno("pedro");
        alumno.addNota(new Nota("matematicas",7.0));
        assertEquals(1,alumno.getNotas().size());

    }

    @Test
    @DisplayName("numero de aprobados")
    public void numeroAprobadosTest() {
        Alumno alumno= new Alumno("pedro");
        List<Nota> notas = new ArrayList<>();
        Nota nota1= mock(Nota.class);
        when(nota1.esAprobado()).thenReturn(true);
        Nota nota2= mock(Nota.class);
        when(nota2.esAprobado()).thenReturn(true);
        Nota nota3= mock(Nota.class);
        when(nota3.esAprobado()).thenReturn(true);


        notas.add(nota1);
        notas.add(nota2);
        notas.add(nota3);
        alumno.setNotas(notas);


        assertEquals(3,alumno.notasAprobadas());

    }

    @Test
    @DisplayName("nota media del alumno")
    public void notaMediaTest() {

        Alumno alumno= new Alumno("David");
        alumno.addNota(new Nota("matematicas",7.0));
        alumno.addNota(new Nota("matematicas",1.0));
        alumno.addNota(new Nota("matematicas",3.0));
        alumno.addNota(new Nota("matematicas",4.0));
        alumno.addNota(new Nota("matematicas",7.0));

        assertEquals(4.5,alumno.notaMedia(),0.1);

    }

    @Test
    @DisplayName("nota maxima del alumno")
    public void notaMasAltaTest() {

        Alumno alumno= new Alumno("David");
        alumno.addNota(new Nota("matematicas",7.0));
        alumno.addNota(new Nota("matematicas",1.0));
        alumno.addNota(new Nota("matematicas",3.0));
        alumno.addNota(new Nota("matematicas",4.0));
        alumno.addNota(new Nota("matematicas",9.0));

        assertEquals(9.0,alumno.notaMasAlta(),0.1);

    }

    @Test
    @DisplayName("nota minima del alumno")
    public void notaMasBajaTest() {

        Alumno alumno= new Alumno("David");
        alumno.addNota(new Nota("matematicas",7.0));
        alumno.addNota(new Nota("matematicas",1.0));
        alumno.addNota(new Nota("matematicas",3.0));
        alumno.addNota(new Nota("matematicas",4.0));
        alumno.addNota(new Nota("matematicas",9.0));

        assertEquals(1.0,alumno.notaMasBaja(),0.1);

    }


}
