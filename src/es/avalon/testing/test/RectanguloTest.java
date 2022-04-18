package es.avalon.testing.test;

import es.avalon.testing.Rectangulo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.testng.AssertJUnit.assertEquals;

public class RectanguloTest {
    @org.junit.jupiter.api.Test
    public void rectanguloCalculoAreaTest() {

        Rectangulo rectangulo1= new Rectangulo(2,2);
        Rectangulo rectangulo2= new Rectangulo(4,3);
        Assertions.assertEquals(4,rectangulo1.area());
        Assertions.assertEquals(12,rectangulo2.area());
    }

    @org.junit.jupiter.api.Test
    public void rectanguloCalculoAreaLadosCeroTest() {

        Rectangulo rectangulo1= new Rectangulo(0,0);
        Rectangulo rectangulo2= new Rectangulo(0,2);
        Rectangulo rectangulo3= new Rectangulo(2,0);
        Assertions.assertEquals(0,rectangulo1.area());
        Assertions.assertEquals(0,rectangulo2.area());
        Assertions.assertEquals(0,rectangulo3.area());
    }

    @org.junit.jupiter.api.Test
    public void rectanguloCalculoAreaExcepcionTest() {

        Rectangulo rectangulo1= new Rectangulo(-1,0);
        // expresiones lambda
        Exception exception = assertThrows(Exception.class, () -> {
            rectangulo1.area();
        });



    }
    @Test
    public void rectanguloCalculoPerimetroTest() {

        //arrange (inicializar)
        Rectangulo r= new Rectangulo(2,2);
        Rectangulo r2= new Rectangulo(3,2);

        // actuar
        double area= r.perimetro();
        double area2= r2.perimetro();


        // confirmar comprobar
        Assertions.assertEquals(8,area);
        Assertions.assertEquals(10,area2);
    }
}
