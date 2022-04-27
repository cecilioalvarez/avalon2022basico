package Test.AlumnosNotas.Test;

import Test.AlumnosNotas.Estudiante;
import Test.AlumnosNotas.Nota;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class EstudianteTest {
    @Test
    @DisplayName("cantidad de notas")
    public void testAlumno(){
        Estudiante est = new Estudiante("Andres");
        est.addNota(new Nota("matematicas",7.0));
        System.out.println(est.getNotas().size());
        assertEquals(1,est.getNotas().size());
    }

    @Test
    @DisplayName("cantidad de notas")
    public void NumeroDeAprobados(){
       /****preparar el test*****/
        Estudiante est = new Estudiante("Andres");
        List<Nota> notas = new ArrayList<>();
       Nota nota1 =mock(Nota.class);
       when(nota1.esAprobado()).thenReturn(true);
        Nota nota2 =mock(Nota.class);
        when(nota2.esAprobado()).thenReturn(true);
        Nota nota3 =mock(Nota.class);
        when(nota3.esAprobado()).thenReturn(false);
        /******ACT (actuar)*********/
        notas.add(nota1);
        notas.add(nota2);
        notas.add(nota3);
        est.setNotas(notas);
        System.out.println(est.getNotas().size());

        /*********confirmas validar*********/
        assertEquals(2,est.notasAprobadas());
    }

}