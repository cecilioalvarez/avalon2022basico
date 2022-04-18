package es.avalon.testing.Test;

import es.avalon.testing.Rectangulo;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RectanguloTest2 {

    Rectangulo rectangulo1;
    Rectangulo rectangulo2;

    @BeforeEach
    public void setUp() {

        rectangulo1= new Rectangulo(2,2);
        rectangulo2= new Rectangulo(4,3);
    }

    @Test
    public void rectanguloCalculoAreaTest() {


        assertEquals(4,rectangulo1.area());
        assertEquals(12,rectangulo2.area());
    }
    @Test
    public void rectanguloCalculoPerimetroTest() {

        assertEquals(8,rectangulo1.perimetro());
        assertEquals(14,rectangulo2.perimetro());
    }

    @Test
    public void rectanguloCalculoAreaLadosCeroTest() {

        Rectangulo rectangulo1= new Rectangulo(0,0);
        Rectangulo rectangulo2= new Rectangulo(0,2);
        Rectangulo rectangulo3= new Rectangulo(2,0);
        assertEquals(0,rectangulo1.area());
        assertEquals(0,rectangulo2.area());
        assertEquals(0,rectangulo3.area());
    }

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
