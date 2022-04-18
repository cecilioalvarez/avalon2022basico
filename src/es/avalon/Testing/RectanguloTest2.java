package es.avalon.Testing;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Test sobre la clase rectangulo")
public class RectanguloTest2 {

        //@Test
        // anotacion es un simbolo que añade un @ y un texto
        // esa anotación añade funcionalidad dinamica al metodo
        // d tal forma que el metodo pueda hacer cosas adicionales

        Rectangulo rectangulo1;
        Rectangulo rectangulo2;

        //Inicializando valores del Rectangulo"
        @BeforeEach
        public void setUp(){
            rectangulo1=new Rectangulo(2,2);
            rectangulo2=new Rectangulo(4,3);
        }
        @DisplayName("Test Calculo Area del Rectangulo")
        @Test
        public void rectanguloCalculoAreaTest() {

            assertEquals(4,rectangulo1.area());
            assertEquals(12,rectangulo2.area());
        }
        @DisplayName("Test Calculo Perimetro del Rectangulo")
        @Test
        public void rectanguloCalculoPerimetroTest() {

            assertEquals(8,rectangulo1.perimetro());
            assertEquals(14,rectangulo2.perimetro());
        }
        //Reseteo valores del Rectangulo
        @AfterEach
        public void tearDown(){
            rectangulo1=null;
            rectangulo2=null;
        }

}
