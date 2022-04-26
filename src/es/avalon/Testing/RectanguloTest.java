package es.avalon.Testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RectanguloTest {

    @Test
    public void rectanguloAreaTest (){
        Rectangulo r = new Rectangulo(2,2);
        assertEquals(4, r.area());
    }
    @Test
    public void rectanguloCalculoPerimetroTest () {
        Rectangulo r = new Rectangulo(2,2);
        Rectangulo r2 = new Rectangulo(3,2);
        assertEquals(8, r.perimetro());
        assertEquals(10, r2.perimetro());
    }

    @Test
    public void rectanguloCalculoAreaExcepcionTest (){
        Rectangulo rectangulo1 = new Rectangulo(-1,0);
        //Exprension Lambda
        Exception exception = assertThrows(Exception.class, () -> {
            rectangulo1.area();
        });

    }

    @Test
    public void rectanguloCalculoPerimetroTest2() {

        Rectangulo r= new Rectangulo(2,2);
        Rectangulo r2= new Rectangulo(3,2);
        assertEquals(8,r.perimetro());
        assertEquals(10,r2.perimetro());
    }

}
