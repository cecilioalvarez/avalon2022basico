package es.avalon.Testing;

import es.avalon.Objetos.EjercicioRectangulo.Rectangulo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RectanguloTest {


    // anotacion es un simbolo que añade un @ y un texto
    // esa anotación añade funcionalidad dinamica al metodo
    // d tal forma que el metodo pueda hacer cosas adicionales
    @Test
    public void rectanguloCalculoAreaTest() {

        Rectangulo rectangulo1= new Rectangulo(2,2);
        Rectangulo rectangulo2= new Rectangulo(4,3);
        assertEquals(4,rectangulo1.area());
        assertEquals(12,rectangulo2.area());
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
    public void rectanguloCalculoAreaExceptionTest() {

        Rectangulo rectangulo1= new Rectangulo(-1,0);
        // expresiones lambda
        Exception exception = assertThrows(Exception.class, () -> {
            rectangulo1.area();
        });

    }

    @Test
    public void rectanguloCalculoPerimetroTest() {

        Rectangulo r= new Rectangulo(2,2);
        Rectangulo r2= new Rectangulo(3,2);
        assertEquals(8,r.perimetro());
        assertEquals(10,r2.perimetro());
    }

}
