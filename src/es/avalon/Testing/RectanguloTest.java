package es.avalon.Testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectanguloTest {

    //Una anotación es un símbolo que añade un simbolo y un texto
    //Esto añade funcionalidad dinámica al texto
    //de tal manera que pueda hacer cosas adicionales

    @Test
    public void rectanguloCalculoAreaTest(){

        Rectangulo r= new Rectangulo(2,2);
        assertEquals(4,r.area());

    }
    @Test
    public void rectanguloCalculoPerimetroTest(){

        Rectangulo r2= new Rectangulo(2,2);
        assertEquals(8,r2.perimetro());

    }

}
