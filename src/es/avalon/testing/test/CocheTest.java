package es.avalon.testing.test;
import es.avalon.testing.Coche;
import es.avalon.testing.Motor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CocheTest {

    @Test

    public void CochePotenciaTest() {

        //genera un objeto ficticio
        Motor m=mock(Motor.class);
        //150*0.73=109,5
        // rellena el objeto mock con una simulacion de valor
        when(m.getPotencia()).thenReturn(109.5);
        //System.out.println(m.getPotencia());

        Coche c= new Coche("audi",m);

        assertEquals(100,c.getPotencia(),1);




    }
}