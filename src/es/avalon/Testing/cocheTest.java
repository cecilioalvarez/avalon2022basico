package es.avalon.Testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class cocheTest {


    @Test
    public void CochePotenciaTest(){

        //genera un objeto ficticio
        Motor m=mock(Motor.class);
        //150*0.73 = 109.5
        when(m.getPotencia()).thenReturn(109.5);

        Coche c = new Coche("audi",new Motor(150));

        assertEquals(100,c.getPotencia(),1);
    }
}
