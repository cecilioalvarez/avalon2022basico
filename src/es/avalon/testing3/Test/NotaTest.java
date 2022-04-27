package es.avalon.testing3.Test;

import es.avalon.testing3.Nota;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class NotaTest {
    @Test
    @DisplayName("Comprobar que una nota esta aprobada")
    public void notaAprobadaTest(){
        //arrange de preparar el codigo para el test
        Nota nota = new Nota("matematicas",7);
        Nota nota2 = new Nota("matematicas",5);

        boolean aprobado = nota.esAprobado();
        boolean aprobado2 = nota2.esAprobado();

        //Confirmacion
        assertTrue(aprobado);
        assertTrue(aprobado2);

    }
}
