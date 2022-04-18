package es.avalon.testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RectanguloTest2 {

    Rectangulo rectangulo;
    Rectangulo rectangulo2;

    public void setup(){

    }


        @Test
        public void rectanguloCalculoAreaTest(){
            Rectangulo r = new Rectangulo(2,2);
            assertEquals(4, r.area());
        }
        @Test
        public void rectanguloCalculoPerimetroTest(){

            Rectangulo r = new Rectangulo(2,2);
            assertEquals( 8, r.perimetro());
        }
        @Test
        public void rectanguloCalculoAreaExceptioTest(){
            Rectangulo rectangulo1 = new Rectangulo(-1, 0);
            Exception exception = assertThrows(Exception.class, () ->{
                rectangulo1.area();
            });
        }
    }
