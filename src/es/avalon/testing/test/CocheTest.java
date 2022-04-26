package es.avalon.testing.test;

import es.avalon.testing.Coche;
import es.avalon.testing.Motor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CocheTest {

    @Test
    public  void CochePotenciaTest(){
        Motor m= mock(Motor.class);
        when(m.getPotencia()).thenReturn(109.5);
        Coche c= new Coche("ausi",m);
        assertEquals(100,c.getPotencia(),1);
    }
}
