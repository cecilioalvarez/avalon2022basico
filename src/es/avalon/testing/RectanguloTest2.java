package es.avalon.testing;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Test sobre el calculo de areas del cuadrado")
public class RectanguloTest2 {

    Rectangulo rectangulo1;
    Rectangulo rectangulo2;

    @BeforeEach
    public void setUp() {

        rectangulo1= new Rectangulo(2,2);
        rectangulo2= new Rectangulo(4,3);
    }
    @DisplayName("Test sobre el calculo de area del Rectangulo")

    @Test
    public void rectanguloCalculoAreaTest() {


        assertEquals(4,rectangulo1.area());
        assertEquals(12,rectangulo2.area());
    }
    @DisplayName("Test sobre el calculo de perimetro del rectangulo")

    @Test
    public void rectanguloCalculoPerimetroTest() {

        assertEquals(8,rectangulo1.perimetro());
        assertEquals(14,rectangulo2.perimetro());
    }

    @DisplayName("Test sobre el calculo de areas con valor 0")

    @Test
    public void rectanguloCalculoAreaLadosCeroTest() {

        Rectangulo rectangulo1= new Rectangulo(0,0);
        Rectangulo rectangulo2= new Rectangulo(0,2);
        Rectangulo rectangulo3= new Rectangulo(2,0);
        assertEquals(0,rectangulo1.area());
        assertEquals(0,rectangulo2.area());
        assertEquals(0,rectangulo3.area());
    }
    @DisplayName("Test sobre captura de Excepciones con lados negativos")

    @Test
    public void rectanguloCalculoAreaExcepcionTest() {

        Rectangulo rectangulo1= new Rectangulo(-1,0);
        // expresiones lambda
        Exception exception = assertThrows(Exception.class, () -> {
            rectangulo1.area();
        });
    }


    @AfterEach
    public  void tearDown() {

        rectangulo1=null;
        rectangulo2=null;
    }
}
