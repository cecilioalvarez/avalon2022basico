package es.avalon.testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectanguloTest {


    //Anotacion es un simbolo que añade @ y un texto
    //Esta anotacion añade funcionalidad dinamica al metodo
    //De tal forma que el metodo pueda hacer cosas adicionales
    @Test
    public void areaTest(){

        Rectangulo r = new Rectangulo(2,2);

        //
        assertEquals(4,r.area());
    }
}
