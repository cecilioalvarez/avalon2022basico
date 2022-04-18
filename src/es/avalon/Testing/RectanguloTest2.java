package es.avalon.Testing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RectanguloTest2 {

        //@Test
        // anotacion es un simbolo que añade un @ y un texto
        // esa anotación añade funcionalidad dinamica al metodo
        // d tal forma que el metodo pueda hacer cosas adicionales

        Rectangulo rectangulo1;
        Rectangulo rectangulo2;

        @BeforeEach
        public void setUp(){
            rectangulo1=new Rectangulo(2,2);
            rectangulo2=new Rectangulo(4,3);
        }

        @Test
        public void rectanguloCalculoAreaTest() {

            rectangulo1= new Rectangulo(2,2);
            rectangulo2= new Rectangulo(4,3);
            assertEquals(4,rectangulo1.area());
            assertEquals(12,rectangulo2.area());
        }

        @Test
        public void rectanguloCalculoPerimetroTest() {

            Rectangulo r= new Rectangulo(2,2);
            Rectangulo r2= new Rectangulo(3,2);
            assertEquals(8,r.perimetro());
            assertEquals(10,r2.perimetro());
        }
}
