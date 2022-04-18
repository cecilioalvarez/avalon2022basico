package es.avalon.Testing;

import org.junit.jupiter.api.AfterAll;
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

            assertEquals(4,rectangulo1.area());
            assertEquals(12,rectangulo2.area());
        }

        @Test
        public void rectanguloCalculoPerimetroTest() {

            assertEquals(8,rectangulo1.perimetro());
            assertEquals(14,rectangulo2.perimetro());
        }

        @AfterAll
        public void tearDown(){
            rectangulo1=null;
            rectangulo2=null;
        }

}
