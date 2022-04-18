package es.avalon.testing.test;

import es.avalon.testing.Rectangulo;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.testng.AssertJUnit.assertEquals;

@DisplayName("Test sobre la clase rectangulo")
public class RectanguloTest2 {

    Rectangulo rectangulo1;
    Rectangulo rectangulo2;

    @BeforeEach
    public void setUp() {

        rectangulo1= new Rectangulo(2,2);
        rectangulo2= new Rectangulo(4,3);
    }

    @DisplayName("Test calculo Area del Rectangulo")
    @org.junit.jupiter.api.Test
    public void rectanguloCalculoAreaTest() {


        Assertions.assertEquals(4,rectangulo1.area());
        Assertions.assertEquals(12,rectangulo2.area());
    }
    @org.junit.jupiter.api.Test
    @DisplayName("Test calculo Perimetro del Rectangulo")
    public void rectanguloCalculoPerimetroTest() {

        Assertions.assertEquals(8,rectangulo1.perimetro());
        Assertions.assertEquals(14,rectangulo2.perimetro());
    }

    @DisplayName("Test Area para valores de lado 0")
    @org.junit.jupiter.api.Test
    public void rectanguloCalculoAreaLadosCeroTest() {

        Rectangulo rectangulo1= new Rectangulo(0,0);
        Rectangulo rectangulo2= new Rectangulo(0,2);
        Rectangulo rectangulo3= new Rectangulo(2,0);
        Assertions.assertEquals(0,rectangulo1.area());
        Assertions.assertEquals(0,rectangulo2.area());
        Assertions.assertEquals(0,rectangulo3.area());
    }

    @DisplayName("Test Lanzamientor de Excepcion calculo Area lado negativo")
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
    }}