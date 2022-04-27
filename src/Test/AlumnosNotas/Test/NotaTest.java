package Test.AlumnosNotas.Test;

import Test.AlumnosNotas.Nota;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NotaTest {
    @Test
    @DisplayName("Operación suma")
    void notaTest() {
        Nota n = new Nota("matematicas",8.0);
        assertTrue(n.esAprobado());

    }
}
