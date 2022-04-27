package es.avalon.testing3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class NotaTest {
    @Test
    @DisplayName("Una nota esta aprobada")

    public void notaAprobadaTest() {

        Nota nota = new Nota("matematicas", 8);
        Nota nota2 = new Nota("Lenguaje", 5);


        boolean aprobada = nota.esAprobado();
        boolean aprobada2 = nota2.esAprobado();

        assertTrue(aprobada);
        assertTrue(aprobada2);
    }
}
