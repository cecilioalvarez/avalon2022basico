package es.avalon.testing.test;

import es.avalon.testing.Coche;
import es.avalon.testing.Motor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CocheTest {

    @Test
    public  void CochePotenciaTest(){
        Coche c= new Coche("ausi",new Motor(150));
        assertEquals(100,c.getPotencia(),1);
    }
}
