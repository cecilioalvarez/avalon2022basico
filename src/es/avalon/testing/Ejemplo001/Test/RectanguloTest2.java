package es.avalon.testing.Ejemplo001.Test;

import es.avalon.testing.Ejemplo001.Rectangulo;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Test sobre la clase rectangulo")

public class RectanguloTest2 {
    Rectangulo rectangulo1;
    Rectangulo rectangulo2;

    @BeforeEach
    public void setUp() {
        rectangulo1 = new Rectangulo(2, 3);
        rectangulo2 = new Rectangulo(2, 2);
    }

    @DisplayName("Test calculo de area del rectangulo")
    @Test


    public void areaTest() {


        assertEquals(6, rectangulo1.area());
        assertEquals(4, rectangulo2.area());

    }

    @DisplayName("Test calculo perimetro del rectangulo")
    @Test
    public void rectanguloCalculoPerimetroTest() {

        assertEquals(10, rectangulo1.perimetro());
        assertEquals(8, rectangulo2.perimetro());
    }

    @DisplayName("Test para area del rectangulo con lado cero")
    @Test
    public void rectanguloCalculoAreaLadoCero() {
        Rectangulo r = new Rectangulo(0, 0);
        Rectangulo r1 = new Rectangulo(0, 1);
        Rectangulo r2 = new Rectangulo(2, 0);
        assertEquals(0, r.area());
        assertEquals(0, r1.area());
        assertEquals(0, r2.area());
    }

    @DisplayName("Test para lanzamiento de excepcion en caso de lado negativo")
    @Test
    public void rectangulocalculoAreaExcepcionTest() {
        Rectangulo rectangulo = new Rectangulo(-1, 0);
        //Expresiones lambda
        Exception excepcion = assertThrows(Exception.class, () -> {
            rectangulo.area();
        });

    }

    @AfterEach
    //Aqui hemos reseteado las variables por si tuvieramos que realizar nuevas pruebas que lo requiriesen
    public void tearDown() {
        rectangulo1 = null;
        rectangulo2 = null;

    }
}



