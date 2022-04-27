package Test.AlumnosNotas;

import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Not;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AulaTest {

    @Test
    void notaMediaAula() {
        /********arrange**/
        Estudiante est1 = new Estudiante("Andres");
        List<Nota> notas1 = Arrays.asList(new Nota("mate",10.0),new Nota("mate",20.0),new Nota("mate",30.0));
        Estudiante est2 = new Estudiante("Andres");
        List<Nota> notas2 = Arrays.asList(new Nota("mate",10.0),new Nota("mate",20.0),new Nota("mate",30.0));
        Aula au = new Aula("Aula1");

        /********ACT actuar********/        est1.setNotas(notas1);
        est2.setNotas(notas2);
        au.addEstudiante(est1);
        au.addEstudiante(est2);

        /*********confirmas validar*********/
        System.out.println(au.notaMediaAula());
        assertEquals(20,au.notaMediaAula());

    }
}