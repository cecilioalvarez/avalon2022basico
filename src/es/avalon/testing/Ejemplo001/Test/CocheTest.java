package es.avalon.testing.Ejemplo001.Test;

import es.avalon.testing.Ejemplo001.Coche;
import es.avalon.testing.Ejemplo001.Motor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CocheTest {

    @Test

    public void CochePotenciaTest(){
        Motor m=mock(Motor.class);
        //150*0.73=109.5
        //rellena el objeto mock con una simulacion de valor
        when(m.getPotencia()).thenReturn(109.5);
        //construyo el coche c con el  motor mock m
        Coche c=new Coche("Audi",m);
        assertEquals(100,c.getPotencia(),1);
    }
}
